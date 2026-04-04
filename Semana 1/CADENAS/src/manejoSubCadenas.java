public class manejoSubCadenas {
    public static void main(String[] args) {
        //TEMA DE SUBCADENAS

        var cadena1 ="Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        
        //SUBCADENA
        var subcadena1= cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);

        var subcadena2=cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
