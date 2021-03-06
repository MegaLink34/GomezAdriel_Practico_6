package Menu;

import Directorio.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL MEGAS
 */
public class VistaBusquedaCliente extends javax.swing.JInternalFrame {
    
    HashMap<String, Cliente> directorio;
    /**
     * Creates new form VistaBusquedaCliente
     */
    public VistaBusquedaCliente(HashMap<String, Cliente> directorio) {
        initComponents();
        
        this.directorio = directorio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        textFieldDomicilio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        textFieldTelefono = new javax.swing.JTextField();
        btnBuscarTelefono = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldCiudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnBuscarApellido = new javax.swing.JButton();
        btnBuscarCiudad = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Domicilio:");

        textFieldDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDomicilioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Telefono:");

        textFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefonoActionPerformed(evt);
            }
        });

        btnBuscarTelefono.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscarTelefono.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBuscarTelefono.setText("Buscar");
        btnBuscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTelefonoActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 255));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Buscar Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Apellido:");

        textFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("DNI:");

        textFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDNIActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Ciudad:");

        textFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCiudadActionPerformed(evt);
            }
        });

        jLabel8.setText("Llene el campo y utilice el boton a su lado.");

        jLabel9.setText("los clientes de esa ciudad.");

        jLabel10.setText("Coloque un telefono para buscar una persona.");

        jLabel11.setText("Coloque una ciudad para ver todos");

        jLabel12.setText("los numeros asociados a ese apellido.");

        jLabel13.setText("Coloque un apellido para ver todos");

        btnBuscarApellido.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscarApellido.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBuscarApellido.setText("Buscar");
        btnBuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarApellidoActionPerformed(evt);
            }
        });

        btnBuscarCiudad.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscarCiudad.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBuscarCiudad.setText("Buscar");
        btnBuscarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpiar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalir))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(9, 9, 9)
                                .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarTelefono)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(26, 26, 26)
                                        .addComponent(textFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(52, 52, 52)
                                        .addComponent(textFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textFieldApellido)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarApellido)
                                    .addComponent(btnBuscarCiudad)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTelefono))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDomicilioActionPerformed

    private void textFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTelefonoActionPerformed

    private void btnBuscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelefonoActionPerformed
        // TODO add your handling code here:
        
        String telefono = textFieldTelefono.getText();
        
        if(telefono.equals("")){
            
            JOptionPane.showMessageDialog(null, "Ingrese un telefono.");
            
        } else{
            
            Cliente clienteEncontrado = MenuPrincipal.getDirectorio().buscarCliente(telefono);
            
            JOptionPane.showMessageDialog(null, "Cliente encontrado.");
            
            textFieldNombre.setText(clienteEncontrado.getNombre());
            textFieldApellido.setText(clienteEncontrado.getApellido());
            textFieldDNI.setText(clienteEncontrado.getDni());
            textFieldDomicilio.setText(clienteEncontrado.getDomicilio());
            textFieldCiudad.setText(clienteEncontrado.getCiudad());
            
        }
    }//GEN-LAST:event_btnBuscarTelefonoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        textFieldNombre.setText("");
        textFieldApellido.setText("");
        textFieldDNI.setText("");
        textFieldDomicilio.setText("");
        textFieldCiudad.setText("");
        textFieldTelefono.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void textFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldApellidoActionPerformed

    private void textFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDNIActionPerformed

    private void textFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCiudadActionPerformed

    private void btnBuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarApellidoActionPerformed
        // TODO add your handling code here:
        
        String apellido = textFieldApellido.getText();
        
        ArrayList<String> telefonosEncontrados = new ArrayList<>();
        
        if(apellido.equals("")){
            
            JOptionPane.showMessageDialog(null, "Ingrese un apellido.");
            
        } else{
            
            telefonosEncontrados = MenuPrincipal.getDirectorio().buscarTelefono(apellido);
            
            JOptionPane.showMessageDialog(null, "Se encontraron " + telefonosEncontrados.size() + " telefonos");
            
            for (int i = 0; i < telefonosEncontrados.size(); i++) {
                                
                JOptionPane.showMessageDialog(null, "Telefono " + (i+1) + ": " + telefonosEncontrados.get(i));
                
            }
        }
    }//GEN-LAST:event_btnBuscarApellidoActionPerformed

    private void btnBuscarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCiudadActionPerformed
        // TODO add your handling code here:
        String ciudad = textFieldCiudad.getText();

        ArrayList<Cliente> clientes = new ArrayList<>();

        if(ciudad.equals("")){
            
            JOptionPane.showMessageDialog(null, "Ingrese una ciudad.");
            
        }else{
            
            clientes = MenuPrincipal.getDirectorio().buscarClientes(ciudad);
            
            JOptionPane.showMessageDialog(null, "Se encontraron " + clientes.size() + " clientes");
            
            for (int i = 0; i < clientes.size(); i++) {
                                
                JOptionPane.showMessageDialog(null, "Cliente " + (i+1) + ":\n Telefono: " + MenuPrincipal.getDirectorio().buscarTelefono(clientes.get(i).getApellido()) + "\n" + clientes.get(i).toString());
                
            }
            
        }
    }//GEN-LAST:event_btnBuscarCiudadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarApellido;
    private javax.swing.JButton btnBuscarCiudad;
    private javax.swing.JButton btnBuscarTelefono;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textFieldApellido;
    private javax.swing.JTextField textFieldCiudad;
    private javax.swing.JTextField textFieldDNI;
    private javax.swing.JTextField textFieldDomicilio;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
