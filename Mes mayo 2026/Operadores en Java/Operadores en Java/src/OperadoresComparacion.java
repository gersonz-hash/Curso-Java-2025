public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("***OPERADORES DE COMPARACION***");
        int a=3, b=2;
        //igualdad ==
        var resultado= a == b; //la presedencia de operadores es que
                               //operador se ejecuta antes que otro
                               //en ese caso a==b es primero
        System.out.println("Igualdad a==b:  " + resultado);

        //Distinto !=
        resultado= a !=b;
        System.out.println("resultado  a!= b: " + resultado);

        //Mayor que >
        resultado = a> b;
        System.out.println("resultado a > b:  " + resultado);

        //Mayor o igual que >=
        resultado =a>=b;
        System.out.println("resultado a>=b " + resultado);

        //menor que <
        resultado = a<b;
        System.out.println("resultado a<b: " + resultado);

        //Menor o igual que <=
        resultado = a<=b;
        System.out.println("resultado a<=b: " + resultado);

    }
}
