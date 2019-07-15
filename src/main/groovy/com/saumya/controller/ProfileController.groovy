package com.saumya.controller

import com.saumya.CO.LoginCO
import com.saumya.service.UserService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.security.annotation.Secured
import io.micronaut.views.View

import javax.inject.Inject

@Secured("isAnonymous()")
@Controller("/profile")
class ProfileController {

    @Inject
    UserService userService

    /*@Post(value = "/login{?loginCO*}", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    HttpResponse fetchUser(LoginCO loginCO) {
        if (userService.fetchUser(loginCO))
            return HttpResponse.redirect(URI.create("/home/profile"))
        else
            return HttpResponse.redirect(URI.create("/home/authFailed"))
    }*/

    @Get(value = "/index", consumes = MediaType.APPLICATION_FORM_URLENCODED)
    @View("/profile/index")
    HttpResponse index() {
        return HttpResponse.ok()
    }


}