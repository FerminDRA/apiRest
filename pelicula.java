//Entity peliculas
public class Pelicula {
    
private Integer ID_pelicula;
private String titulo;
private String sinopsis;
private int año;
private int valor_puntos;

public Pelicula(Integer iD_pelicula, String titulo, String sinopsis, int año, int valor_puntos) {
    ID_pelicula = iD_pelicula;
    this.titulo = titulo;
    this.sinopsis = sinopsis;
    this.año = año;
    this.valor_puntos = valor_puntos;
    }
public String getSinopsis() {
    return sinopsis;
}
public void setSinopsis(String sinopsis) {
    this.sinopsis = sinopsis;
}
public int getAño() {
    return año;
}
public void setAño(int año) {
    this.año = año;
}
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public Integer getID_pelicula() {
    return ID_pelicula;
}
public void setID_pelicula(Integer iD_pelicula) {
    this.ID_pelicula = iD_pelicula;
}
public int getValor_puntos() {
    return valor_puntos;
}
public void setValor_puntos(int valor_puntos) {
    this.valor_puntos = valor_puntos;
}

}
