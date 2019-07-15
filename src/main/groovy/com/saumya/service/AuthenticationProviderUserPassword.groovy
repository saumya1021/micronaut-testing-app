package com.saumya.service

import io.micronaut.security.authentication.*
import io.reactivex.Flowable
import org.reactivestreams.Publisher

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthenticationProviderUserPassword implements AuthenticationProvider {

    @Inject
    UserService userService

    @Override
    public Publisher<AuthenticationResponse> authenticate(AuthenticationRequest authenticationRequest) {
        if (userService.fetchUser(authenticationRequest.getIdentity().toString(), authenticationRequest.getSecret().toString())) {
            UserDetails userDetails = new UserDetails((String) authenticationRequest.getIdentity(), new ArrayList<>())
            return Flowable.just(userDetails)
        }
        return Flowable.just(new AuthenticationFailed())
    }
}
