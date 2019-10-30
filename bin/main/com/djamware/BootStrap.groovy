package com.djamware

import com.djamware.User
import com.djamware.Role
import com.djamware.UserRole

class BootStrap {

    def init = { servletContext ->
        new Role(authority: 'ROLE_ADMIN').save()
        new Role(authority: 'ROLE_USER').save()
        new Product(prodCode: 'P0001', prodName: 'iPhone', prodModel: 'XS', prodDesc: '', prodImageUrl: 'https://ibox.co.id/media/catalog/product/cache/3/image/9df78eab33525d08d6e5fb8d27136e95/i/p/iphonexs-max-gold_3_1.png', prodPrice: 999)
    }
    def destroy = {
    }
}
