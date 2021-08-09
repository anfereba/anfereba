import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        // Variable String
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        
        //soutv
        System.out.println("saludar = " + saludar);
        
        //Metodo toUpperCase
        saludar = saludar.toUpperCase(Locale.ROOT);
        System.out.println("saludar = " + saludar);

        // Enteros
        int numero = 10;

        // Integer
        Integer numero2 = 10;
        System.out.println(numero2);

        boolean valor = true;
        if (valor){
            System.out.println("Verdero");
        }
        //Variables Dinamicas

        var numero3 = "15";
        System.out.println(numero3);
        
        
        //Reglas 
        
        String nombre;
        nombre = "Andres";
        if (numero == 10) {
            System.out.println("nombre = " + nombre);
        }
    }
}
