package com.djamware

class Product {

    String prodCode
    String prodName
    String prodModel
    String prodDesc
    String prodImageUrl
    Double prodPrice

    static constraints = {
        prodCode nullable: false, blank: false
        prodName nullable: false, blank: false
        prodModel nullable: false, blank: false
        prodDesc nullable: false, blank: false
        prodImageUrl nullable: true
        prodPrice nullable: false, blank: false
    }

    String toString() {
        prodName
    }
}
