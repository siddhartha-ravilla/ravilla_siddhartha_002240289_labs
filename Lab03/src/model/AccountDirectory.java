/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class AccountDirectory {
    
    private ArrayList<Account> accountList;

    public AccountDirectory() {
        this.accountList = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public Account addAccount(){
        Account account = new Account();
        accountList.add(account);
        return account;    
    }
    
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    
    public Account searchAccount(String accountNumber){
        for(Account acc : accountList){
            if(acc.getAccountNumber().equals(accountNumber)){
                return acc;
            }
        }
        return null;
    }
    
    
}
