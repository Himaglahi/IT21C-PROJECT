/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankAccount;

/**
 *
 * @author PC
 */
public class Main {
    
    public static void main(String[] args) {

        Bank m = new Bank();
        m.setName("MJ obsid Magsalos");
        m.setAge(19);
        m.setAccNum(143143);
        m.setBalance(1.5, 2);

        System.out.println("CHINA BANK!" + "\n" + "Name:" + m.getName() + "\n" + "Age:" + m.getAge() + "\n" + "Account Number:" + m.getaccNum() + "\n" + "Balance:" + m.getBalance());

    }
    
    
      
}
