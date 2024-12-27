package edu.ucu.ua;

import edu.ucu.ua.traskone.ATM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner in = new Scanner(System.in);

        if (in.hasNextDouble()) {
            double number = in.nextDouble();
            
            if (number % 1 != 0) {
                System.out.println("Input integer number, please");
            } else if (number <= 0) {
                System.out.println("Input integer number more than 0.");
            } else {
                atm.process((int) number);
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
