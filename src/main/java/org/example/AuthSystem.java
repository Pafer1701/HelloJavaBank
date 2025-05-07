package org.example;

import java.util.Scanner;

public class AuthSystem {
    public static boolean authenticateUser(int pin){
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while(attempts < 3){
            System.out.println("Ingrese su PIN: ");
            int inputPin = scanner.nextInt();

            if(pin == inputPin){
                System.out.println("Autenticación exitosa");
                return true;
            }else{
                attempts++;
                System.out.println("PIN INCORRECTO. Intento " + attempts + " de 3.");
            }
        }
        System.out.println("Acceso denegado se supero el numero de intentos.");
        return false;
    }

}
