// Clase Prestamo
class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private String fecha1;
    private String fecha2;

    public Prestamo(Libro libro, Usuario usuario, String fecha1, String fecha2) {
        this.libro = libro;
        this.usuario = usuario;
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
    }

    @Override
    public String toString() {
        return "Libro: " + libro.getTitulo() + ", Usuario: " + usuario.getNombre() + ", Fecha de Préstamo: " + fecha1 + ", Fecha de Devolución: " + fecha2;
    }
}