import java.util.*;

public class EjerciciosJuanEstebanValencia {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
    }

    public static void ejercicio1() {
        double numero1 = 89, numero2 = 323;
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.println("\n--- Ejercicio 1 ---");
        System.out.println("Número A: " + numero1 + " | Número B: " + numero2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }

    public static void ejercicio2() {
        final double TASA_DOLAR = 3895.0;
        System.out.println("\n--- Ejercicio 2 ---");
        System.out.print("Ingrese la cantidad de pesos: ");
        double pesos = teclado.nextDouble();
        double dolares = pesos / TASA_DOLAR;
        System.out.printf("Equivalente en dólares: %.2f\n", dolares);
    }

    public static void ejercicio3() {
        final double IVA_PORCENTAJE = 0.19;
        System.out.println("\n--- Ejercicio 3 ---");
        System.out.print("Ingrese el valor de la factura: ");
        double valor = teclado.nextDouble();
        double valorIVA = valor * IVA_PORCENTAJE;
        double total = valor + valorIVA;
        System.out.printf("IVA: %.2f\nTotal a pagar: %.2f\n", valorIVA, total);
    }

    public static void ejercicio4() {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        System.out.println("\n--- Ejercicio 4 ---");
        System.out.print("Ingrese el día de la semana en número (1-7): ");
        int dia = teclado.nextInt();

        if (dia >= 1 && dia <= 7) {
            System.out.println("El día es: " + dias[dia - 1]);
        } else {
            System.out.println("Número no válido.");
        }
    }

    public static void ejercicio5() {
        int[] numeros = new int[3];
        System.out.println("\n--- Ejercicio 5 ---");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println("Números ordenados: " + Arrays.toString(numeros));
    }

    public static void ejercicio6() {
        System.out.println("\n--- Ejercicio 6 ---");
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    public static void ejercicio7() {
        System.out.println("\n--- Ejercicio 7 ---");
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }

    public static void ejercicio8() {
        System.out.println("\n--- Ejercicio 8 ---");
        System.out.print("Ingrese un número para la tabla de multiplicar: ");
        int num = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void ejercicio9() {
        System.out.println("\n--- Ejercicio 9 ---");
        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = teclado.nextInt();
        int suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            suma += teclado.nextInt();
        }
        System.out.println("Suma total: " + suma);
    }

    public static void ejercicio10() {
        System.out.println("\n--- Ejercicio 10 ---");
        System.out.print("Ingrese un número: ");
        int num = teclado.nextInt();
        boolean primo = true;

        if (num <= 1) primo = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println(primo ? "Es primo." : "No es primo.");
    }

    public static void ejercicio11() {
        System.out.println("\n--- Ejercicio 11 ---");
        System.out.print("Ingrese un número: ");
        int num = teclado.nextInt();
        int factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void ejercicio12() {
        System.out.println("\n--- Ejercicio 12 ---");
        System.out.print("Ingrese una palabra o frase: ");
        teclado.nextLine(); // limpiar buffer
        String texto = teclado.nextLine();
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println("Texto invertido: " + invertido);
    }

    public static void ejercicio13() {
        System.out.println("\n--- Ejercicio 13 ---");
        System.out.print("Ingrese una palabra o frase: ");
        teclado.nextLine(); // limpiar buffer
        String texto = teclado.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
        String invertido = new StringBuilder(texto).reverse().toString();

        if (texto.equals(invertido)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
}
