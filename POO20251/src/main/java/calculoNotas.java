import java.util.Scanner;

class calculoNotas{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las notas");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        if(nota1 + nota2 >=7)
            System.out.println("Aprueba");
        else if (nota1 + nota2 >=5 && nota1 + nota2 <=7)
            System.out.println("habilita");
        else
            System.out.println("Reprueba");
    }
}