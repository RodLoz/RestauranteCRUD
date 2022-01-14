package GUI;

import DAO.LoginDAO;
import DAO.UsuarioDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logica.*;

public class IUClientes extends javax.swing.JFrame {

   
     IUClientes.FondoPanel fondo = new IUClientes.FondoPanel();
     ArrayList<UsuarioDAO> lista;
     LLamadoBD objLLamado = new LLamadoBD();
     DefaultTableModel tablaModel;
     UsuarioDAO objUsuario = new UsuarioDAO();
     
    public IUClientes() {
        this.setContentPane(fondo);
        initComponents();
        
        tablaModel = new DefaultTableModel();
        tablaModel.addColumn("Nombre");
        tablaModel.addColumn("Usuario");
        tablaModel.addColumn("Telefono");
        tablaModel.addColumn("Correo");
        this.table.setModel(tablaModel);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE CLIENTES");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("LISTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("MODIFICAR");

        jButton5.setText("REGRESAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USUARIO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CORREO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtNombre)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Listar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        IUAdmin objAdmin = new IUAdmin();
        objAdmin.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Eliminar();
       Listar();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Seleccionar();
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Registrar();
      Listar();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    public void Listar(){
        int i = 0;
        try {
            lista = objLLamado.cargarListaUsuarios();
            tablaModel.setNumRows(lista.size());
            
            for(UsuarioDAO objUsuario: lista){
                tablaModel.setValueAt(objUsuario.getNombre(), i, 0);
                tablaModel.setValueAt(objUsuario.getUser(), i, 1);        
                tablaModel.setValueAt(objUsuario.getTelefono(), i, 2);
                tablaModel.setValueAt(objUsuario.getCorreo(), i, 3);
                i++;
                }
        
            table.setModel(tablaModel);
        } catch (Exception e) {
        }        
    }
    
    public void LimpiarCampos(){
        txtNombre.setText("");
        txtUser.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
    }
    
    public void Seleccionar(){
        try {
            txtNombre.setText(table.getValueAt(table.getSelectedRow(),0).toString());
            txtUser.setText(table.getValueAt(table.getSelectedRow(),1).toString());
            txtTelefono.setText(table.getValueAt(table.getSelectedRow(),2).toString());
            txtCorreo.setText(table.getValueAt(table.getSelectedRow(),3).toString());
        } catch (Exception e) {
        }     
        
    }
    
    public void Eliminar(){
        int i = 0;
        objUsuario = null;
        
        if(txtNombre.getText().length() !=0){
            objUsuario = new UsuarioDAO();
            objUsuario.setNombre(txtNombre.getText());
            i = objLLamado.EliminarRegistro(objUsuario);
        switch(i){
            case 1 : {
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "REGISTRO NO ELIMINADO");
            }
        }        
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO PARA ELIMINAR");
        }
        LimpiarCampos();                                                                                                                                                                                        
    }
    
    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/fondoAdm2.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
     private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }

    public void Registrar(){
        UsuarioDAO objUsuario = null;
        LLamadoBD objLLamado = null;
         LoginDAO objLoginDAO = null;      
        
       if(txtNombre.getText().isEmpty() || txtCorreo.getText().isEmpty() ||
          txtUser.getText().isEmpty() || txtPassword.getText().isEmpty() || txtTelefono.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "PORFAVOR LLENAR TODOS LOS DATOS"); 
                                
       }else{      
         String nombre = txtNombre.getText();
         String correo = txtCorreo.getText();
         String user = txtUser.getText();
         String password = txtPassword.getText();
         int telefono = Integer.parseInt(txtTelefono.getText());
         
            if(isNumeric(nombre)){
            JOptionPane.showMessageDialog(null, "Ingrese correctamente su nombre");
            txtNombre.setForeground(Color.red);
            }else if(isNumeric(correo)){
            JOptionPane.showMessageDialog(null, "Ingrese correctamente su correo");
            txtCorreo.setForeground(Color.red);            
               }else{                
             int i = 0; 
                objUsuario = new UsuarioDAO();
                objLLamado = new LLamadoBD();
                objUsuario.setNombre(nombre);
                objUsuario.setCorreo(correo);
                objUsuario.setUser(user);
                objUsuario.setPassword(password);
                objUsuario.setTelefono(telefono);  
                
                
                objLoginDAO = new LoginDAO();
                objLoginDAO.setIdNombre(nombre);     
                objLoginDAO.setIdUser(user);
                objLoginDAO.setPassword(password);                       
                
                    objLLamado.insertarUser(objLoginDAO);                
                i = objLLamado.guardarDatosUsuarios(objUsuario);
                       switch(i){
                           case 1:{
                               JOptionPane.showMessageDialog(null, "Se inserto los datos");
                               txtNombre.setText("");
                               txtCorreo.setText("");
                               txtTelefono.setText("");
                               txtUser.setText("");
                               txtPassword.setText("");
                               break;
                           }
                           default:
                               JOptionPane.showMessageDialog(null, "No se inserto los datos");                               
                       }
            }
                                 
        }
    }

}
