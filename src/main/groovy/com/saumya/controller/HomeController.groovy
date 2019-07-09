package com.saumya.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.View

import static io.micronaut.http.HttpResponse.ok

@Controller("/home")
class HomeController {

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
}
