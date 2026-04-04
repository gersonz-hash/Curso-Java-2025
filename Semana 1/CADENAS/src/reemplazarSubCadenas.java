public class reemplazarSubCadenas {
    public static void main(String[] args) {
        //reemplazar subcadenas
        var cadena="Hola Mundo";
        System.out.println("cadena = " + cadena);

        //Reemplazo "Mundo" por "a todos"
        var nuevaCadena=cadena.replace("Mundo", "a Todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //reemplazar "Hola" por "adios"
        nuevaCadena=cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
