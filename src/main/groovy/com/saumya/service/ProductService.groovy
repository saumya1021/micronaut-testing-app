package com.saumya.service

import com.saumya.CO.ProductCO
import com.saumya.domain.Product
import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Product)
class ProductService {

    @Transactional
    void save(ProductCO productCO) {
        Product product = new Product(name: productCO.name, model: productCO.model, price: productCO.price, isActive: true)
        product.save()
    }


    Map fetchProductList() {
        List<Product> productList = Product.createCriteria().list {
            eq("isActive", true)
        }
        return [productList: productList]
    }

    @Transactional
    void updateProduct(Long productId, String productName, String productModel, Long productPrice) {
        Product product = Product.get(productId)
        product.price = productPrice
        product.model = productModel
        product.name = productName
        product.save()
    }

    @Transactional
    void deleteProduct(Long productId) {
        Product product = Product.get(productId)
//        product.isActive = false
//        product.save()
        product.delete()

    }
}