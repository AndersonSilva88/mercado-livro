package com.mercadolivro.controller.request

import com.mercadolivro.enums.CustomerStatus
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.validation.EmailAvailable
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty

data class PostCustomerRequest (

    @field:NotEmpty(message = "Nome dever ser informado")
    var name: String,
    @field:Email(message = "Email deve ser valido")
    @EmailAvailable
    var email: String,

    @field:NotEmpty(message = "Senha deve ser informada")
    var password: String
)
