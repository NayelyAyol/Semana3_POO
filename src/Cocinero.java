public class Cocinero {
    public String nombre, especialidad;
    public int experiencia;

    public Cocinero(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public void mostrarInfo() {
        System.out.println("\nNombre: " + nombre+"\nEspecialidad: " + especialidad+"\nExperiencia: " + experiencia+"\n");
    }
}