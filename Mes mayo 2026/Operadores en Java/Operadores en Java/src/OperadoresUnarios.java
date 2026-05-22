public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("***Operadores Unarios***");
        int a=3, b=-2, resultado;
        var c=true;

        //operador unario +
        resultado= +a;
        System.out.println("resultado +a= " + resultado);

        //operador unario -
        resultado =-a;
        System.out.println("resultado -a = " + resultado);

        //operadores unarios incremento/decremento
        //Pre-incremento
        a=3;
        resultado=++a;
        System.out.println("resultado ++a= " + resultado);

        //Post-incremento
        a=3;
        resultado=a++;
        System.out.println("resultado a++= " + resultado);
        System.out.println("a en este momento se incrementa= " + a);

        //Pre-decremento
        b=-2;
        resultado= --b;//primero se incrementa y despues se usa el valor
        System.out.println("resultado --b= " + resultado);

        //Post/decremento
        b=-2;
        resultado= b--; //primero se usa el valor, y despues se incrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b-- ahora se decrementa = " + b);




    }
}
