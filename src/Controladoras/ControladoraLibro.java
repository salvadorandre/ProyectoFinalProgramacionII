
package Controladoras;

import Logica.LibroController;
import Modelos.Libro;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladoraLibro {

    LibroController control = new LibroController(); 
    public void guardarLibro(String tituloLibro, String autorLibro, String generoLibro, String codigoLibro) {
        
        Libro libro = new Libro(); 
        libro.setTitulo(tituloLibro);
        libro.setAutor(autorLibro);
        libro.setGenero(generoLibro);
        libro.setCodigo(codigoLibro);
        
        control.create(libro);
        JOptionPane.showMessageDialog(null, "El libro se agrego con exito");
    }

    public List<Libro> traerLibros() {
        return control.all(); 
    }

    public void eliminarLibro(long idLibro) {
        control.delete(idLibro);
        JOptionPane.showMessageDialog(null, "LIBRO ELIMINADO CORRECTAMENTE");
    }

    public Libro buscarLibro(long idLibro) {
        return control.findById(idLibro); 
    }

    public void actualizarLibro(Libro libro, String tituloNuevo, String generoNuevo, String autorNuevo, String codigoNuevo) {
        libro.setTitulo(tituloNuevo);
        libro.setGenero(generoNuevo);
        libro.setAutor(autorNuevo);
        libro.setCodigo(codigoNuevo);
        
        control.edit(libro);
        JOptionPane.showMessageDialog(null, "LIBRO ACTUALIZADO CORRECTAMENTE");
    }
    
}
