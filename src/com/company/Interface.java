package com.company;
import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int inputNumeric)
    {
        int totalSum = 0;
        int counter = 1;

        while(counter <= inputNumeric)
        {
            if(inputNumeric % counter == 0)
            {
                totalSum += counter;
            }
            counter++;
        }
        return totalSum;
    }
}

public class Interface {
    public static void isInterface() {
        MyCalculator calculator = new MyCalculator();
        System.out.print("Enter your number to calculate : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print(calculator.divisor_sum(number) + "\n");
    }
}
