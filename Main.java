package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nota (del 1 al 10): ");
        double nota = entrada.nextDouble();

        if (nota >= 7) {
            System.out.println("¡Aprobado!");
        } else {
            System.out.println("Desaprobado");
        }

        entrada.close();
    }
}














    }
