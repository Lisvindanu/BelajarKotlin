package belajar.oop.kotlin.app

import belajar.oop.kotlin.Exception.ValidationException
import belajar.oop.kotlin.annotations.NotBlank
import belajar.oop.kotlin.data.CreateCategoryRequest
import belajar.oop.kotlin.data.CreateProductRequest
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties


fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

// iterate satu satu, lalu cek kalau ada annotation @NotBlank
    for (property in properties) {
        if(property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when(value) {
                is String-> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }

        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validateRequest(request)

    val request2 = CreateCategoryRequest("F", "")
    validateRequest(request2)
}
