
package Interfaces;

import Controladoras.ControladoraAlquiler;
import Controladoras.ControladoraCliente;
import Controladoras.ControladoraLibro;
import Modelos.Alquiler;
import Modelos.Cliente;
import Modelos.Libro;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlquilerFrame extends javax.swing.JFrame {
    ControladoraAlquiler control = null; 

    public AlquilerFrame() {
        initComponents();
        llenarClientes(); 
        llenarLibros(); 
        control = new ControladoraAlquiler(); 
        crearTabla(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        guardar3 = new javax.swing.JButton();
        editar3 = new javax.swing.JButton();
        eliminar3 = new javax.swing.JButton();
        comboCliente = new javax.swing.JComboBox<>();
        comboLibro = new javax.swing.JComboBox<>();
        fechaInicio = new com.toedter.calendar.JDateChooser();
        fechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAquiler = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        filtrado = new javax.swing.JTextField();
        selector = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 18)); // NOI18N
        jLabel1.setText("ALQUILERES");

        jLabel14.setText("CLIENT:");

        jLabel15.setText("LIBRO:");

        jLabel16.setText("F. INICIO:");

        jLabel17.setText("F. ENTRE:");

        guardar3.setText("GUARDAR");
        guardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar3ActionPerformed(evt);
            }
        });

        editar3.setText("EDITAR");
        editar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar3ActionPerformed(evt);
            }
        });

        eliminar3.setText("ELIMINAR");
        eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar3ActionPerformed(evt);
            }
        });

        jLabel2.setText("ESTADO:");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "alquilado", "devuelto", "perdido" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guardar3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(editar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(guardar3)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(comboLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(editar3)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel16))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(eliminar3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(331, Short.MAX_VALUE))
        );

        tableAquiler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableAquiler);

        jLabel18.setText("BUSCAR POR: ");

        selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ninguno", "libro", "genero", "cliente" }));
        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });

        jButton4.setText("REFRESCAR TABLA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(filtrado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(filtrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("regresar al inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar3ActionPerformed
       Cliente clienteSelec = (Cliente) comboCliente.getSelectedItem();
       Libro libroSelec = (Libro) comboLibro.getSelectedItem(); 
       Date fechaInicial = fechaInicio.getDate(); 
       Date fechaFin = fechaFinal.getDate(); 
       String estado = String.valueOf(comboEstado.getSelectedItem());
       
       control.guardarAlquiler(clienteSelec, libroSelec, fechaInicial, fechaFin, estado); 
       resetValues();
       crearTabla(); 
    }//GEN-LAST:event_guardar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InicioFrame inicio = new InicioFrame();
        inicio.setTitle("INICIO");
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void editar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar3ActionPerformed

        if(tableAquiler.getRowCount() > 0) {
            if(tableAquiler.getSelectedRow() != -1) {
                long idAlquiler = (long) tableAquiler.getValueAt(tableAquiler.getSelectedRow(),0); 
                AlquilerEdit al = new AlquilerEdit(idAlquiler); 
                al.setTitle("Actualizando el alquiler no. " + idAlquiler);
                al.setVisible(true);
            }
            else { 
                JOptionPane.showMessageDialog(null, "SELECCIONE UN ALQUILER");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        crearTabla(); 


    }//GEN-LAST:event_editar3ActionPerformed

    private void eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar3ActionPerformed
         if(tableAquiler.getRowCount() > 0) {
            if(tableAquiler.getSelectedRow() != -1) {
                long idAlquiler = (long) tableAquiler.getValueAt(tableAquiler.getSelectedRow(),0); 
                control.eliminarCliente(idAlquiler); 
            }
            else { 
                JOptionPane.showMessageDialog(null, "SELECCIONE UN ALQUILER");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        crearTabla(); 
    }//GEN-LAST:event_eliminar3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        crearTabla(); 

    }//GEN-LAST:event_jButton4ActionPerformed

    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorActionPerformed
    
    private void resetValues() { 
        comboCliente.setSelectedIndex(0);
        comboLibro.setSelectedIndex(0);
        fechaInicio.setDate(null);
        fechaFinal.setDate(null);
    }
    private void llenarLibros() { 
        ControladoraLibro control = new ControladoraLibro(); 
        List<Libro> libros = control.traerLibros(); 
        
        for(Libro lib : libros) { 
            comboLibro.addItem(lib);
        }
    }

    private void llenarClientes() {
        ControladoraCliente control = new ControladoraCliente(); 
        List<Cliente> clientes = control.traerClientes(); 
        
        for(Cliente client : clientes) { 
            comboCliente.addItem(client);
        }
    }
    
    private void crearTabla() { 
        DefaultTableModel dtm = new DefaultTableModel() { 
            @Override
            public boolean isCellEditable(int row, int column) { 
               return false;  
            }; 
        }; 
        
        String titulos[] = {"id", "cliente", "libro", "fech. Alqui", "fech. entrega", "estado"}; 
        dtm.setColumnIdentifiers(titulos); 
        String tipo = (String) selector.getSelectedItem(); 
        List<Alquiler> alquileres = control.traerAlquileres(); 
        String valorFiltrado = filtrado.getText().trim(); 
        switch (tipo) {
            case "Ninguno" -> alquileres = control.traerAlquileres();
            case "libro" -> alquileres = control.traerAlquileresPorTitulo(valorFiltrado);
            case "genero" -> alquileres = control.traerAlquileresPorGenero(valorFiltrado);
            case "cliente" -> alquileres = control.traerAlquileresPorCliente(valorFiltrado);
            default -> {
            }
        }
        if(alquileres != null) {
            for(Alquiler alq : alquileres) { 
                Object [] objeto = {
                    alq.getId(),
                    alq.getClient().getNombre(), 
                    alq.getLib().getTitulo(), 
                    alq.getFechaAquiler(), 
                    alq.getFechaDevolucion(), 
                    alq.getEstado()
                }; 
                dtm.addRow(objeto);
            }
        }
        
        tableAquiler.setModel(dtm);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cliente> comboCliente;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<Libro> comboLibro;
    private javax.swing.JButton editar3;
    private javax.swing.JButton eliminar3;
    private com.toedter.calendar.JDateChooser fechaFinal;
    private com.toedter.calendar.JDateChooser fechaInicio;
    private javax.swing.JTextField filtrado;
    private javax.swing.JButton guardar3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selector;
    private javax.swing.JTable tableAquiler;
    // End of variables declaration//GEN-END:variables
}
