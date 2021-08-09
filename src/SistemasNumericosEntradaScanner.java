import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");

        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero!");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "Numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "Numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n"+mensajeOctal;
        mensaje += "\n"+mensajeHexadecimal;
        System.out.println(mensaje);

    }
}
