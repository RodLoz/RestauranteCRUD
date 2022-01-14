package GUI;

import DAO.ReservaDAO;
import DAO.UsuarioDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logica.*;

public class IUReservas extends javax.swing.JFrame {
   
     IUReservas.FondoPanel fondo = new IUReservas.FondoPanel();
     ArrayList<ReservaDAO> listaReservas;
     LLamadoBD objLLamado = new LLamadoBD();
     DefaultTableModel tablaModel;
     ReservaDAO objReservaDAO = new ReservaDAO();  
     IUReservar objReservar = new IUReservar();
     
    public IUReservas() {
        this.setContentPane(fondo);
        initComponents();
        
        tablaModel = new DefaultTableModel();
        tablaModel.addColumn("IDReserva");
        tablaModel.addColumn("IDUser");
        tablaModel.addColumn("Local");
        tablaModel.addColumn("Fecha");
        tablaModel.addColumn("Cant.Personas");
        tablaModel.addColumn("Observaciones");
        this.table.setModel(tablaModel);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bttnNuevaReser = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtReserva = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtLocal = new javax.swing.JTextField();
        txtCanPersonas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObser = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cmbListar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE RESERVAS");

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

        bttnNuevaReser.setText("NUEVA RESERVA");
        bttnNuevaReser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnNuevaReserActionPerformed(evt);
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

        jButton5.setText("REGRESAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IDRESERVA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IDUSER");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOCAL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANT. PERSONAS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("OBSERVACION");

        txtObser.setColumns(20);
        txtObser.setRows(5);
        jScrollPane2.setViewportView(txtObser);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FECHA");

        cmbListar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LISTAR POR FECHA", "LISTAR POR LOCAL", " " }));
        cmbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnNuevaReser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(cmbListar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                    .addComponent(txtLocal)
                                    .addComponent(txtCanPersonas)
                                    .addComponent(txtReserva)
                                    .addComponent(jScrollPane2)
                                    .addComponent(txtFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(130, 130, 130)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCanPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bttnNuevaReser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbListar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ListarReservas();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        IUAdmin objAdmin = new IUAdmin();
        objAdmin.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        Eliminar();
       ListarReservas();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Seleccionar();
       
    }//GEN-LAST:event_tableMouseClicked

    private void bttnNuevaReserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnNuevaReserActionPerformed
        objReservar.setVisible(true);
        this.setVisible(false);
        ListarReservas();
    }//GEN-LAST:event_bttnNuevaReserActionPerformed

    private void cmbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListarActionPerformed
       filtrarReservas();
    }//GEN-LAST:event_cmbListarActionPerformed

   
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUReservas().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnNuevaReser;
    private javax.swing.JComboBox<String> cmbListar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCanPersonas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextArea txtObser;
    private javax.swing.JTextField txtReserva;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    
    public void filtrarReservas(){
    LLamadoBD objLLamado =  new LLamadoBD();  
    String filtro =  cmbListar.getSelectedItem().toString(); 
     int i = 0;
    try {
    listaReservas = objLLamado.filtrarReservas(filtro);
    tablaModel.setNumRows(listaReservas.size());
    for(ReservaDAO objReservaDAO: listaReservas){
                tablaModel.setValueAt(objReservaDAO.getIdReserva(), i, 0);
                tablaModel.setValueAt(objReservaDAO.getIdUsuario(), i, 1);        
                tablaModel.setValueAt(objReservaDAO.getLocal(), i, 2);
                tablaModel.setValueAt(objReservaDAO.getFecha(), i, 3);
                tablaModel.setValueAt(objReservaDAO.getCantPersonas(), i, 4);
                tablaModel.setValueAt(objReservaDAO.getObservacion(), i, 5);
                i++;
                }
        
            table.setModel(tablaModel);
    } catch (Exception e) {
        }     
    
    }
   
    public void ListarReservas(){
        int i = 0;
        try {
            listaReservas = objLLamado.cargarListaReservas();
            tablaModel.setNumRows(listaReservas.size());
            
            for(ReservaDAO objReservaDAO: listaReservas){
                tablaModel.setValueAt(objReservaDAO.getIdReserva(), i, 0);
                tablaModel.setValueAt(objReservaDAO.getIdUsuario(), i, 1);        
                tablaModel.setValueAt(objReservaDAO.getLocal(), i, 2);
                tablaModel.setValueAt(objReservaDAO.getFecha(), i, 3);
                tablaModel.setValueAt(objReservaDAO.getCantPersonas(), i, 4);
                tablaModel.setValueAt(objReservaDAO.getObservacion(), i, 5);
                i++;
                }
        
            table.setModel(tablaModel);
        } catch (Exception e) {
        }        
    }
    
    public void LimpiarCampos(){
        txtReserva.setText("");
        txtUser.setText("");
        txtLocal.setText("");
        txtFecha.setText("");
        txtCanPersonas.setText("");
        txtObser.setText("");
    }
    
    public void Seleccionar(){
        try {            
            txtReserva.setText(table.getValueAt(table.getSelectedRow(),0).toString());
            txtUser.setText(table.getValueAt(table.getSelectedRow(),1).toString());
            txtLocal.setText(table.getValueAt(table.getSelectedRow(),2).toString());
            txtFecha.setText(table.getValueAt(table.getSelectedRow(),3).toString());
            txtCanPersonas.setText(table.getValueAt(table.getSelectedRow(),4).toString());
            txtObser.setText(table.getValueAt(table.getSelectedRow(),5).toString());           
        } catch (Exception e) {
        }     
        
    }
    
    public void Eliminar(){
        int i = 0;
        objReservaDAO = null;
        
        if(txtReserva.getText().length() !=0){
            objReservaDAO = new ReservaDAO();
           String _idReserva =  txtReserva.getText();            
            i = objLLamado.EliminarReserva(_idReserva);
           
        switch(i){
            case 1 : {
                JOptionPane.showMessageDialog(null, "RESERVA ELIMINADA");
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "RESERVA NO ELIMINADA");
            }
        }        
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA RESERVA PARA ELIMINAR");
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
}