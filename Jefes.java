
 public class Jefes extends Persona {
    public int niveldeAutoridad;

    public Jefes(String nombre, int ID, String nivelDeAcceso, String horaEntrada, String horaSalida, int niveldeAutoridad) {
        super(nombre, ID, nivelDeAcceso, horaEntrada, horaSalida);
        this.niveldeAutoridad = niveldeAutoridad;
    }

    public void RegistroDeDatosDeEmpleados() {
        System.out.println("Registro de datos de empleados para " + nombre);
    }
}
