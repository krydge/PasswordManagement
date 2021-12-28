package com.OrangeDriver;

import com.OrangeDriver.logger.KSLogger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println ("PassWordManager");
        String menuChoice = new String();
        String [] sinks = {"File","Rolling"};
        KSLogger logger = new KSLogger(sinks);
    boolean isActive = true;
    while(isActive) {
        System.out.println("Password Manager Menu");
        System.out.println("Generate a new password: gen");
        System.out.println("Save a new password: save");
        System.out.println("Read a password: read");
        System.out.println("Read a password: end");

        menuChoice=userInput.nextLine();
        switch(menuChoice){
            case "gen":
                int minLength = 16;
                System.out.println("Generating a new Password");
                Password password = new Password(minLength);
                password.printDecryptedPassword();
                break;
            case "save":
                System.out.println("Saving a new Password");
                break;
            case "read":
                System.out.println("Reading a saved Password");
                break;
            case"end":
                System.out.println("closing the program");
                isActive = false;
                break;
            default:


        }

    }
    }
}
