package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello JavaBank ATM! Version control with Git ");

        //Operadores
        //Aritmeticos
        double balance = 125.00;
        int pin = 1234;
        double newBalance = balance + 200.00; // Depósito
        System.out.println(newBalance);

        //Asignacion
        balance += 50.00; // Asignación compuesta --> balance = balance + 50
        System.out.println(balance);

        //Operadores logicos
        if (balance > 0 && pin == 1234) {
            System.out.println("Acceso Concedido");
        }

        //Unarios
        balance++;
        System.out.println(balance);

        //Ternarios
        String status = (balance < 0) ? "Deuda" : "Crédito";
        //logica: si balance es menor que cero se estable en deduda de lo contrario es credito
        System.out.println(status);

        //EJEMPLO DE OPERADORES
        double maintenanceFee=10.25;
        if (balance < 500) {
            balance -= maintenanceFee;
            System.out.println(balance);
        }
    }
}