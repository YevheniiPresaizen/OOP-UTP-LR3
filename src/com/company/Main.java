package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("1. Java to using inheritance.\n" +
                "2. Java interface.\n" +
                "3. Java instanceof \n" +
                "Input your choice ([1-3]): ");
        String yourChoice = input.nextLine();

        switch (yourChoice) {
            case "1":
                Bird bird = new Bird();
                bird.walk();
                bird.fly();
                bird.sing();
                break;
            case "2":
                Interface.isInterface();
                break;
            case "3":
                InstanceOF.main();
                break;
        }
    }
}
