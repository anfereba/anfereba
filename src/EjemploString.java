public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("ProgramaciOn Java");
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        //Comparar 2 String exactamente iguales

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        //Comparar 2 String ignorando case

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        //Comparar valores y no instancias

        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);


    }
}
