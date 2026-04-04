public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas nombres variables
        String nombreCompleto = "Juan Carlos ";//aplica las buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto ="Juan Carlos 2";//no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        String apellido ="Perez";
        System.out.println("apellido = " + apellido);
        int totpzs =10;//no aplica buenas practicas
        int totalPiezas =10;//aplica las buenas practicas
        System.out.println("totalPiezas = " + totalPiezas);
        boolean escasado =true; //correcto
        System.out.println("escasado = " + escasado);
        boolean istieneSaldo =true; //aplica buenas practicas


    }
}
