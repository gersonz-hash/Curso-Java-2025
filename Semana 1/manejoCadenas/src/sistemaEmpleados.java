import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class sistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("******Sistema de Empleados*****");

        var consola=new Scanner(System.in);

        //nombre del empleado
        System.out.println("Nombre del empleado: ");
        var nombreEmpleado=consola.nextLine();

        //EDAD DEL EMPLEADO
        System.out.println("Edad del empleado: ");
        var edadEmpleado=Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.println("Salario del Empleado: ");
        var salarioEmpleado=Double.parseDouble(consola.nextLine());

        //Es jefe de departamento
        System.out.println("Es jefe de departamento (true/false)");
        var esJefeDepartamento=Boolean.parseBoolean(consola.nextLine());

        //imprimir los valores
        System.out.println("\n DATOS DEL EMPLEADO: ");
        System.out.println("\tNombre: "+nombreEmpleado);
        System.out.println("\tEdad: "+edadEmpleado+" años");
        //System.out.println("\tSalario: "+salarioEmpleado);
        System.out.println("\tSalario: $%.2f".formatted(salarioEmpleado));
        System.out.println("\tJefe departamento: "+esJefeDepartamento);




    }
}
