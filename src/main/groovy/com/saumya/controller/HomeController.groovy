package com.saumya.controller

import com.saumya.CO.RegisterCO
import com.saumya.service.ProductService
import com.saumya.service.UserService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.views.View

import javax.inject.Inject

import static io.micronaut.http.HttpResponse.ok

@Controller("/home")
class HomeController {

    @Inject
    ProductService productService

    @Get("/index")
    @View("index")
    HttpResponse index() {
        return ok()
    }

    @Get("/login")
    @View("/login")
    HttpResponse login() {
        return ok()
    }

    @Get("/registration")
    @View("/registration")
    HttpResponse registration() {
        return ok()
    }

    @Get("/grid")
    @View("/grid")
    HttpResponse grid() {
        return ok()
    }

    @Get("/autowidth")
    @View("/autowidth")
    HttpResponse autowidth() {
        return ok()
    }

    @Get("/profile")
    @View("/profile")
    Map profile() {
        return productService.fetchProductList()
    }


}
