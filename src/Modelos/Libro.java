
package Modelos;

import jakarta.persistence.*; 
import java.util.List;
@Entity
@Table(name="libro")
public class Libro {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id; 
    @Basic
    private String titulo;
    private String autor;
    private String genero; 
    private String codigo; 
    
    @OneToMany(mappedBy="lib")
    private List<Alquiler> alquilere; 

    public Libro(long id, String titulo, String autor, String genero, String codigo, List<Alquiler> alquilere) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.codigo = codigo;
        this.alquilere = alquilere;
    }

    public Libro() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Alquiler> getAlquilere() {
        return alquilere;
    }

    public void setAlquilere(List<Alquiler> alquilere) {
        this.alquilere = alquilere;
    }
    @Override
    public String toString() { 
        return this.id + " - " + this.titulo; 
    }
  
}
