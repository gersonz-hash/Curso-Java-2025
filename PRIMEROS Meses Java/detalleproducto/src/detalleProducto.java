public class detalleProducto {
    public static void main(String[] args) {
        System.out.println("-----Tienda en línea (Detalle de un Producto)------");
        String nombreProducto ="Locion";
        System.out.println("nombreProducto = " + nombreProducto);
        double precio =254.90;
        System.out.println("precio = " + precio);
        int cantidadDisponible=16;
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        boolean isdispobible =true;
        System.out.println("isdispobible = " + isdispobible);

        //modificacion del valor de cada variable

        System.out.println();
        nombreProducto="Crema";
        System.out.println("nombreProducto = " + nombreProducto);
        precio=250.90;
        System.out.println("isdispobible = " + precio);
        cantidadDisponible=10;
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        isdispobible=false;
        System.out.println("isdispobible = " + isdispobible);

    }
}
