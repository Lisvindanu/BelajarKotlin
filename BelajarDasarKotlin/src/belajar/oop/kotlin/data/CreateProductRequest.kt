package belajar.oop.kotlin.data

import belajar.oop.kotlin.annotations.NotBlank

data class CreateProductRequest(@NotBlank val id:String,
    @NotBlank val name:String,
    @NotBlank val price:Long)

data class CreateCategoryRequest(
    @NotBlank val id:String,
    @NotBlank val name:String
)