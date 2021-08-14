import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // variable = condicion ? si es verdadero: si es falso
        String variable = 7 == 5 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas entre 2.0 y 7.0");
        matematicas = s.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 y 7.0");
        ciencias = s.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 y 7.0");
        historia = s.nextDouble();


        double promedio = (matematicas + ciencias + historia)/3;

        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);
    }
}
