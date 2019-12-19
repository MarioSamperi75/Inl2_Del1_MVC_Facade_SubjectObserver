package se.nackademin.model;


public class Recipe {

//VARIABLES
    private String recipeName;

//--------------------------------------------
//CONSTRUCTOR
    public Recipe(String recipeName){
        this.recipeName = recipeName;
    }

//--------------------------------------------
//METHODS
    public String getRecipeName() {
        return recipeName;
    }
}