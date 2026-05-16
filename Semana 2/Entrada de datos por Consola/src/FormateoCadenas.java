public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("***FORMATEO DE CADENAS****");
        var nombre="Matias";
        var edad=33;
        var salario=22000.50;

        //string format
        //en nombre se usa %s para tipo string en edad para tipo entero se usa %d

        var mensaje =String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario );
        System.out.println(mensaje);

        //metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);

        //FORMATEO CON TEXT BLOCK

        var numeroEmpleado=121;
        mensaje= """
        Detalle Persona: \s
        ----------------
        \tNombre: %s
        \tNO. Empleado: %04d
        \tEdad: %d años
        \tSalario: $%.2f 
        """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // formateo con tex block metodo printf
        System.out.printf("""
        Detalle Persona: \s
        ----------------
        \tNombre: %s
        \tNO. Empleado: %04d
        \tEdad: %d años
        \tSalario: $%.2f 
        """, nombre, numeroEmpleado, edad, salario);


    }




}
