
package Controladoras;

import Logica.ClienteController;
import Modelos.Cliente;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladoraCliente {

    ClienteController control = new ClienteController(); 
    public void guardarCliente(String nombreCliente, String apellidoCliente, String correoCliente, String telefonoCliente) {
        Cliente cliente = new Cliente(); 
        
        cliente.setNombre(nombreCliente);
        cliente.setApellido(apellidoCliente);
        cliente.setCorreo(correoCliente);
        cliente.setTelefono(telefonoCliente);
        
        control.create(cliente);
        
        JOptionPane.showMessageDialog(null, "El cliente se guardo con exito");
    }

    public List<Cliente> traerClientes() {
        return control.all(); 
    }

    public void eliminarCliente(long idCliente) {
        control.delete(idCliente);
        
        JOptionPane.showMessageDialog(null, "CLIENTE ELIMINADO CORRECTAMENTE");
    }

    public Cliente encontrarCliente(long idCliente) {
        return control.findById(idCliente);
    }

    public void actualizarCliente(Cliente cliente, String nombreNuevo, String apellidoNuevo, String correoNuevo, String telefonoNuevo) {
        
        cliente.setNombre(nombreNuevo);
        cliente.setApellido(apellidoNuevo);
        cliente.setCorreo(correoNuevo);
        cliente.setTelefono(telefonoNuevo);
        
        control.edit(cliente);
        JOptionPane.showMessageDialog(null, "CLIENTE ACTUALIZADO CORRECTAMENTE");
    }
    
}
