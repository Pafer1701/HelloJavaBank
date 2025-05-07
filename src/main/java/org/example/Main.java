package org.example;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JavaBank ATM! Version control with Git");
        // Tipo de datos
        // Primitivos: Todos estos ocupan un espacio fijo en la memoria.

        int pin = 1234;
        double balance = 1500.75;
        boolean isActive = true;
        char initial = 'A';
        byte age = 30;
        short smallNumber = 32000;
        long bigNumber = 10000000000L;
        float temperature = 36.6f;

        // No primitivos: Nos ofrece ventajas para manipular datos almacenados, como la concatenación de texto y la búsqueda de subcadenas.

        String accountNumber = "123456789";
        int[] transactionAmounts = {100, 200, -50};
        ArrayList<String> transactions = new ArrayList<>();
        transactions.add("Deposito");
        System.out.println(transactions.get(0));

        // Mutables: Como StringBuilder, permiten cambiar su estado después de su creación

        StringBuilder account = new StringBuilder("123456");
        account.append("789"); //Añade 789 al final

        // Inmutables: Como la clase String, no cambian su estado después de ser creados

        String numberAccount = "123456";
        numberAccount = numberAccount + "789";  // Crea un nuevo objeto

    }
}