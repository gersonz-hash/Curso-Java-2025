import java.util.Random;

public class NumeroRandom {
    public static void main(String[] args) {
        System.out.println("----------Numeros Aleatorios---------");
        Random random =new Random();

        //NUMERO ALEATORIO ENTRE 0 Y 9
        var numeroAleatorio=random.nextInt(10);
        System.out.println("numeroAleatorio  tipo entero= " + numeroAleatorio);

        //numero flotante aleaatorio entre 0 y 10
        var floatAleatorio= random.nextFloat(10)+1 ;
        System.out.println("floatAleatorio = " + floatAleatorio);

        //numero double aleatorio entre 0 y 10.11
        var doubleAleatorio=random.nextDouble(10.11);
        System.out.println("doubleAleatorio = " + doubleAleatorio);

        //Boolean aleatorio entre true y false
        var booleanAleatorio=random.nextBoolean();
        System.out.println("booleanAleatorio = " + booleanAleatorio);

        //SIMULACIÓN DE LANZAMIENTO DE UN DADO entre 0 y 6
        var dado=random.nextInt(6)+1;
        System.out.println("el lanzamiento del daado fue= " + dado);
    }
}
