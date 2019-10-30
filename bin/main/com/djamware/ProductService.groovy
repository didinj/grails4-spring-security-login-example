package com.djamware

import grails.gorm.services.Service

@Service(Product)
interface ProductService {

    Product get(Serializable id)

    List<Product> list(Map args)

    Long count()

    void delete(Serializable id)

    Product save(Product product)

}