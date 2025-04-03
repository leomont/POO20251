import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantas operaciones queire realizar:");
        int opcion = scanner.nextInt();

        for (int i = 1; i <= opcion ; i++) {

            System.out.println("Ingrese el primer número (Operación " + i +")");
            int primerNumero = scanner.nextInt();
            System.out.println("Ingrese el segundo número (Operación " + i +")");
            int segundoNumero = scanner.nextInt();
            System.out.println("Elija una operación para la operación " + i +": +,-,*,/");
            String operacion = scanner.next();

            switch (operacion) {
                case "+":
                    double suma = primerNumero + segundoNumero;
                    System.out.println("Resultado de la operación" + i +": " + suma);
                    break;
                case "-":
                double resta = primerNumero - segundoNumero;
                System.out.println("Resultado de la operación" + i +": " + resta);
                break;
                case "*":
                    double multiplicacion = primerNumero * segundoNumero;
                    System.out.println("Resultado de la operación" + i +": " + multiplicacion);
                    break;
                case "/":
                    double divicion = primerNumero / segundoNumero;
                    System.out.println("Resultado de la operación" + i +": " + divicion);
                    break;

                }
             }
        }
    }