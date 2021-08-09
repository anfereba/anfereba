public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua = " + trabalengua);

        //Convierte string en Array de char
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());
        char[] arreglo = trabalengua.toCharArray();

        int largo = arreglo.length;

        for (int i = 0; i<largo; i++){
            System.out.println("arreglo["+i+"] = " + arreglo[i]);
        }
        System.out.println("trabalengua.split(\"a\") = " + trabalengua.split("a"));
        String[] arreglo2 = trabalengua.split("a");
        for (int i = 0; i<arreglo2.length; i++){
            System.out.print( arreglo[i]);
        }
        System.out.println();
        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");
        for (int i = 0; i<archivoArr.length; i++){
            System.out.println(archivoArr[i]);
        }
    }
}
