class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private int fechaPubli;
    private String genero;

    public Libro(String titulo, String isbn, String autor, int fechaPubli, String genero) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.fechaPubli = fechaPubli;
        this.genero = genero;
    }

    // Métodos getter y setter
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public int getfechaPubli() {
        return fechaPubli;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", ISBN: " + isbn + ", Autor: " + autor + ", Publicado en: " + fechaPubli + ", Género: " + genero;
    }
}


