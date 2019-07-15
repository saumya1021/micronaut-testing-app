package com.saumya.controller

import com.saumya.CO.ProductCO
import com.saumya.service.ProductService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule

import javax.inject.Inject

@Secured(SecurityRule.IS_AUTHENTICATED)
@Controller("/product")
class ProductController {

    @Inject
    ProductService productService

    @Post(value = "/add{?productCO*}", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    HttpResponse add(ProductCO productCO) {
        productService.save(productCO)
        return HttpResponse.redirect(URI.create("/home/profile"))
    }

    @Post(value = "/update", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    HttpResponse update(Long productId, String productName, String productModel, Long productPrice) {
        productService.updateProduct(productId, productName, productModel, productPrice)
        return HttpResponse.redirect(URI.create("/home/profile"))
    }

    @Post(value = "/delete", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    HttpResponse delete(Long deleteId) {
        productService.deleteProduct(deleteId)
        return HttpResponse.redirect(URI.create("/home/profile"))
    }


}
