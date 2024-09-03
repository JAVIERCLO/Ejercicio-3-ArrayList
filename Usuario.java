// Clase Usuario
class Usuario {
    private String nombre;
    private String carnet;

    public Usuario(String nombre, String carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Carnet: " + carnet;
    }
}
