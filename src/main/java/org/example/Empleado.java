package org.example;

public class Empleado {

    //ATRIBUTOS
    String nombre;

    //CONSTRUCTOR
    public Empleado() {
    }

    //METODOS ESPECIALES
    public String saludar(String nombresito){
        String saludo="Hola "+ nombresito;
        return saludo;
        //return "Hola "+ nombresito;
    }

    public int sumar(int numero1,int numero2){
        int suma=numero1+numero2;
        return suma;
    }
}
