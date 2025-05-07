package org.example;

public class Main {
    public static void main(String[] args) {

        String accountNumber = "123456789";
        double balance =  2500.30;
        int pin = 1234;

        int[] transactionsAmounts = {400,-50,150};

        balance += transactionsAmounts[0];
        if (balance > 0 && pin == 1234){
            System.out.println("Acceso Concedido");
        }

        balance++; // Ajusta el saldo
        String status = (balance < 0) ? "Deuda" : "Crédito";
        System.out.println("Estado de cuenta: " + status);

    }
}