package se.nackademin.view;


import se.nackademin.controller.Controller;

import java.util.Scanner;

public class View {

//METHODS
    public void start(){
        Controller controller = new Controller(this);
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("                    *****Italian Restaurant*****");

        while (true) {
            System.out.println();
            System.out.println("New menu(n) - Add recipe(a) - Remove recipe(r) - Show menu(s) - Exit(e)");
            String input = scanner.nextLine();
            switch (input) {
                case "n":
                    System.out.print("Add name for the new menu: ");
                    input = scanner.nextLine();
                    controller.addMenu(input);
                    break;
                case "a":
                    System.out.print("Add recipe: ");
                    input = scanner.nextLine();
                    controller.addRecipe(input);
                    break;
                case "r":
                    System.out.print("Add recipe you want to remove: ");
                    input = scanner.nextLine();
                    controller.removeRecipe(input);
                    break;
                case "s":
                    controller.showMenu();
                    break;
                case "e":
                    controller.exit();
                    break;
                default:
                    System.out.println("Input error. Retry");
            }
        }
    }
}