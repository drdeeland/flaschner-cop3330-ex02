/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String name = myApp.ReadInput();
        String outputString = myApp.WriteLength(name);
        myApp.PrintOutput(outputString);
    }

    public String ReadInput() {
        System.out.print("What is the input string? ");
        return input.nextLine();
    }

    public String WriteLength(String name) {
        int length = name.length();
        return name + " has " + length + " characters.";
    }

    public void PrintOutput(String outputString) {
        System.out.println(outputString);
    }
}
