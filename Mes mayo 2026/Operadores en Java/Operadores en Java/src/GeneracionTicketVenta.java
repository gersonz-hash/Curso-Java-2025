import java.util.Scanner;

public class GeneracionTicketVenta {
    public static void main(String[] args) {
        System.out.println("***Generacion ticket de venta***");
        var consola=new Scanner(System.in);

        System.out.println("Precio Leche: ");
        var precioLeche=Double.parseDouble(consola.nextLine());

        System.out.println("Precio Cereal: ");
        var precioCereal=Double.parseDouble(consola.nextLine());

        System.out.println("Precio Galletas: ");
        var precioGalleta=Double.parseDouble(consola.nextLine());

        System.out.println("Precio Jugo: ");
        var precioJugo=Double.parseDouble(consola.nextLine());

        System.out.println("Precio Agua: ");
        var precioAgua=Double.parseDouble(consola.nextLine());

        System.out.println("Aplicar algún descuento: ");
        var descuentoPorcentaje=Integer.parseInt(consola.nextLine());

        //calculo del subtotal sin impuestos
        var subtotal=precioAgua+precioGalleta+precioCereal+precioJugo+precioLeche;

        //aplicar descuento=subtotal
        var descuento=subtotal * (descuentoPorcentaje/100.0);

        //subtotal con desuento
        var subtotalDescuento=subtotal-descuento;

        //Calculo con impuestos
        var impuesto= subtotal* 0.16;

        //calculo final
        var resultado=subtotalDescuento+impuesto;

        System.out.printf("""
                %n Ticket
                %n --------------------
                subtotal $%.2f
                Descuento $%.2f (%d%%)
                impuesto: $%.2f
                Total a Pagar: $%.2f
                %n ---------------------
                
                """, subtotal, descuento, descuentoPorcentaje, impuesto, resultado);
    }
}
