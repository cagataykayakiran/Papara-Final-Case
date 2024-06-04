package com.example.recipeapp.data.repository


import com.example.recipeapp.data.remote.RecipeApi
import com.example.recipeapp.data.remote.response.toRecipeList
import com.example.recipeapp.domain.model.Recipe
import com.example.recipeapp.domain.repository.RecipeRepository

import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(
    private val recipeApi: RecipeApi,
) : RecipeRepository {

    override suspend fun getRecipes(): List<Recipe> {
        return recipeApi.getBreakfastRecipeList().toRecipeList()
    }

    override suspend fun getTypeByRecipes(diet: String): List<Recipe> {
        return recipeApi.getDietTypeRecipeList(diet).toRecipeList()
    }

    override suspend fun getRecipesByLowCalories(): List<Recipe> {
        return recipeApi.getRecipesByLowCalories().toRecipeList()
    }
}