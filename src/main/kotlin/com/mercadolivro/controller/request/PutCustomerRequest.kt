package com.mercadolivro.controller.request

import jakarta.validation.constraints.NotEmpty

data class PutCustomerRequest (

    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,
    @field:NotEmpty(message = "Email deve ser valido")
    var email: String,
)