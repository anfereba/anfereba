public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "casasfasfsafaf.pdf";
        System.out.println("archivo.indexOf(\".\") = " + archivo.indexOf("."));
        System.out.println("(archivo.length()-1) = " + (archivo.length()-1));
        System.out.println("archivo.substring(archivo.indexOf(\".\"),archivo.length()-1)) = " + archivo.substring(archivo.lastIndexOf(".")+1,archivo.length()));
    }
}
