public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("***Operadores de Asignacion***");
        //Asignacion simple
        var num1=10;// aca podemos asignarle cualquier valor
        int num2;
        num2=15;//Así como acá espedifíca que tiene que ser numero entero

        //Asignacion compuesto
        //+
        num1 +=5;
        System.out.println("Operador compuesto + = " + num1);

        //-=, *=, /= y %=
        num1 *=2;
        System.out.println("Operador Compuesto * = " + num1);

        num1 /=2;
        System.out.println("Operador compuesto / = " + num1);

        num1 -=5;
        System.out.println("Operador compuesto - = " + num1);

        //Asignacion de variables multiples
        int a=10, b=15, c=20;
        System.out.printf("a= %d, b=%d, c= %d,",a, b, c);
    }
}
