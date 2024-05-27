package com.rainbowdev.board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AtmOperationInterf op = new AtmOperationImpl();

        int atmnumber = 12345;
        int atmpin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.println("Enter ATM number: ");
        int atmNumber = in.nextInt();
        System.out.print("Enter ATM pin: ");
        int pin = in.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int choice = in.nextInt();
                if (choice == 1) {
                    op.viewBalance();
                } else if (choice == 2) {
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (choice == 3) {
                    System.out.println("Enter Amount to Deposit: ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (choice == 4) {
                    op.viewMiniStatement();
                } else if (choice == 5) {
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Choice");
                }
            }
        } else {
            System.out.println("Wrong ATM number or pin");
            System.exit(0);
        }
    }
}