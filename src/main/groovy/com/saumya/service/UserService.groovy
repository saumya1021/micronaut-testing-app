package com.saumya.service

import com.saumya.CO.RegisterCO
import com.saumya.CO.LoginCO
import com.saumya.domain.User
import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(User)
class UserService {

    @Transactional
    Map save(RegisterCO registerCO) {
        User user = new User(
                username: registerCO.username,
                firstName: registerCO.firstName,
                lastName: registerCO.lastName,
                password: registerCO.password.md5(),
                isActive: true
        )
        user.save()
        return [:]
    }

    @Transactional
    boolean fetchUser(LoginCO loginco) {
        User user = User.findByUsernameAndPassword(loginco.username, loginco.password.md5())
        if (user) {
            println(user.username)
            return true
        } else {
            return false

        }
    }
}
