import java.security.SecureRandom;
import java.util.Scanner;

public class JuanJoséToroLanzamientoDados {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de lanzamientos: ");
        long numLanzamientos = scanner.nextLong();
        scanner.close();

        long frecuencia1 = 0, frecuencia2 = 0, frecuencia3 = 0,
                frecuencia4 = 0, frecuencia5 = 0, frecuencia6 = 0;

        // Simulación de lanzamientos
        for (long i = 0; i < numLanzamientos; i++) {
            int resultado = random.nextInt(6) + 1;

            switch (resultado) {
                case 1: frecuencia1++; break;
                case 2: frecuencia2++; break;
                case 3: frecuencia3++; break;
                case 4: frecuencia4++; break;
                case 5: frecuencia5++; break;
                case 6: frecuencia6++; break;
            }
        }

        // Mostrar resultados en formato de tabla
        System.out.println("\nFace\tFrequency");
        System.out.println("1\t" + frecuencia1);
        System.out.println("2\t" + frecuencia2);
        System.out.println("3\t" + frecuencia3);
        System.out.println("4\t" + frecuencia4);
        System.out.println("5\t" + frecuencia5);
        System.out.println("6\t" + frecuencia6);
    }
}
