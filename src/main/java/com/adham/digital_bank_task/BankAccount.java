/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adham.digital_bank_task;

/**
 *
 * @author LAPTOPS HOUSE
 */
public abstract class BankAccount {
    protected int accountnumber;
    protected double balance;
    protected String customerName;
    protected abstract void withdraw(double amount);
     protected abstract void deposite(double amount);
     public BankAccount(int accountnumber,String customerName,double balance){
         this.accountnumber=accountnumber;
         this.customerName=customerName;
         this.balance=balance;
     }
}
