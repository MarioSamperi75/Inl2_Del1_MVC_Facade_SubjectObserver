package se.nackademin.model;


import se.nackademin.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {

//VARIABLES
    private List<Recipe> recipeList = new ArrayList<>();
    private String menuName;

//--------------------------------------------
//CONSTRUCTOR
    public RestaurantMenu(String menuName){
        this.menuName = menuName;
    }

//--------------------------------------------
//METHODS
    public String getMenuName() {
        return menuName;
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void addRecipe(Recipe recipe){
        this.recipeList.add(recipe);
    }

    public void removeRecipe(Recipe recipe){
        this.recipeList.remove(recipe);
    }

}