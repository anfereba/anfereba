public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Andres";

        //Ver longitud
        System.out.println("nombre.length() = " + nombre.length());
        
        //A mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        
        //A minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        
        //Comparar valores
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"AnDrEs\") = " + nombre.equalsIgnoreCase("AnDrEs"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        
        //Obtener caracteres de un string (recibe indice)
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));

        //Substring (Obtener parte de un string)
        System.out.println("nombre.substring(1,5) = " + nombre.substring(0));
        System.out.println("nombre.substring(1,5) = " + nombre.substring(1,5));
        System.out.println("nombre.substring(1,5) = " + nombre.substring(5));
        System.out.println("nombre.substring(1,5) = " + nombre.substring(nombre.length()-1));

        //Funcion Replace
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalengua.replace("a","."));
        
        //Index Of (Valida si se encuentra algun caracter dentro del string)
        System.out.println("trabalengua.indexOf(\"x\") = " + trabalengua.indexOf("a"));
        System.out.println("trabalengua.indexOf(\"x\") = " + trabalengua.indexOf("x"));
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf("a"));
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf("x"));
        
        //Contains
        System.out.println("trabalengua.contains(\"s\") = " + trabalengua.contains("s"));
        System.out.println("trabalengua.contains(\"s\") = " + trabalengua.contains("x"));
        System.out.println("trabalengua.contains(\"s\") = " + trabalengua.contains("lenguas"));
        
        //Startwith (Si comienza con)
        System.out.println("trabalengua.startsWith(\"t\") = " + trabalengua.startsWith("t"));
        System.out.println("trabalengua.startsWith(\"t\") = " + trabalengua.startsWith("lenguas"));
        System.out.println("trabalengua.startsWith(\"t\") = " + trabalengua.startsWith("traba"));


        //Quitar espacios en blanco
        String trabalengua2 = "  trabalenguas ";
        System.out.println("trabalengua2 = " + trabalengua2);
        System.out.println("trabalengua2.trim() = " + trabalengua2.trim());
    }
}
