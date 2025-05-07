package org.example;

public class TransactionHandler {
    public static void validateTransaction(double balance, double amountRequested, int pin, int inputPin){
        boolean hasFunds = balance > amountRequested;
        boolean pinCorrect = pin == inputPin;
        if(hasFunds && pinCorrect){
            System.out.println("Transaccion autorizada");
        }else{
            System.out.println("ERROR, Transaccion rechazada");
        }
    }
}
