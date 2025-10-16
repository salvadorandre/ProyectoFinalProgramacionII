
package Controladoras;

import Logica.AlquilerController;
import Modelos.Alquiler;
import Modelos.Cliente;
import Modelos.Libro;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class ControladoraAlquiler {
    
    AlquilerController control = new AlquilerController(); 
    public void guardarAlquiler(Cliente clienteSelec, Libro libroSelec, Date fechaInicial, Date fechaFin, String estado) {
        Alquiler alquiler = new Alquiler(); 
        
        alquiler.setClient(clienteSelec);
        alquiler.setLib(libroSelec);
        alquiler.setFechaAquiler(fechaInicial);
        alquiler.setFechaDevolucion(fechaFin);
        alquiler.setEstado(estado);
        control.create(alquiler);
        JOptionPane.showMessageDialog(null, "Alquiler creado con exito"); 
    }

    public List<Alquiler> traerAlquileres() {
        return control.all(); 
    }

    public void eliminarCliente(long idAlquiler) {
        control.delete(idAlquiler);
    }

    public Alquiler buscarAlquiler(long idAlquiler) {
        return control.findById(idAlquiler); 
    }

    public void actualizarAlquiler(Alquiler alquiler, Cliente clienteSelec, Libro libroSelec, Date fechaInicial, Date fechaFin, String estado) {
        alquiler.setClient(clienteSelec);
        alquiler.setLib(libroSelec);
        alquiler.setFechaAquiler(fechaInicial);
        alquiler.setFechaDevolucion(fechaFin);
        alquiler.setEstado(estado);
        control.update(alquiler);
        JOptionPane.showMessageDialog(null, "ALQUILER ACTUALIZADO");
    }

    public List<Alquiler> traerAlquileresPorTitulo(String valorFiltrado) {
        return control.findByTitle(valorFiltrado); 
    }

    public List<Alquiler> traerAlquileresPorGenero(String valorFiltrado) {
        return control.findByGenero(valorFiltrado); 
    }

    public List<Alquiler> traerAlquileresPorCliente(String valorFiltrado) {
        return control.findByClient(valorFiltrado); 
    }
    
}
