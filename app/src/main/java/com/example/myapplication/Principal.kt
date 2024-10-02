package com.example.myapplication

fun main(){
    val recipe = Recipe()

    recipe.addIngredient("Rice")
    recipe.addIngredient("Chicken")
    recipe.addIngredient("Potatoes")

    println(recipe.getIngredients())
}