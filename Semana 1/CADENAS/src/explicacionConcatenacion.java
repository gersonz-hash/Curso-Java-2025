public class explicacionConcatenacion {
    public static void main(String[] args) {
        var nombre="Vivian";
        System.out.println("Nombre: "+nombre);

        var apellido="Espinoza";
        System.out.println("Apellido: "+apellido);
        
        var nombreCompleto=nombre+" "+ apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);
        
        var minuscula=nombreCompleto.toLowerCase();
        System.out.println("minuscula = " + minuscula);
    }
}
