package com.mercadolivro.enums

enum class Erros(val code: String, val message: String) {

    ML000("ML-000", "Unauthorized"),
    ML001("ML-001", "Invalid Request"),
    ML101("ML-101", "Book [%s] not found"),
    ML102("ML-102", "Cannot update book with status [%s"),
    ML201("ML-201", "Customer [%s] not found")
}