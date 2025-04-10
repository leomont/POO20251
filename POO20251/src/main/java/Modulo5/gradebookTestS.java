package Modulo5;

import java.util.Scanner;

// Clase principal (archivo: gradebookTestS.java)
public class gradebookTestS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibroCalificaciones libro = new LibroCalificaciones();

        String nombreCurso;
        do {
            System.out.print("Ingrese el nombre del curso: ");
            nombreCurso = sc.nextLine();
            if (nombreCurso.trim().isEmpty()) {
                System.out.println("El nombre del curso no puede estar vacío. Intente de nuevo.");
            }
        } while (nombreCurso.trim().isEmpty());

        libro.establecerNombreCurso(nombreCurso);
        libro.mostrarMensaje();

        PromedioCalificaciones promedioClase = new PromedioCalificaciones();
        promedioClase.calcularPromedio();
    }
}

// Clase que representa el libro de calificaciones
class LibroCalificaciones {
    private String nombreCurso;

    public void establecerNombreCurso(String nombre) {
        nombreCurso = nombre;
    }

    public void mostrarMensaje() {
        System.out.println("\nBienvenido al libro de calificaciones para el curso: " + nombreCurso);
    }
}

// Clase para calcular el promedio de calificaciones
class PromedioCalificaciones {
    public void calcularPromedio() {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int contador = 0;

        System.out.println("\nIngrese las calificaciones de los estudiantes (1 a 100). Ingrese -1 para finalizar:");

        while (true) {
            System.out.print("Calificación #" + (contador + 1) + ": ");
            int nota = sc.nextInt();

            if (nota == -1) break;

            if (nota >= 1 && nota <= 100) {
                total += nota;
                contador++;
            } else {
                System.out.println("Nota inválida. Debe estar entre 1 y 100.");
            }
        }

        if (contador > 0) {
            double promedio = (double) total / contador;
            System.out.printf("\nEl promedio de la clase es: %.2f%n", promedio);
        } else {
            System.out.println("\nNo se ingresaron calificaciones válidas.");
        }
    }
}
