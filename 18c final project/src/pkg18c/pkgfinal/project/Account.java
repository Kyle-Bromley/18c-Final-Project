/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18c.pkgfinal.project;

/**
 *
 * @author uclak
 */
public class Account implements iAccount{
    private String fullName;
    private double checkingBalance;
    private double savingsBalance;
    private int pin;

    @Override
    public void depositChecking(double amount) {
        double depositCheckingAmount = amount;
        double CheckingBalance = 0;
        double newCheckingBalance;
        
        newCheckingBalance = CheckingBalance + depositCheckingAmount;
    }

    @Override
    public void withdrawlChecking(double amount) {
        double withdrawalCheckingAmount = amount;
        double checkingBalance = 0;
        double newCheckingBalance;
        
        newCheckingBalance = checkingBalance - withdrawalCheckingAmount;
        
    }

    @Override
    public void depositSavings(double amount) {
        double depositSavingsAmount = amount;
        double SavingsBalance = 0;
        double newSavingsBalance;
        
        newSavingsBalance = SavingsBalance + depositSavingsAmount;
    }

    @Override
    public void withdrawlSavings(double amount) {
        double withdrawalSavingsAmount = amount;
        double SavingsBalance = 0;
        double newSavingsBalance;
        
        newSavingsBalance = SavingsBalance - withdrawalSavingsAmount;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the checkingBalance
     */
    public double getCheckingBalance() {
        return checkingBalance;
    }

    /**
     * @param checkingBalance the checkingBalance to set
     */
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    /**
     * @return the savingsBalance
     */
    public double getSavingsBalance() {
        return savingsBalance;
    }

    /**
     * @param savingsBalance the savingsBalance to set
     */
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    /**
     * @return the pin
     */
    public int getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(int pin) {
        this.pin = pin;
    }
    
}
