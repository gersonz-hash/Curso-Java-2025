public class reservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Reserva de Hoteles ***");
        String nombre_Cliente = "Pablo Escobar";
        System.out.println("Nombre del Cliente = " + nombre_Cliente);

        int dias_Estancia = 4;
        System.out.println("Dias de Estancia= " + dias_Estancia);

        var tarifa_Diaria = 500.50;
        System.out.println("Tarifa Diaria = " + tarifa_Diaria);

        boolean vista_al_mar = true;
        System.out.println("Cuenta con visita al mar = " + vista_al_mar);

        //modificacion de nuevos valores e impresion de nuevos valores
        System.out.println();
        System.out.println("*** Modificacion de los valores: *** ");
        System.out.println();
        dias_Estancia= 3;
        System.out.println("Dias de estancia= " + dias_Estancia);

        vista_al_mar=false;
        System.out.println("Vista al mar = " + vista_al_mar);


    }
}
