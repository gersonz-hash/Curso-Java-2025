public class metodoDeCadenas {
    public static void main(String[] args) {
        //METODOS DE CADENAS

        var cadena1 = "Hola Mundo";

        //OBTENER EL LARGO DE UNA CADENA
        var longitud=cadena1.length();
        System.out.println("longitud = " + longitud);

        //REEMPLAZAR CARACTERES
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena: "+nuevaCadena);
        
        //METODO PARA CONVERTIR A MAYUSCULAS
        var mayusculas=cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //METODO PARA CONVERTIR A MINUSCULAS
        var minusculas=cadena1.toLowerCase();
        System.out.println("minusculas: "+minusculas);

        //METODO PARA ELIMIAR ESPACIOS AL PRINCIPIO Y AL FINAL
        var cadena2="  Leo Reyes    ";
        System.out.println("cadena2 con espacios= " + cadena2);
        System.out.println("cadena2 sin espacios= " + cadena2.trim());





    }
}
