import java.util.Scanner;
// Clase Principal
class MainBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Registrar préstamo");
            System.out.println("4. Mostrar libros");
            System.out.println("5. Mostrar usuarios");
            System.out.println("6. Mostrar préstamos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingrese el autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int año = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingrese el género: ");
                    String genero = scanner.nextLine();
                    biblioteca.registrarLibro(new Libro(titulo, isbn, autor, año, genero));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el carnet: ");
                    String carnet = scanner.nextLine();
                    biblioteca.registrarUsuario(new Usuario(nombre, carnet));
                    break;
                case 3:
                    System.out.print("Ingrese el titulo del libro: ");
                    titulo = scanner.nextLine();
                    System.out.print("Ingrese el carnet del usuario: ");
                    carnet = scanner.nextLine();
                    System.out.print("Ingrese la fecha de préstamo (YYYY-MM-DD): ");
                    String fecha1 = scanner.nextLine();
                    System.out.print("Ingrese la fecha de devolución (YYYY-MM-DD): ");
                    String fecha2 = scanner.nextLine();

                    Libro libroPrestado = null;
                    for (Libro libro : biblioteca.getLibros()) {
                        if (libro.getTitulo().equals(titulo)) {
                            libroPrestado = libro;
                            break;
                        }
                    }

                    Usuario usuarioPrestamo = null;
                    for (Usuario usuario : biblioteca.getUsuarios()) {
                        if (usuario.getCarnet().equals(carnet)) {
                            usuarioPrestamo = usuario;
                            break;
                        }
                    }

                    if (libroPrestado != null && usuarioPrestamo != null) {
                        biblioteca.registrarPrestamo(new Prestamo(libroPrestado, usuarioPrestamo, fecha1, fecha2));
                    } else {
                        System.out.println("Error: Libro o Usuario no encontrado.");
                    }
                    break;
                case 4:
                    biblioteca.mostrarLibros();
                    break;
                case 5:
                    biblioteca.mostrarUsuarios();
                    break;
                case 6:
                    biblioteca.mostrarPrestamos();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}