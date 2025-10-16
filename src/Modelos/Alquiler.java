
package Modelos;

import jakarta.persistence.*; 
import java.util.Date;

@Entity
@Table(name="alquiler")
public class Alquiler {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id; 
    
    
    private Date fechaAquiler; 
    private Date fechaDevolucion; 
    private String estado; 
    
    @ManyToOne
    private Cliente client; 
    
    @ManyToOne
    private Libro lib; 

    public Alquiler(long id, Date fechaAquiler, Date fechaDevolucion, String estado, Cliente client, Libro lib) {
        this.id = id;
        this.fechaAquiler = fechaAquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.client = client;
        this.lib = lib;
    }

    public Alquiler() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaAquiler() {
        return fechaAquiler;
    }

    public void setFechaAquiler(Date fechaAquiler) {
        this.fechaAquiler = fechaAquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Libro getLib() {
        return lib;
    }

    public void setLib(Libro lib) {
        this.lib = lib;
    }
  
    
}
