public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter2 = '\u0040';
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter = " + (decimal == caracter));
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter = " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Char corresponde en byte =" +tabulador+ Character.BYTES);
        System.out.println("Char corresponde en bites a " + Character.SIZE);
        System.out.println("Character MIN_VALUE = " +retroceso+retroceso+ Character.MIN_VALUE);
        System.out.println("Character MAX VALUE" + Character.MAX_VALUE);

    }
}
