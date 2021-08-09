import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = "";
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        boolean esVacio = curso.length() == 0;
        if (esVacio == false){

        }
        
        boolean esVacio2 = curso.isEmpty();
        boolean esBlanco = curso.isBlank();

        System.out.println("esBlanco = " + esBlanco);
        
        System.out.println("esVacio2 = " + esVacio2);
        if (!esNulo){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

    }
}
