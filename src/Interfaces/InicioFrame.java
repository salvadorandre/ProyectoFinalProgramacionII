
package Interfaces;

public class InicioFrame extends javax.swing.JFrame {

    public InicioFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        clienteBoton = new javax.swing.JButton();
        libroBoton = new javax.swing.JButton();
        alquilerBoton = new javax.swing.JButton();
        sallirBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 18)); // NOI18N
        jLabel1.setText("SISTEMA PARA ALQUILER DE LIBROS");

        clienteBoton.setText("CLIENTES");
        clienteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBotonActionPerformed(evt);
            }
        });

        libroBoton.setText("LIBROS");
        libroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroBotonActionPerformed(evt);
            }
        });

        alquilerBoton.setText("ALQUILER");
        alquilerBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilerBotonActionPerformed(evt);
            }
        });

        sallirBoton.setText("SALIR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clienteBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(libroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alquilerBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sallirBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(clienteBoton)
                .addGap(18, 18, 18)
                .addComponent(libroBoton)
                .addGap(18, 18, 18)
                .addComponent(alquilerBoton)
                .addGap(18, 18, 18)
                .addComponent(sallirBoton)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
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

    private void clienteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteBotonActionPerformed
        
        ClienteInterfaz cliente = new ClienteInterfaz();
        cliente.setTitle("CLIENTES");
        cliente.setLocationRelativeTo(null);
        cliente.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_clienteBotonActionPerformed

    private void libroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroBotonActionPerformed
        LibroFrame libro = new LibroFrame(); 
        libro.setTitle("LIBROS");
        libro.setLocationRelativeTo(null);
        libro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_libroBotonActionPerformed

    private void alquilerBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilerBotonActionPerformed

        AlquilerFrame alquiler = new AlquilerFrame(); 
        alquiler.setTitle("ALQUILERES");
        alquiler.setLocationRelativeTo(null);
        
        alquiler.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_alquilerBotonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alquilerBoton;
    private javax.swing.JButton clienteBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton libroBoton;
    private javax.swing.JButton sallirBoton;
    // End of variables declaration//GEN-END:variables
}
