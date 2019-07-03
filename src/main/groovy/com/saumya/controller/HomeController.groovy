package com.saumya.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.View

@Controller("/home")
class HomeController {

    @Get("/index")
    @View("index")
    HttpResponse index() {
        return HttpResponse.ok()
    }

    @Get("/login")
    @View("/login")
    HttpResponse login(){
        return HttpResponse.ok()
    }

}
