public class indiceCadena {
    public static void main(String[] args) {
        System.out.println("*** Indice de Cadenas ***");

        var cadena1 ="Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        
        var primerCaracter =cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        var segundoCaracter =cadena1.charAt(1);
        System.out.println("segundoCaracter = " + segundoCaracter);

        var tercerCaracter =cadena1.charAt(2);
        System.out.println("tercerCaracter = " + tercerCaracter);

        var cuartoCaracter =cadena1.charAt(3);
        System.out.println("cuartoCaracter = " + cuartoCaracter);

        var quintoCaracter =cadena1.charAt(4);
        System.out.println("quintoCaracter = " + quintoCaracter);

        var ultimoCaracter =cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        System.out.println();
        
        //Segunda cadena de practica para los indices 

        var cadena2 ="Gerson Y Viviana";

        var primercaracter = cadena2.charAt(0);
        System.out.println("primercaracter = " + primercaracter);
        
        var novenCaracter=cadena2.charAt(9);
        System.out.println("novenCaracter = " + novenCaracter);
        
        var ultimoCaracte=cadena2.charAt(15);
        System.out.println("ultimoCaracte = " + ultimoCaracte);

    }
}
