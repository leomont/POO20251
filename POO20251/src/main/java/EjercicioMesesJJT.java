package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();

        int dias;

        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;

            case 2: // Febrero
                dias = 28; // Consideramos año no bisiesto por simplicidad
                break;
                
            default:
                dias = -1; // Mes inválido
                break;
        }

        if (dias == -1) {
            System.out.println("Mes inválido.");
        } else {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        }

        sc.close();
    }
}