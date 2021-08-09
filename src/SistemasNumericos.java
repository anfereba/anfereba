import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero entero"));
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un umero entero");
            main(args);
            System.exit(0);
        }

        String mensajeBinario = "Numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "\nNumero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n"+mensajeOctal;
        mensaje += mensajeHexadecimal;
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
