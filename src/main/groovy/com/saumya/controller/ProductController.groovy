package com.saumya.controller

import com.saumya.CO.ProductCO
import com.saumya.service.ProductService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

import javax.inject.Inject

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


}
