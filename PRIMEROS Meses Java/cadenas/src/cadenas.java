public class cadenas {
    public static void main(String[] args) {
        System.out.println("****** Uso de Cadenas en Java ******");
        var cadena1 ="Hola";
        System.out.println("cadena1 = " + cadena1);

        var cadena2 = new String("Mundo");
        System.out.println("cadena2 = " + cadena2);

        var cadena3 = cadena1 + " "+ cadena2;
        System.out.println("cadena3 = " + cadena3);

        var cadena4 = """
                Con esto se permite
                agregar las lineas
                que uno quiera utilizar
                para el programa
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
