package org.example;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa el número del mes (1-12): ");
            int mes = scanner.nextInt();


            switch (mes) {
                case 1:
                    System.out.println("Enero tiene 31 dias");
                    break;
                case 2:
                    System.out.println("Febrero tiene " + mes + "dias");
                    break;
                case 3:
                    System.out.println("Marzo tiene 31 dias");
                    break;
                case 4:
                    System.out.println("Abril tiene 30 dias");
                    break;
                case 5:
                    System.out.println("Mayo tiene 31 dias");
                    break;
                case 6:
                    System.out.println("Junio tiene 30 dias");
                    break;
                case 7:
                    System.out.println("Julio tiene 31 dias");
                    break;
                case 8:
                    System.out.println("Agosto tiene 31 dias");
                    break;
                case 9:
                    System.out.println("Septiembre tiene 31 dias");
                    break;
                case 10:
                    System.out.println("Octubre tiene 31 dias");
                    break;
                case 11:
                    System.out.println("Noviembre tiene 31 dias");
                    break;
                case 12:
                    System.out.println("Diciembre tiene 31 dias");
                    break;
            }
        }
    }