import java.util.Scanner;
class ejercicioVariables{
    public static void main(String[] args) {

        int numeroA = 89;
        int numeroB = 323;

        //Imprimir el valor de cada variable en consola
        System.out.println("El valor de la variable numeroA es: "+numeroA +"\n" +"El valor de la variable numeroB es: "+numeroB);

        //Operaciones matematicas
        int suma = numeroA + numeroB;
        int resta = numeroA - numeroB;
        double division = numeroA/numeroB;
        int multiplicacion = numeroA * numeroB;

        //Imprimir el valor de las operaciones
        System.out.println("El resultado de la suma es: "+suma +"\n" +"El valor de la resta es: "+resta +"\n" +"El valor de la division es: "+division +"\n" +"El valor de la multiplicación es: "+multiplicacion);

    }
}


class conversorDeMoneda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creacion de la constante dolar
        double dolar = 3.895;

        //Solicitar al usuario por consola la cantidad de pesos que desea convertir
        System.out.println("Ingrese la cantidad de pesos que desea convertir: ");
        double pesos = sc.nextDouble();

        double conversion = pesos/dolar;

        //Imprimir resultado de la conversion
        System.out.println("El total es: "+conversion);
    }
}

class facturaConIva{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitar al usuario el valor base de la factura
        System.out.println("Ingrese el valor base: ");
        double base = sc.nextDouble();

        //Calcular el valor del IVA
        double IVA = base * 0.19;

        //Calcular el total
        double total = base + IVA;

        System.out.println("El valor base es: "+base +"\n" +"El IVA calculado es: "+IVA +"\n" +"El total es: "+total);

    }
}

class diaSemana{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitar al usuario que ingrese el numero para identificar el día
        System.out.println("Ingrese el número del día que desea ver (1-7): ");
        int dia = sc.nextInt();

        //Creacion variable para alojar el nombre del día
        String nombreDia;

        //Validacion de cada uno de los dias segun lo ingresado por el usuario
        switch (dia) {
            case 1:
                nombreDia = "lunes";  
                break;
            case 2:
                nombreDia = "martes";
                break;
            case 3:
                nombreDia = "miércoles";
                break;
            case 4:
                nombreDia = "jueves";
                break;
            case 5:
                nombreDia = "viernes";
                break;
            case 6:
                nombreDia = "sábado";
                break;
            case 7:
                nombreDia = "domingo";
                break;
            default:
                nombreDia = "día no válido, fuera del rango de días";  // Si el número no está entre 1 y 7
                
        }

         // Imprimir el resultado
         System.out.println("El día correspondiente es: " + nombreDia);
    }
}

class ordenamientoDeNumeros{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Solicitar por consola los 3 numeros enteros
        System.out.println("Ingrese los 3 números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //Declarar las variables que se utilizaran para guardar el numero segun su orden
        int primero;
        int segundo;
        int tercero;       

        System.out.println("El orden original es: "+num1 +", "+num2+" ,"+num3);

         // Encontrar el menor número
         if (num1 < num2 && num1 < num3) {
            primero = num1;
        } else if (num2 < num1 && num2 < num3) {
            primero = num2;
        } else {
            primero = num3;
        }

        // Encontrar el mayor número
        if (num1 > num2 && num1 > num3) {
            tercero = num1;
        } else if (num2 > num1 && num2 > num3) {
            tercero = num2;
        } else {
            tercero = num3;
        }

        // Encontrar el número del medio (que no es ni el menor ni el mayor)
        if (num1 != primero && num1 != tercero) {
            segundo = num1;
        } else if (num2 != primero && num2 != tercero) {
            segundo = num2;
        } else {
            segundo = num3;
        }
    }
}

class primeraCifraDeUnNumero{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        //Se declara la variable donde se alojará el numero
        System.out.println("Ingrese el número");
        int numero = sc.nextInt();
        String numCadena = Integer.toString(numero);

        // Acceder al primer carácter de la cadena (primer dígito)
        char primeraCifraChar = numCadena.charAt(0);

        // Imprimir el primer carácter
        System.out.println("La primera cifra es: " + primeraCifraChar);
    }
}

class multiplosDeOcho{
    public static void main(String[] args) {

        //Se crea una variable que se inicializa en 0

        int multiplo = 0;

        while(multiplo <= 100){
            if(multiplo % 8 == 0){
                System.out.println(multiplo);
            }
            multiplo++;
        }
    }
}

class promedioNumerosPositivos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se crea una variable que se inicializa en 0
        int num = 0;
        int contador = 0;
        int sumador = 0;

        while (num >= 0){
            
            System.out.println("Ingrese los numeros para calcular el promedio");
            num = sc.nextInt();

            if(num >= 0){
                contador++;
                sumador += num;
            } 
            else{
                break;
            }           
        }  

        double promedio = sumador / contador;
            System.out.println("El promedio es: "+promedio);
    }
}

class conteoPositivosNegativos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorNumPos = 0;
        int contadorNumNeg = 0;

        for(int i = 1; i <= 10 ; i++){
            System.out.println("Ingrese el numero que irá en la posición: "+i);
            int numero = sc.nextInt();

            if(numero >= 0){
                contadorNumPos++;
            }
            else{
                contadorNumNeg++;
            }
        }
        System.out.println("La cantidad de numeros positivos es: "+contadorNumPos);
        System.out.println("La cantidad de numeros negativos es: "+contadorNumNeg);
    }
}

class piramideNumerica{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();

        // Validar que el número sea positivo
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            // Bucle principal para construir cada nivel de la pirámide
            for (int i = 1; i <= n; i++) {
                // Imprimir espacios en blanco para centrar la pirámide
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Imprimir los números ascendentes
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                // Imprimir los números descendentes
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }

                // Salto de línea después de cada nivel
                System.out.println();
            }            
        }
    }
}

class arregloCaracteres {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo de caracteres
        char[] caracteres = new char[10];

        // Asignación de valores a cada posición del arreglo
        caracteres[0] = 'h';
        caracteres[1] = 'z';
        caracteres[2] = 'a';
        caracteres[3] = 'm';
        caracteres[4] = 'q';
        caracteres[5] = 't';
        caracteres[6] = 'p';
        caracteres[7] = 'r';
        caracteres[8] = 's';
        caracteres[9] = 'x';

        // Mostrar el contenido del arreglo
        System.out.println("Contenido del arreglo 'caracteres':");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Posición " + i + ": " + caracteres[i]);
        }

        // Manipulación del arreglo: Cambiar el valor de la posición 5
        caracteres[5] = 'w';
        System.out.println("\nDespués de modificar la posición 5:");
        System.out.println("Nuevo valor en la posición 5: " + caracteres[5]);

        // Imprimir el arreglo nuevamente después de la modificación
        System.out.println("\nContenido actualizado del arreglo:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Posición " + i + ": " + caracteres[i]);
        }
    }
}



class arregloInverso {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Declaración del arreglo para almacenar 10 números
        int[] numeros = new int[10];

        // Solicitar al usuario que ingrese 10 números
        System.out.println("Ingrese 10 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Mostrar los números en orden inverso
        System.out.println("\nNúmeros en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

class clasificacionNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declaración del arreglo para almacenar 8 números
        int[] numeros = new int[8];

        // Solicitar al usuario que ingrese 8 números enteros
        System.out.println("Ingrese 8 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Recorrer el arreglo y clasificar cada número como par o impar
        System.out.println("\nClasificación de los números:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " - Par");
            } else {
                System.out.println(numeros[i] + " - Impar");
            }
        }
    }
}