package clases_string_math;

public class clases_String_Math {

    public static void main(String[] args) {

        System.out.println(equals("Parapa", "Parapa"));
        System.out.println(indexOf("Programador", "gra"));
        System.out.println(compareTo("Ana", "Beto"));
        System.out.println(length("Gato"));
        System.out.println(toLowerCase("PArriLLa"));
        System.out.println(toUpperCase("PArriLLa"));
        System.out.println(equalsIgnoreCase("SaPe", "sape"));
        System.out.println(trim("   SAPE   "));

    }

    //  EJERCICIO 1  //
    public static boolean equals(String uno, String dos) {

        return (uno != null && uno.equals(dos));

    }

    public static int indexOf(String palabra, String palabra2) {

        return palabra.indexOf(palabra2);

    }

    public static int compareTo(String palabra1, String palabra2) {

        return palabra1.compareTo(palabra2);
    }

    public static int length(String palabra) {

        return palabra.length();
    }

    public static String toLowerCase(String palabra) {

        return palabra.toLowerCase();
    }

    public static String toUpperCase(String palabra) {

        return palabra.toUpperCase();
    }

    public static boolean equalsIgnoreCase(String palabra1, String palabra2) {

        return palabra1.equalsIgnoreCase(palabra2);

    }

    public static String trim(String palabra) {

        return palabra.trim();
    }
    
    //  EJERCICIO 2 //

}
