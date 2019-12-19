package se.nackademin.model;

import se.nackademin.controller.IObserver;
import java.util.ArrayList;
import java.util.List;

public class Facade implements IObservable {

//VARIABLES
    private RestaurantMenu restaurantMenu;
    private List<IObserver> observers = new ArrayList<>();

//--------------------------------------------
//METHODS
    public void addRestaurantMenu(String menuName) {
        this.restaurantMenu = new RestaurantMenu(menuName);
    }

    public void addRecipeToMenu(String input) {
        if (this.restaurantMenu == null)
            System.out.println("You need to create a Menu!");
        else {
            this.restaurantMenu.addRecipe(new Recipe(input));
            notify("New recipe: " + input);
        }
    }

    public void removeRecipeFromMenu(String input) {
        Recipe r= findRecipe(input);
        if (r == null)
            System.out.println("Recipe not found");
        else {
            this.restaurantMenu.removeRecipe(r);
            notify("Removed recipe: " + input);
        }
    }

    public Recipe findRecipe (String input){
        for (Recipe r: restaurantMenu.getRecipeList())
            if((r.getRecipeName()).equalsIgnoreCase(input))
                return r;
        return null;
    }

    public String getMenuToString() {
        List<Recipe> recipes = restaurantMenu.getRecipeList();
        String list = "";
        for (Recipe r : recipes) {
            list += "\n" + r.getRecipeName();
        }
        list = "Menu " + restaurantMenu.getMenuName() + ":" + list;
        return list;
    }

    public void exit(){
        System.exit(0);
    }

    public RestaurantMenu getRestaurantMenu() {
        return this.restaurantMenu;
    }

    @Override
    public void detach(IObserver iObserver) {
        this.observers.remove(iObserver);
    }

    @Override
    public void attach(IObserver iObserver) {
        this.observers.add(iObserver);
    }

    @Override
    public void notify(String text) {
        for (IObserver observer : observers) {
            observer.update(text);
        }
    }
}