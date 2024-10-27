public class Ciudadanos {
    private String nombre;
    private String apellido;
    private int edad;

    public Ciudadanos(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrarCiudadanos() {
        return "Nombre: " + nombre + ", \napellido: " + apellido + ", \nedad: " + edad;
    }
}
