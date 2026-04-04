public class comparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de Cadenas (pool de cadenas)
        var cadena1="Java";
        var cadena2="Java";
        var cadena3= new String("Java");

        //cOMPARACION DE CADENAS (==) compara la referencia en memoria
        System.out.print("Cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);
        //comparamos cadena1 con cadena3 pero sus referencias
        System.out.print("cadena1 es igual en referencia a caden3: ");
        System.out.println(cadena1 == cadena3);

        //comparar contenido usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));

        //para comparar cadenas hay que utilizar el metodo equals y si queremos saber
        //cual es su referencia se hace la comparacion normal 

    }
}
