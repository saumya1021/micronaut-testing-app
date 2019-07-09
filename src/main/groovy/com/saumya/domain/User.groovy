package com.saumya.domain

import grails.gorm.annotation.Entity

@Entity
class User {

    String username
    String firstName
    String lastName
    String password
    Boolean isActive
    Date dateCreated
    Date lastUpdated

    static mapping = {
        table name: 'app_user'
    }

    static constraints = {
        lastName nullable: true
        username unique: true
    }


}
