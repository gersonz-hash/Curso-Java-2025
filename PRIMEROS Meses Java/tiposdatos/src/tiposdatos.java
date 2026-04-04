public class tiposdatos {
    public static void main(String[] args) {
        //tipos de datos en java
        //enteros (su valor por defau su valor es 0
        byte tipobyte = 123;
        System.out.println("tipobyte = " + tipobyte);
        short tiposhort = 32000;
        System.out.println("tiposhort = " + tiposhort);
        int tipoint =2147483647;
        System.out.println("tipoint = " + tipoint);
        long tipolong =987654321111111123L;

        //tipos de datos de punto flotante su valor es 0.0

        float tipofloat =3.1416f;
        System.out.println("tipofloat = " + tipofloat);
        double tipodouble =3.12343456677898765;
        System.out.println("tipodouble = " + tipodouble);

        //tipos de dato caracter (/u0000)
        char tipochar ='A';
        System.out.println("tipochar = " + tipochar);
        tipochar= 65;
        System.out.println("tipochar = " + tipochar);
        tipochar= '@';
        System.out.println("tipochar = " + tipochar);

        //Booleano(false)
        boolean tipoboolean =true;
        System.out.println("tipoboolean = " + tipoboolean);
        boolean tipobooleanf=false;
        System.out.println("tipobooleanf = " + tipobooleanf);

        String nombre= null;
        System.out.println("nombre = " + nombre);
        nombre="Juan Perez ";
        System.out.println("nombre = " + nombre);


    }
}
