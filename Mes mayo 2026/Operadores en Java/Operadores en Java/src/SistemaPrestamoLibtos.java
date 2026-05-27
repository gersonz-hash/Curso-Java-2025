import java.util.Scanner;

public class SistemaPrestamoLibtos {
    public static void main(String[] args) {
        System.out.println("***Sistema Prestamo Libros***");

        final var distanciaPermitidaKm= 3;

        var consola=new Scanner(System.in);

        System.out.println("Cuentas con credencial de estudiante (true/false)");
        var tienesCredencial=Boolean.parseBoolean(consola.nextLine());

        System.out.println("A cuantos Km vive de la redonda: ");
        var km= Integer.parseInt(consola.nextLine());

       var respuesta= tienesCredencial || km<distanciaPermitidaKm;
        System.out.println("Cumple con las condiciones de la biblioteca! "+respuesta);


    }
}
