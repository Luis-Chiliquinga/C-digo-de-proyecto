
import java.util.ArrayList;
import java.util.List;

public class DataCenter {
    private List<Persona> empleados;

    public DataCenter() {
        empleados = new ArrayList<>();
    }
    public void registrarEmpleado(Persona empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado: " + empleado.nombre);
    }
    public void registrarEntrada(String id, String hora) {
        for (Persona emp : empleados) {
            if (emp.ID == Integer.parseInt(id)) {
                emp.horaEntrada = hora;
                System.out.println("Entrada registrada para " + emp.nombre + " a las " + hora);
                return;
            }
        }
        System.out.println("Empleado no encontrado para el registro de entrada.");
    }
    public void registrarSalida(String id, String hora) {
        for (Persona emp : empleados) {
            if (emp.ID == Integer.parseInt(id)) {
                emp.horaSalida = hora;
                System.out.println("Salida registrada para " + emp.nombre + " a las " + hora);
                return;
            }
        }
        System.out.println("Empleado no encontrado para el registro de salida.");
    }
    public void GenerarReportes() {
        System.out.println("Generando reportes de actividad diaria...");
        for (Persona emp : empleados) {
            if (emp.horaEntrada != null && emp.horaSalida != null) {
                emp.Generadordereportedetiempo();
                System.out.println();
            } else {
                System.out.println("Faltan registros para: " + emp.nombre);
                System.out.println();
            }
        }
    } 
}



    
    

