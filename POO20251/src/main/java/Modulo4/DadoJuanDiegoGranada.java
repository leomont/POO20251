import java.security.SecureRandom;
import java.util.Scanner;

public class DadoJuanDiegoGranada {
    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        int dado,con1=0,con2=0,con3=0,con4=0,con5=0,con6=0;
        System.out.print("Ingrese el número de lanzamientos: ");
        Scanner teclado=new Scanner(System.in);
        int lanzamientos=teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i <= lanzamientos; i++) {
            dado= random.nextInt(6);
            switch (dado) {
                case 1 -> con1++;
                case 2 -> con2++;
                case 3 -> con3++;
                case 4 -> con4++;
                case 5 -> con5++;
                case 6 -> con6++;
            }
        }
        System.out.println("Cantidad de 1: "+con1+"\nCantidad de 2: "+con2+"\nCantidad de 3: "+con3+"\nCantidad de 4: "+con4+"\nCantidad de 5: "+con5+
                "\nCantidad de 6: "+con6);
    }
}
