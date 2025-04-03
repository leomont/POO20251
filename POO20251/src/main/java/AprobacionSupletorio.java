import java.util.Scanner;

public class AprobacionSupletorio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario las notas de los trimestres
        System.out.print("Ingrese la nota del trimestre 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Ingrese la nota del trimestre 2: ");
        double nota2 = scanner.nextDouble();
        
        // Calcular la suma de las notas
        double sumaNotas = nota1 + nota2;
        
        // Evaluar con if si aprueba, presenta supletorio o reprueba
        if (sumaNotas > 7) {
            System.out.println("El estudiante ha aprobado la materia.");
        } else if (sumaNotas >= 5 && sumaNotas <= 7) {
            System.out.println("El estudiante tiene la oportunidad de presentar supletorio.");
        } else {
            System.out.println("El estudiante ha reprobado la materia.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
