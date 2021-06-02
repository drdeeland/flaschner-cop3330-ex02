package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String name = myApp.ReadInput();
        String outputString = myApp.WriteLength(name);
        myApp.PrintLength(outputString);
    }

    public String ReadInput() {
        System.out.print("What is the input string? ");
        return input.nextLine();
    }

    public String WriteLength(String name) {
        int length = name.length();
        return name + " has " + length + " characters.";
    }

    public void PrintLength(String outputString) {
        System.out.println(outputString);
    }
}
