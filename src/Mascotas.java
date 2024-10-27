public class Mascotas {
    private String nombre;
    private int edad;
    private String raza;

    public Mascotas(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String mostrarMascotas() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nRaza: " + raza;
    }
}
