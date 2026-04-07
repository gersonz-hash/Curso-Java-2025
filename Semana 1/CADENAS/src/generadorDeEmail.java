public class generadorDeEmail {
    public static void main(String[] args) {
        System.out.println("******GENERADOR DE EMAILS******\n");
        var nombre="Vivian Alondra Espinoza Marroquin";
        System.out.println("Nombre = " + nombre);

        //nombre completo en minusculas
        var nombreMinuscula=nombre.toLowerCase();

        
        //quitar espacios
        var nombreNormalizado =nombreMinuscula.replace(" ", ".");
        System.out.println("Nombre Normalizado = " + nombreNormalizado);

        System.out.println();

        var empresa="Global Mentoring";
        System.out.println("Empresa = " + empresa);
        //minusculas
        var empresaMinuscula=empresa.toLowerCase();
        System.out.println("empresaMinuscula = " + empresaMinuscula);

        //empresa normalizada
        var empresaNormalizada=empresaMinuscula.replace(" ","");
        System.out.println("empresaNormalizada = " + empresaNormalizada);
        System.out.println();

        var dominio=".com.mx";
        System.out.println("Dominio = " + dominio);

        //dominio de email normalizado
        var dominioEmailPersonalizado="@"+empresaNormalizada+dominio;
        System.out.println("Dominio de email normalizado = " + dominioEmailPersonalizado);
        System.out.println();

        //Email final generado
        var emailFinal=String.join("", nombreNormalizado+dominioEmailPersonalizado);
        System.out.println("Email Final generado:  = " + emailFinal);
    }
}
