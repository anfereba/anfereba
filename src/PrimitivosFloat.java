public class PrimitivosFloat {
    public static void main(String[] args) {
        //float

        float realFloat = 2.12e3f;//2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bites a = " + Float.SIZE);
        System.out.println("Maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor para float = " + Float.MIN_VALUE);

        //double

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("Maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor para double = " + Double.MIN_VALUE);

        var varFlotante = 3;
        System.out.println("varFlotante = " + varFlotante);
    }
}
