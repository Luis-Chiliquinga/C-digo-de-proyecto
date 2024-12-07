
  public class Empleado extends Persona {
    
    public Empleado(String nombre, int ID, String niveldeAcceso, String horaEntrada, String horaSalida) {
        super(nombre, ID, niveldeAcceso, horaEntrada, horaSalida);
    }
    
    public void AtenderClientes() {
        System.out.println(nombre + " Está atendiendo a los clientes.");
    }

    private void resolucionDeProblemas() {
        System.out.println("Resolviendo problemas de sistemas para " + nombre);
    }
    
}

  