package GUI;
import DAO.LoginDAO;
import DAO.UsuarioDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logica.*;
public class IURegistro extends javax.swing.JFrame {

    
    IURegistro.FondoPanel fondo = new IURegistro.FondoPanel();
    
    public IURegistro() {
        this.setContentPane(fondo);
        initComponents();   
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR CUENTA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresar Correo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresar Telefono:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresar User:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresar Password:");

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCerrar.setText("REGRESAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));

        txtPassword.setToolTipText("");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel6)
                        .addGap(57, 57, 57)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnRegistrar)
                        .addGap(66, 66, 66)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre)
                                .addGap(30, 30, 30)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnCerrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnCerrar)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnLimpiar)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registrar();
       // insertarUsuario();
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    
     public void Registrar(){
        UsuarioDAO objUsuario = null;
        LoginDAO objLoginDAO = null;
        LLamadoBD objLLamado = null;
              
        
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
    
     
     public void insertarUsuario(){
         LoginDAO objLoginDAO = null;
         LLamadoBD objLLamado = null;           
         String nombre = txtNombre.getText();      
         String user = txtUser.getText();
         String password = txtPassword.getText();  
           
             int i = 0; 
                objLoginDAO = new LoginDAO();
                objLLamado = new LLamadoBD();
                objLoginDAO.setIdNombre(nombre);     
                objLoginDAO.setIdUser(user);
                objLoginDAO.setPassword(password);                       
                
                i = objLLamado.insertarUser(objLoginDAO);
       }    
       
     
     
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      IUInicio objInicio = new IUInicio();
      objInicio.setVisible(true);
      this.setVisible(false);
      
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtCorreo.setText("");
        txtPassword.setText("");
        txtTelefono.setText("");
        txtUser.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
           
    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IURegistro().setVisible(true);
            }
        });
    }

    public void ActualizarDatos(){
        int i = 0;
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
