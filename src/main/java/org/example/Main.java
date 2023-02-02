package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        //1. crear una instancia de la clase Empleado
        Empleado objetoTipoEmpleado=new Empleado();

        //2.A genero un retorno lo guardo en una variable y despues lo imprimo
        String resultado=objetoTipoEmpleado.saludar("Lucho Diaz" ); //accediendo a los metodos de mi clase Empleado
        System.out.println(resultado);

        //2.B imprimo la funcion del objeto
        System.out.println(objetoTipoEmpleado.saludar("Luisa Herrera" ));

        */

        //1. Para usar una clase creo un objeto
        Empleado objeto=new Empleado();//llame al constructor

        //2. utilizar el objeto para acceder a un atributo
        objeto.nombre="Oscar Guzman";

        //3. utilizar el objeto para acceder a un metodo
        String resultado=objeto.saludar("Luisa Herrera");

        //4. salidas por consola
        //salida de un atributo
        System.out.println(objeto.nombre);

        //salida del retorno de la funcion
        System.out.println(objeto.saludar("Luisa Herrera Gomez"));

        System.out.println(resultado);
        int sumatoria=objeto.sumar(5,3);
        System.out.println(sumatoria);

    }
}