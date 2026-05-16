import java.sql.SQLOutput;
import java.util.Scanner;

public class leerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //leer un tipo int
        var consola= new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        var edad=consola.nextInt();
        System.out.println("Edad: "+edad);

        //leer un tipo double
        System.out.println("Ingresa tu altura: ");
        var altura=consola.nextDouble();
        System.out.println("Altura: "+altura);

        //consumimos el caracter de salto de linea
        consola.nextLine();
        //Leer un tipo String
        System.out.println("Ingresa tu nombre: ");
        var nombre=consola.nextLine();
        System.out.println("Nombre: "+nombre);

        //conversion de datos
        System.out.println("Proporciona un valor entero: ");
        var enteroString=consola.nextLine();
        var entero=Integer.pa  rseInt(enteroString);
        System.out.println("entero = " + entero);

        //TIPO FLOTANTE
        System.out.println("Proporciona un valor flotante" );
        var flotante=Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

      //Tipo Double
        System.out.println("Proporcion un valor Double");
        var doub=Double.parseDouble(consola.nextLine());
        System.out.println("double = " + doub);

        //Tipo boolean
        System.out.println("Proporciona un valor boolean");
        var boolea=Boolean.parseBoolean(consola.nextLine());
        System.out.println("boolean = " + boolea);
    }
}
