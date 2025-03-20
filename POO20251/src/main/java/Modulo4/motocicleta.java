package Modulo4;

public class motocicleta {

    //Definir los atributos
    String chasis;
    String cilindraje;
    String marca;
    String color;
    String tipoCombustilble;
    String placa;

    //Definir las metodos


    public motocicleta() {
    }

    public motocicleta(String chasis, String cilindraje, String marca, String color, String tipoCombustilble, String placa) {
        this.chasis = chasis;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.color = color;
        this.tipoCombustilble = tipoCombustilble;
        this.placa = placa;
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    public void llenarCombustible(){
        System.out.println("Llenando...");
    }
}
