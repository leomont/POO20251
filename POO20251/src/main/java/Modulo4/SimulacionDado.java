/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simulaciondado;

/**
 *
 * @author buqx
 */
import java.security.SecureRandom;
import java.util.Scanner;

public class SimulacionDado {
    public static void main(String[] args) {
        // Crear objeto para números aleatorios seguros
        SecureRandom random = new SecureRandom();
        
        // Crear objeto Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el número de lanzamientos
        System.out.print("Ingrese la cantidad de veces que lanzara ese dado paisano: ");
        int totalLanzamientos = scanner.nextInt();
        scanner.close();
        
        // Contadores para cada cara del dado
        int frecuencia1 = 0;
        int frecuencia2 = 0;
        int frecuencia3 = 0;
        int frecuencia4 = 0;
        int frecuencia5 = 0;
        int frecuencia6 = 0;
        
        for (int i = 1; i <= totalLanzamientos; i++) {
            
            int cara = 1 + random.nextInt(6);
            System.out.print("En el intento numero " + i + " saco: " + cara + " , ");
            
            // Incrementar el contador correspondiente
            switch (cara) {
                case 1:
                    frecuencia1++;
                    break;
                case 2:
                    frecuencia2++;
                    break;
                case 3:
                    frecuencia3++;
                    break;
                case 4:
                    frecuencia4++;
                    break;
                case 5:
                    frecuencia5++;
                    break;
                case 6:
                    frecuencia6++;
                    break;
            }
        }
        
        // Mostrar resultados
        System.out.println("\nResultados de la simulacion:");
        System.out.println("Numero   Cantidad de veces");
        System.out.printf("1      %d%n", frecuencia1);
        System.out.printf("2      %d%n", frecuencia2);
        System.out.printf("3      %d%n", frecuencia3);
        System.out.printf("4      %d%n", frecuencia4);
        System.out.printf("5      %d%n", frecuencia5);
        System.out.printf("6      %d%n", frecuencia6);
        
        int total = frecuencia1 + frecuencia2 + frecuencia3 + 
                   frecuencia4 + frecuencia5 + frecuencia6;
        System.out.printf("\nTotal de lanzamientos: %,d%n", total);
    }
}