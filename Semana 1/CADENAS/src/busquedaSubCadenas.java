public class busquedaSubCadenas {
    public static void main(String[] args) {
        //BUSCAR SUBCADENAS
        //indexOf -devuelve el indice de la primera aparicion de la subcadena
        var cadena1="Hola Mundo";
        //subcadena a buscar "Hola"
        var indice1=cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //Subcadnea a buscar "Mundo"
        var indice2=cadena1.indexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //lastindexOf -devuelve el indice de la ultima aparicion de la subcadena
        //subcadena de Mundo
        var indice3=cadena1.lastIndexOf("Hola");
        System.out.println("indice3 = " + indice3);

        //para subcadena no encontrada devuelve -1
        var indice4=cadena1.indexOf("mundo");
        System.out.println("indice4 = " + indice4);
    }
}
