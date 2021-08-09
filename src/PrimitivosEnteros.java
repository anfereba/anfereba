public class PrimitivosEnteros {
    public static void main(String[] args) {

        // Bytes
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un Byte: "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de un Byte: "+Byte.MIN_VALUE);

        // Short

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a "+ Short.BYTES);
        System.out.println("Tipo short corresponde en bites a "+Short.SIZE);
        System.out.println("Valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short "+Short.MIN_VALUE);

        // Int

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a "+ Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a "+Integer.SIZE);
        System.out.println("Valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int "+Integer.MIN_VALUE);

        //Long

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a "+ Long.BYTES);
        System.out.println("Tipo long corresponde en bites a "+ Long.SIZE);
        System.out.println("Valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long "+ Long.MIN_VALUE);


    }
}
