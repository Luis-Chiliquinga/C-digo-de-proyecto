
public class Main {

    public static void main(String[] args) {
        DataCenter dc = new DataCenter();
        
        Empleado emp1 = new Empleado("David", 228, "1", "", "");
        Empleado emp2 = new Empleado("Ana", 765, "2", "", "");

        Jefes jefe1 = new Jefes("Luis", 456, "1", "", "", 9);

        dc.registrarEmpleado(emp1);
        dc.registrarEmpleado(emp2);
        dc.registrarEmpleado(jefe1);

        dc.registrarEntrada("228", "08:00");
        dc.registrarSalida("228", "16:00");

        dc.registrarEntrada("765", "08:30");
        dc.registrarSalida("765", "15:30");

    }
}


        
 
