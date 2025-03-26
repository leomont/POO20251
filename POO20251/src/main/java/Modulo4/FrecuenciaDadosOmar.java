import java.security.SecureRandom;
public class FrecuenciaDadosOmar {
    public static void main(String[] args) {

        int Lanzamiento = 60000000;


        SecureRandom random = new SecureRandom();


        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0;



        for (int i = 0; i < Lanzamiento; i++) {
            int resultado = random.nextInt(6) + 1;


            switch (resultado) {
                case 1:
                    f1++;
                break;

                case 2:
                    f2++;
                    break;
                case 3:
                    f3++;
                    break;
                case 4:
                    f4++;
                    break;
                case 5:
                    f5++;
                    break;
                case 6:
                    f6++;
                    break;
            }
        }


        System.out.println("Cara   Frecuencia");
        System.out.println("1:    " + f1);
        System.out.println("2:    " + f2);
        System.out.println("3:    " + f3);
        System.out.println("4:    " + f4);
        System.out.println("4:    " + f5);
        System.out.println("6:    " + f6);
    }
}