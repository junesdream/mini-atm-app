package com.rainbowdev.board;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{

    ATM atm = new ATM(0, 0, 0);
    Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Balance : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, " Withdraw Amount");
                System.out.println("Withdraw Amount : " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance");
            }
        } else{
            System.out.println("Please enter amount in multiples of 500");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, " Deposit Amount");
        System.out.println(depositAmount + " deposited");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m : ministmt.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
