import java.security.SecureRandom;

public class AntonioCardonaLanzamientodeDados {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int lanzamientos = 60000000;

        // Variables de los dados
        int fr1 = 0;
        int fr2 = 0;
        int fr3 = 0;
        int fr4 = 0;
        int fr5 = 0;
        int fr6 = 0;

        // Simulación
        for (int i = 0; i < lanzamientos; i++) {
            int resultado = random.nextInt(6) + 1; // 1 y 6

            // Contabilización
            switch (resultado) {
                case 1:
                    fr1++;
                    break;
                case 2:
                    fr2++;
                    break;
                case 3:
                    fr3++;
                    break;
                case 4:
                    fr4++;
                    break;
                case 5:
                    fr5++;
                    break;
                case 6:
                    fr6++;
                    break;
            }
        }

        // tabla de finalizacion
        System.out.println("Caras      Frecuencia");
        System.out.println("1          "+ fr1);
        System.out.println("2          "+ fr2);
        System.out.println("3          "+ fr3);
        System.out.println("4          "+ fr4);
        System.out.println("5          "+ fr5);
        System.out.println("6          "+ fr6);
    }


    }
