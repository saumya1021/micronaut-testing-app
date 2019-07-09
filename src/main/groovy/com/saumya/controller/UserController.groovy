package com.saumya.controller

import com.saumya.CO.RegisterCO
import com.saumya.service.UserService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.views.View

import javax.inject.Inject

import static io.micronaut.http.HttpResponse.ok
import static io.micronaut.http.HttpResponse.uri

@Controller("/user")
class UserController {

    @Inject
    UserService userService

    @Post(value = "/create{?registerCO*}", consumes = MediaType.APPLICATION_FORM_URLENCODED, produces = MediaType.APPLICATION_JSON)
    HttpResponse register(RegisterCO registerCO) {
        Map map = userService.save(registerCO)
        return HttpResponse.redirect(URI.create("/home/registration"))
    }

}
