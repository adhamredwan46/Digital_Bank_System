/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adham.digital_bank_task;

/**
 *
 * @author LAPTOPS HOUSE
 */
public class checkingAccount extends BankAccount{
    private final double overdraftLimit = 2000;
    public checkingAccount(double balance,int accountnumber,String customerName){
        super( accountnumber,customerName,balance);
    }
    @Override 
  public void  deposite(double amount){
    if(amount >0){
        balance+=amount;
    }
  }
  @Override
    public void withdraw(double amount){
        if(amount>0&&amount<=balance+overdraftLimit){
            balance-=amount;
        }
    }
  
  
}
