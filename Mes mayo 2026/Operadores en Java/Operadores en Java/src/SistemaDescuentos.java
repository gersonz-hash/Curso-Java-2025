import java.util.Scanner;

public class SistemaDescuentos {
    public static void main(String[] args) {
        System.out.println("***Sistema Descuentos VIP***");
        final var NoProductosDescuento=10;
        var consola=new Scanner(System.in);


        System.out.println("Cuantos productos compraste hoy: ");
        var cantidadProductos=Integer.parseInt(consola.nextLine());

        System.out.println("Tiene la membresia de la tienda (true/false)");
        var tieneMembresia=Boolean.parseBoolean(consola.nextLine());
        
        var esElegibleDescuento=cantidadProductos>= NoProductosDescuento && tieneMembresia;
        System.out.println("esElegibleDescuento = " + esElegibleDescuento);
        

    }
}
