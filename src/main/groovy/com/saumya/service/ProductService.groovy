package com.saumya.service

import com.saumya.CO.ProductCO
import com.saumya.domain.Product
import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Product)
class ProductService {

    @Transactional
    Map save(ProductCO productCO) {
        Product product = new Product(name: productCO.name, model: productCO.model, price: productCO.price, isActive: true)
        product.save()
        return [:]
    }

}
