package se.nackademin.controller;

import se.nackademin.model.Facade;
import se.nackademin.view.View;

public class Controller implements IObserver {

//VARIABLES
    private Facade facade = new Facade();

//--------------------------------------------
//CONSTRUCTOR
    public Controller(View view){
        this.facade.attach(this);
    }

//--------------------------------------------
//METHODS
    public void addMenu(String input) {
        this.facade.addRestaurantMenu(input);
    }

    public void addRecipe(String input) {
        this.facade.addRecipeToMenu(input);
    }

    public void removeRecipe(String input) {
        this.facade.removeRecipeFromMenu(input);
    }

    public void showMenu() {
        System.out.println(this.facade.getMenuToString());
    }

    public void exit() {
        this.facade.exit();
    }

    @Override
    public void update(String text) {
        System.out.println(text);
    }
}