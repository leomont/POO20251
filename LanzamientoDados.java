import java.security.SecureRandom; 

public class LanzamientoDados {
    public static void main(String[] args) {
        // Creamos un objeto llamado "miDado" usando la clase Dado
        Dado miDado = new Dado();
       
        // Usamos el objeto para lanzar el dado N cantidad de veces
        miDado.realizarLanzamientos(10);
       
        // Pedimos al objeto que nos muestre los resultados
        miDado.mostrarConteos();
    }
}

    //Case Dado que representa un dado de 6 caras
class Dado {
    //Creacion de las 6 variables
    int conteo1;
    int conteo2;
    int conteo3;
    int conteo4;
    int conteo5;
    int conteo6;
   
    //Generador de números aleatorios
    private SecureRandom generador;
   
    //Metodo Constructor - se ejecuta automáticamente cuando creamos un nuevo Dado
    public Dado() {
        generador = new SecureRandom(); // Inicializamos el generador
        // Inicializamos todos los conteos en 0
        conteo1 = 0;
        conteo2 = 0;
        conteo3 = 0;
        conteo4 = 0;
        conteo5 = 0;
        conteo6 = 0;
       
        System.out.println("¡Se ha creado un nuevo dado!");
    }
   
    // Método para lanzar el dado una vez
    public void lanzar() {
        // Generamos un número aleatorio entre 1 y 6
        int resultado = generador.nextInt(6) + 1;
       
        //Aumentamos el contador correspondiente a la cara(conteo)
        switch (resultado) {
            case 1:
                conteo1++;
            case 2:
                conteo2++;
            case 3:
                conteo3++;
            case 4:
                conteo4++;
            case 5:
                conteo5++;
            case 6:
                conteo6++;
            break;
        }
    }
   
    // Método para lanzar el dado muchas veces
    public void realizarLanzamientos(int cantidad) {
        System.out.println("Lanzando el dado " + cantidad + " veces...");
       
        for(int i = 0; i < cantidad; i++) {
            lanzar(); // Llamamos al método lanzar() muchas veces
        }
       
        System.out.println("¡Lanzamientos completados!");
    }
   
    // Método para mostrar los resultados
    public void mostrarConteos() {
        System.out.println("\nResultados:");
        System.out.println("Cara 1: " + conteo1 + " veces");
        System.out.println("Cara 2: " + conteo2 + " veces");
        System.out.println("Cara 3: " + conteo3 + " veces");
        System.out.println("Cara 4: " + conteo4 + " veces");
        System.out.println("Cara 5: " + conteo5 + " veces");
        System.out.println("Cara 6: " + conteo6 + " veces");
       
        int total = conteo1 + conteo2 + conteo3 + conteo4 + conteo5 + conteo6;
        System.out.println("\nTotal de lanzamientos: " + total);
    }
}
