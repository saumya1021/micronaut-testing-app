package com.saumya.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.views.View

import static io.micronaut.http.HttpResponse.ok
@Secured("isAnonymous()")
@Controller("/")
class PublicController {

    @Get("/")
    @View("/host")
    HttpResponse host(){
        return ok()
    }

}
