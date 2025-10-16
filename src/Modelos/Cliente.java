
package Modelos;

import jakarta.persistence.*; 
import java.util.List;

@Entity
@Table(name="cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private long id; 
    
    @Basic
    private String nombre; 
    private String apellido; 
    private String correo; 
    private String telefono; 
    
    @OneToMany(mappedBy = "client")
    private List<Alquiler> alquileres; 

    public Cliente() {
    }

    public Cliente(long id, String nombre, String apellido, String correo, String telefono, List<Alquiler> alquileres) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.alquileres = alquileres;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
    
    @Override
    public String toString() { 
        return id + " - " + nombre; 
    }
  
    
}
