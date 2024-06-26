package com.example.recipeapp.presentation.favorite_screen

import com.example.recipeapp.domain.model.Recipe

data class RecipeState(
    val recipes: List<Recipe> = emptyList(),
    val isLoading: Boolean = false,
    val error: String = ""
)
