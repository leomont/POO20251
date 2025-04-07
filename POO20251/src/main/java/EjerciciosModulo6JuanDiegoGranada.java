import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosModulo6JuanDiegoGranada {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese el ejecicio que desea ejecutar de 1 a 13: ");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:ejercicio1();break;
            case 2:ejercicio2();break;
            case 3:ejercicio3();break;
            case 4:ejercicio4();break;
            case 5:ejercicio5();break;
            case 6:ejercicio6();break;
            case 7:ejercicio7();break;
            case 8:ejercicio8();break;
            case 9:ejercicio9();break;
            case 10:ejercicio10();break;
            case 11:ejercicio11();break;
            case 12:ejercicio12();break;
            case 13:ejercicio13();break;
            default:
                System.out.println("Opcion no valida");
        }
    }
    public static void ejercicio1(){
        double numa=89,numb=323;
        System.out.println("El valor del primer numero es: "+numa+" y el valor del segundo numero es: "+numb);
        System.out.println("El valor de la suma de los numeros es: "+(numa+numb)+
                "\nEl valor de la resta de los dos numeros es: "+(numa-numb)+
                "\nEl valor de la multiplicación es: "+(numa*numb)+
                "\nEl valor de la division es: "+(numa/numb));
    }
    public static void ejercicio2(){
        System.out.print("Ingrese la cantidad de pesos: ");
        double pesos=teclado.nextDouble();
        System.out.println("El valor de esos pesos en dolares es de: "+(pesos/3895));
    }
    public static void ejercicio3(){
        System.out.print("Ingrese el precio de la factura: ");
        double factura=teclado.nextDouble();
        double iva=factura*0.19;
        System.out.println("El valor del iva es: "+iva+", por lo tanto el total de la factura es: "+(factura+iva));
    }
    public static void ejercicio4(){
        System.out.println("Ingrese el día de la semana en numero: ");
        int dia=teclado.nextInt();
        switch(dia){
            case 1: System.out.println("Lunes");break;
            case 2: System.out.println("Martes");break;
            case 3: System.out.println("Miercoles");break;
            case 4: System.out.println("Jueves");break;
            case 5: System.out.println("Viernes");break;
            case 6: System.out.println("Sabado");break;
            case 7: System.out.println("Domingo");break;
            default: System.out.println("Número no válido");break;
        }
    }
    public static void ejercicio5(){
        System.out.print("Ingrese el primer numero: ");
        int num1=teclado.nextInt();teclado.nextLine();
        System.out.print("Ingrese el segundo numero: ");
        int num2=teclado.nextInt();teclado.nextLine();
        System.out.print("Ingrese el tercer numero: ");
        int num3=teclado.nextInt();teclado.nextLine();
        System.out.println("Los numeros ingresados fueron: "+num1+", "+num2+", "+num3);
        int mayor,menor,medio;
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }
        System.out.println("Ordenado de menor a mayor: " + menor + ", " + medio + ", " + mayor);
        teclado.close();
    }
    public static void ejercicio6(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número entero de hasta 5 dígitos: ");
        int numero = teclado.nextInt();
        String cadena = Integer.toString(Math.abs(numero)); // abs para ignorar el signo
        char primeraCifra = cadena.charAt(0);
        System.out.println("La primera cifra es: " + primeraCifra);
        teclado.close();
    }
    public static void ejercicio7(){
        int numero=1;
        while(numero<=100){
            if(numero%8==0){
                System.out.println(numero);
            }
            numero++;
        }
    }
    public static void ejercicio8(){
        double numero,suma=0,contador=0;
        System.out.println("Promedio de números, si desea detener, ingrese un numero negativo.");
        do{
            System.out.print("Ingrese un numero: ");
            numero=teclado.nextInt();
            if(numero>=0){
                suma+=numero;
                contador++;
            }
        }while(numero>=0);
        System.out.println("El promedio de los numeros ingresados es: "+(suma/contador));
    }
    public static void ejercicio9(){
        int numero,positivos = 0,negativos=0,cero=0;
        for (int i=1;i<=10;i++){
            System.out.print("Ingrese el "+i+" numero: ");
            numero=teclado.nextInt();
            if(numero>0){positivos++;}
            else if(numero<0){negativos++;}
            else{cero++;}
        }
        System.out.println("La cantidad de positivos es: "+positivos+", negativos: "+negativos+" y el cero:"+cero);
    }
    public static void ejercicio10(){
        System.out.print("Ingresa un número entero (altura de la pirámide): ");
        int altura = teclado.nextInt();
        // Bucle para cada fila
        for (int i = 1; i <= altura; i++) {
            // Imprimir espacios para centrar
            for (int espacio = 1; espacio <= altura - i; espacio++) {
                System.out.print(" ");
            }
            // Imprimir parte ascendente (1 hasta i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Imprimir parte descendente (i-1 hasta 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Nueva línea para la siguiente fila
            System.out.println();
        }
        teclado.close();
    }
    public static void ejercicio11(){
        String cadena="caracteres";
        char[] vector = new char[10];
        for (int i=0;i<cadena.length();i++){
            vector[i]=cadena.charAt(i);
        }
        for (int i=0;i<vector.length;i++){
            System.out.println("El caracter en la posicion "+i+" es: "+vector[i]);
        }
    }
    public static void ejercicio12(){
        int []vector=new int[10];
        for (int i=0;i<vector.length;i++){
            System.out.print("Ingrese el numero "+(i+1)+": ");
            int numero=teclado.nextInt();
            vector[i]=numero;
            teclado.nextLine();
        }
        System.out.println("El orden inverso es: ");
        for (int i=9;i>=0;i--){
            System.out.println(vector[i]);
        }
    }
    public static void ejercicio13(){
        int [] vector=new int [8];
        for (int i=0;i<vector.length;i++){
            System.out.print("Ingrese el numero de la posición "+(i+1)+": ");
            vector[i]=teclado.nextInt();
            teclado.nextLine();
        }
        for (int i=0;i<vector.length;i++){
            if(vector[i]%2==0){
                System.out.println("El numero "+vector[i]+" es par");
            }else{
                System.out.println("El numero "+vector[i]+" es impar");
            }
        }
    }
}