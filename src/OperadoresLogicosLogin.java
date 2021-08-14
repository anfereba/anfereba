import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*
        String [] usernames = new String[4];
        String [] passwords = new String[4];
        usernames[0] = "andres";
        usernames[1] = "felipe";
        usernames[2] = "rendon";
        usernames[3] = "barreto";
        passwords[0] = "1234";
        passwords[1] = "5678";
        passwords[2] = "9012";
        passwords[3] = "3456";*/

        String [] usernames = {"andres","admin","pepe"};
        String [] passwords = {"123","1234","12345"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");
        String u = scanner.nextLine();
        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i=0; i< usernames.length; i++){
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: esAutenticado;
            /*if ((usernames[i].equals(u) && passwords[i].equals(p))){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                    "Username o contraseña incorrecto! \n Lo sentimos, requiere autenticacion";
        System.out.println(mensaje);
        /*
        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("username o contraseña incorrecto");
            System.out.println("Lo siento, requiere autenticacion");
        */
    }
}
