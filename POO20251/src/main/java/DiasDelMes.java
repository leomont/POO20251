import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        int dias;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;

            case 4: case 6: case 9: case 11:
                dias = 30;

            case 2:
                dias = 28; // No se considera años bisiestos en este caso
                System.out.println("Mes de 28 dias");
                break;
            default:
                System.out.println("Mes no válido. Ingrese un número entre 1 y 12.");
                scanner.close();
                return;
        }
        


    }
}
