package com.saumya.domain

import grails.gorm.annotation.Entity

@Entity
class Product {
    String name
    String model
    Long price
    boolean isActive
    Date dateCreated
    Date lastUpdated

    static constraints = {
        price nullable: true
    }
}
