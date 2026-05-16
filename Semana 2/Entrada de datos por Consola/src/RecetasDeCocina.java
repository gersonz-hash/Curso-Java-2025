import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("********Recetas de Cocina******");
        System.out.println("Ingrese el nombre: ");
        String nombre=sc.nextLine();

        System.out.println("Ingredientes: ");
        String ingredientes=sc.nextLine();

        System.out.println("Tiempo de Preparación: ");
        double tiempo=sc.nextDouble();
        sc.nextLine();

        System.out.println("Dificultad: (Facil, Media o Alta): ");
        String dificultad=sc.nextLine();


        System.out.println("------Receta de Cocina---------");
        System.out.println("Nombre de la receta: "+nombre);
        System.out.println("Ingredientes: "+ingredientes);
        System.out.println("Tiempo de preparación: "+tiempo);
        System.out.println("Dificultad: "+dificultad);

    }
}
