import java.security.SecureRandom;
import java.util.Scanner;

public class SimulacionLanzamientoDados {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            SecureRandom random = new SecureRandom();

            System.out.print("Ingrese el número de lanzamientos: ");
            long lanzamientos = scanner.nextLong();

            // Variables para contar la frecuencia de cada cara
            long frecuencia1 = 0;
            long frecuencia2 = 0;
            long frecuencia3 = 0;
            long frecuencia4 = 0;
            long frecuencia5 = 0;
            long frecuencia6 = 0;

            // Simulación de lanzamientos
            for (long i = 0; i < lanzamientos; i++) {
                int cara = 1 + random.nextInt(6); // Genera un número entre 1 y 6

                switch (cara) {
                    case 1 -> frecuencia1++;
                    case 2 -> frecuencia2++;
                    case 3 -> frecuencia3++;
                    case 4 -> frecuencia4++;
                    case 5 -> frecuencia5++;
                    case 6 -> frecuencia6++;
                }
            }

            // Imprimir resultados
            System.out.printf("%nCara	Frecuencia%n");
            System.out.printf("1	%d%n", frecuencia1);
            System.out.printf("2	%d%n", frecuencia2);
            System.out.printf("3	%d%n", frecuencia3);
            System.out.printf("4	%d%n", frecuencia4);
            System.out.printf("5	%d%n", frecuencia5);
            System.out.printf("6	%d%n", frecuencia6);

            scanner.close();
        }
    }


