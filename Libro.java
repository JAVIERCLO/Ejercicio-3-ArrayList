//Clase con metodos y atributos de libro
public class Libro {
    //Atributos
    private  String titulo;
    private String ISBN;
    private String autor;
    private String fechaPubli;
    private String genero;
    //Constructor
    public Libro(String isbn, String titulo, String autor, int fechaPubli, String genero) {
    }
    //Metodos
    //set & get
    //titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(String titulo){
        return this.titulo;
    }
    //ISBN
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN(String ISBN){
        return this.ISBN;
    }
    //autor
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor(String autor){
        return this.autor;
    }
    //fecha de publicacion
    public void setFechapubli(String fechaPubli) {
        this.fechaPubli = fechaPubli;
    }
    public String getfechaPubli(String fechaPubli){
        return this.fechaPubli;
    }
    //genero
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getgenero(String genero){
        return this.genero;
    }
}
