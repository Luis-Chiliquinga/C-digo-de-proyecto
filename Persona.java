
public abstract class Persona {
    public String nombre;
    public String niveldeacceso;
    public int ID;
    public String horaEntrada;
    public String horaSalida;
    
    public Persona(String nombre,int ID, String niveldeacceso, String horaEntrada, String horaSalida){
         this.nombre = nombre;
         this.ID = ID;
         this.niveldeacceso = niveldeacceso;
         this.horaEntrada = horaEntrada;
         this.horaSalida = horaSalida;
     }
    public void Generadordereportedetiempo(){
        System.out.println("Reporte de Tiempo:");
        System.out.println(" ");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + ID);
        System.out.println("Nivel de Acceso: " + niveldeacceso);
        System.out.println("Hora de Entrada: " + horaEntrada + " horas");
        System.out.println("Hora de Salida: " + horaSalida + " horas");
    }
}
