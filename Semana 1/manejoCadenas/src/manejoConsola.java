import java.util.Scanner;

public class manejoConsola {
    public static void main(String[] args) {
        //introducir valores por consola
        var consola=new Scanner(System.in);// in -imput -entrada de datos
        System.out.println("Escribe tu nombre: ");
        var nombre=consola.nextLine();
        System.out.println("Nombre= "+nombre);

    }
}
