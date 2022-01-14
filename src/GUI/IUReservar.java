package GUI;

import DAO.LoginDAO;
import DAO.ReservaDAO;
import DAO.UsuarioDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logica.LLamadoBD;


public class IUReservar extends javax.swing.JFrame {
    
   int maxCantPers = 8;
   int totalReservas= 20;
   java.util.Date fechaActual = new Date();
   private String idUser;
   
   IUReservar.FondoPanel fondo = new IUReservar.FondoPanel();
    public IUReservar() {
        this.setContentPane(fondo);
        initComponents();        
    }
     public String getIdUser() {
         //System.out.println(idUser);
        return idUser;          
    }

    public void setIdUser(String idUser) {
        System.out.println(idUser);  
        this.idUser = idUser;        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSDateChooser1 = new rojerusan.RSDateChooser();
        rSDateChooser2 = new rojeru_san.rsdate.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        escogerLocal = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAComent = new javax.swing.JTextArea();
        txtCantPers = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        calendar = new rojeru_san.rsdate.RSDateChooser();
        lblLimite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESERVA");

        escogerLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SAN BORJA", "SAN ISIDRO", "LA MOLINA", "MIRAFLORES" }));
        escogerLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escogerLocalActionPerformed(evt);
            }
        });

        txtAComent.setColumns(20);
        txtAComent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAComent.setRows(5);
        jScrollPane1.setViewportView(txtAComent);

        txtCantPers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RESERVAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblLimite.setBackground(new java.awt.Color(255, 255, 255));
        lblLimite.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblLimite.setForeground(new java.awt.Color(204, 0, 0));
        lblLimite.setToolTipText("");
        lblLimite.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(escogerLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escogerLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtCantPers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.setVisible(false);
     IUInicio objinicio = new IUInicio();
     objinicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Reservar();     
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void escogerLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escogerLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escogerLocalActionPerformed

   
      public void Reservar(){
        UsuarioDAO objUsuario = new UsuarioDAO();        
        ReservaDAO objReservaDAO = new ReservaDAO();       
        LLamadoBD objLLamado =  new LLamadoBD();        
        String idUser =  this.getIdUser();               
        int cantPerson = 0;
         
        
        String local =  escogerLocal.getSelectedItem().toString();            
        Date fecha = calendar.getDatoFecha();
        objLLamado.cantidadReservas(fecha,local);
         int cantReservasAct = objLLamado.cantidadReservas(fecha, local);         
         
       if(escogerLocal.getSelectedItem().equals(false)|| txtCantPers.getText().isEmpty() ||
          txtAComent.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "PORFAVOR LLENAR TODOS LOS DATOS");  
       }else if(calendar.getDatoFecha()== null){                
           JOptionPane.showMessageDialog(this, "SELECCIONAR UNA FECHA", "ERROR", JOptionPane.ERROR_MESSAGE);            
       }else if(calendar.getDatoFecha().before(fechaActual)){
           JOptionPane.showMessageDialog(this, "LA FECHA ES INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE); 
       }else{        
            cantPerson = Integer.parseInt(txtCantPers.getText());
        if(cantPerson > maxCantPers){
            lblLimite.setText("Este local acepta un maximo de 8 personas");
        }else if (cantReservasAct >= totalReservas){             
             JOptionPane.showMessageDialog(null, "Por ahora no contamos con reservas disponibles");            
        }else{ 
             lblLimite.setText("");
           // String local =  escogerLocal.getSelectedItem().toString();            
            //Date fecha = calendar.getDatoFecha();
            String cometario = txtAComent.getText();                  
            String formatoFecha = "dd MMMM yyyy";               
            SimpleDateFormat formato = new SimpleDateFormat(formatoFecha);             
            JOptionPane.showMessageDialog(this, "LA FECHA SELECCIONADA ES: " + formato.format(fecha), "ERROR", JOptionPane.INFORMATION_MESSAGE);
              
                                       
             int i = 0;               
                         
                objReservaDAO.setIdUsuario(idUser);
                objReservaDAO.setLocal(local);
                objReservaDAO.setObservacion(cometario);
                objReservaDAO.setCantPersonas(cantPerson);
                objReservaDAO.setFecha(fecha);             
             
                i = objLLamado.guardarDatosReservas(objReservaDAO);
                    
                  
                   
                       switch(i){                          
                           case 1:{
                               JOptionPane.showMessageDialog(null, "RESERVA REALIZADA CON EXITO");
                               txtCantPers.setText("");
                               txtAComent.setText("");                               
                               break;
                           }
                           default:
                               JOptionPane.showMessageDialog(null, "NO SE REALIZO LA RESERVA");                               
                       }
            }            
        }
      }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUReservar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsdate.RSDateChooser calendar;
    private javax.swing.JComboBox<String> escogerLocal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLimite;
    private rojerusan.RSDateChooser rSDateChooser1;
    private rojeru_san.rsdate.RSDateChooser rSDateChooser2;
    private javax.swing.JTextArea txtAComent;
    private javax.swing.JTextField txtCantPers;
    // End of variables declaration//GEN-END:variables

// End of variables declaration                   

    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }


}
