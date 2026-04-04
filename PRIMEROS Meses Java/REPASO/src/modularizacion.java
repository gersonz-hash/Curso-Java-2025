
import java.util.Scanner;

public class modularizacion {
    static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion=leerEntero("Seleccione una Opcion: ");

            switch (opcion){
                case 1: calculadora();break;
                case 2: ValidarContrasena(); break;
                case 3: numerosPrimos(); break;
                case 4: sumaNumPares(); break;
                case 5: conversionTemp(); break;
                case 6: contadorVocales(); break;
                case 7: calculadoraFac(); break;
                case 8: juegoAdivinanza(); break;
                case 9: pasoPorReferencia(); break;
                case 10: tablaMultiplicar(); break;
                case 0:
                    System.out.println("Saliendo del programa ........."); break;
                default:
                    System.out.println("Opcion invalida ");
            }

        }while (opcion !=0);
    }
    //====MENU======
    public static void mostrarMenu(){
        System.out.println("------MENU PRINCIPAL----------");
        System.out.println();
        System.out.println("1. Calculadora Basica ");
        System.out.println("2. Validacion de Contraseña ");
        System.out.println("3. Numeros Primos");
        System.out.println("4. Suma de Numeros Pares");
        System.out.println("5. Conversion de Temperatura");
        System.out.println("6. Contador de vocales");
        System.out.println("7. Calculo de Factorial ");
        System.out.println("8. Juego de Adivinanza");
        System.out.println("9. Paso por Referencia ");
        System.out.println("10. Tabla de multiplicar ");

    }
    //validacion numerica try catch
    public static int leerEntero(String mensaje){
        int numero;
        while (true){
            try{
                System.out.println(mensaje);
                numero=Integer.parseInt(scanner.nextLine());
                return numero;
            }catch(Exception e){
                System.out.println("Error ingrese un numero valido. ");

            }
        }
    }
    public static double leerDouble(String mensaje){
        double numero;
        while (true){
            try{
                System.out.println(mensaje);
                numero =Double.parseDouble(scanner.nextline());
                return numero;
            }catch (Exception e){
                System.out.println("Error ingrese un numero valido");
            }
        }
    }

    //----------------CALCULADORA---------------
    public static void calculadora(){
        double a =leerDouble("Ingrese el primer Numero: ");
        double b=leerDouble("Ingrese el segundo numero: ");
        System.out.println("1. SUMA 2. RESTA 3. MULTIPLICACION 4.DIVISION");
        int op =leerEntero ("Elija operacion: ");

        switch(op){
            case 1:
                System.out.println("Resultado: "+suma(a, b)); break;
                System.out.println("Resultado: "+ resta(a, b)); break;
            System.out.println("Resultado: "+multiplicacion(a, b)); break;
            

        }

    }
}

