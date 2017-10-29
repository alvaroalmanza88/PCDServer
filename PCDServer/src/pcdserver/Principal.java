/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcdserver;

import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {    
    
    private int puerto=0;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        lb_mi_ip.setText(getMyIp());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_puerto = new javax.swing.JLabel();
        fi_puerto = new javax.swing.JTextField();
        lb_estado = new javax.swing.JLabel();
        lb_icono_estado = new javax.swing.JLabel();
        bt_escuchar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tx_area_texto = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        lb_mi_ip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PCDServer");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(450, 420));
        setMinimumSize(new java.awt.Dimension(450, 420));
        setPreferredSize(new java.awt.Dimension(450, 420));
        setSize(new java.awt.Dimension(300, 300));

        lb_puerto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_puerto.setText("Puerto: ");

        fi_puerto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fi_puerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fi_puertoActionPerformed(evt);
            }
        });

        lb_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_estado.setText("Estado:");

        lb_icono_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_icono_estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_icono_estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcdserver/off.png"))); // NOI18N
        lb_icono_estado.setText("OFF");

        bt_escuchar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_escuchar.setText("ESCUCHAR");
        bt_escuchar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_escucharMouseClicked(evt);
            }
        });
        bt_escuchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_escucharActionPerformed(evt);
            }
        });

        tx_area_texto.setMaximumSize(new java.awt.Dimension(320, 320));
        tx_area_texto.setMinimumSize(new java.awt.Dimension(320, 320));
        tx_area_texto.setPreferredSize(new java.awt.Dimension(320, 320));
        jScrollPane1.setViewportView(tx_area_texto);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Mi IP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lb_puerto)
                        .addGap(4, 4, 4)
                        .addComponent(fi_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lb_estado)
                        .addGap(10, 10, 10)
                        .addComponent(lb_icono_estado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(bt_escuchar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_mi_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lb_puerto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fi_puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lb_estado))
                    .addComponent(lb_icono_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(bt_escuchar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_mi_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fi_puertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fi_puertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fi_puertoActionPerformed

    private void bt_escucharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_escucharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_escucharActionPerformed

    private void bt_escucharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_escucharMouseClicked
        
        try{
            puerto = Integer.parseInt(fi_puerto.getText());
            if (1024 <= puerto && 65535 >= puerto){
                Escucha escucha = new Escucha(puerto); 
                escucha.start();
            }else{
                throw new NumberFormatException();
            }
        }        
        catch (NumberFormatException e){
            tx_area_texto.setText("Debe introducir un puerto correcto entre el "
                    + "1024 y el 65535");
        }        
    }//GEN-LAST:event_bt_escucharMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    public class Escucha extends Thread{
        private ServerSocket yo;
        private int puerto;
        private Socket cliente;
        private int id = 0;
        
        public Escucha(int puerto){
            this.puerto = puerto;
        }
        
        public void run(){
            try{
                this.yo = new ServerSocket (this.puerto);
                lb_icono_estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcdserver/on.png")));
                lb_icono_estado.setText("ON ");
                fi_puerto.setEnabled(false);
                lb_puerto.setEnabled(false);
                bt_escuchar.setEnabled(false);
                tx_area_texto.setText("");
                while (true) {
                    this.cliente = yo.accept();
                    //System.out.println("conecta");
                    Conexion conexion = new Conexion(this.cliente);
                    conexion.start(); 
                }
            }catch (IOException e){
                tx_area_texto.setText("Hubo un error al iniciar el servidor: "+ e);
            }
            
        }
    }
   
    public class Conexion extends Thread {
        private Socket cliente = null;
        private byte ack = 0x05;
        private BufferedReader entrada = null;
        private DataOutputStream salida = null;

        public Conexion (Socket cliente) {
            this.cliente = cliente;
        }
        
        public void run() {
            try {
                this.salida = new DataOutputStream(cliente.getOutputStream());
                this.entrada = new BufferedReader(
                    new InputStreamReader(
                        cliente.getInputStream()));
                
                String mensaje = "";
                String intro = "";
                String ip = cliente.getInetAddress().toString().substring(1);
                int caracter = 65533;
                while (!entrada.ready()){
                    System.out.println(entrada.ready());
                }
                while ((caracter = entrada.read()) != 65533
                        && (caracter = entrada.read()) != -1){
                    mensaje += (char)caracter;
                    System.out.println(mensaje);
                }
                //System.out.println("mensaje: "+mensaje+"...Caracter: "+caracter);
                while (mensaje != null) {
                    
                    if (mensaje.equals((char)ack))
                        break;
                    if (!((mensaje == "" || mensaje == "\n") && 
                            (caracter == 65533 || caracter == -1))){                        
                        tx_area_texto.setText(tx_area_texto.getText()+
                                intro+ip+ ": " + mensaje);
                        // para ir al final
                        tx_area_texto.setCaretPosition(tx_area_texto.getDocument()
                                .getLength());
                        intro = "\n";
                    }
                    salida.writeChar((char)ack);
                    
                    mensaje = "";
                    while (!entrada.ready()) {}
                    while ((caracter = entrada.read()) != 65533
                        && (caracter = entrada.read()) != -1){
                        mensaje += (char)caracter;
                    }
                    
                    //System.out.println("mensaje: "+mensaje+"...Caracter: "+caracter);
                }
                //System.out.println("mensaje: " + mensaje);
                //salida.writeChar((char)ack);
                cliente.close();
            } catch (IOException e) {
                System.out.println("Error: "+e);
            }
        }
    }
    
    public String getMyIp(){
        String ip = "";
        try {
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    whatismyip.openStream()));            
            ip = in.readLine();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ip;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_escuchar;
    private javax.swing.JTextField fi_puerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_estado;
    private javax.swing.JLabel lb_icono_estado;
    private javax.swing.JLabel lb_mi_ip;
    private javax.swing.JLabel lb_puerto;
    private javax.swing.JTextPane tx_area_texto;
    // End of variables declaration//GEN-END:variables
}
