public class tipovar {
    public static void main(String[] args) {
        //declaración de variables sin el uso de var
        String nombre1="Juan";
        System.out.println("nombre1 = " + nombre1);
        //con el uso de var
        var nombre2 ="Carlos";
        System.out.println("nombre2 = " + nombre2);
        //definir otras variables usando
        var edad =30;
        System.out.println("edad = " + edad);
        var sueldo=5000.00;
        System.out.println("sueldo = " + sueldo);
        var esCasado =false;
        System.out.println("esCasado = " + esCasado);
        esCasado =true;
        System.out.println();

        //var precio;  esto va dar error porque tenemos que asignarle un valor
        //se debe poder inferir el tipo de dato
        //var apellido=null; no se puede inferir el tipo de dato

    }
}
