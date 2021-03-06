/**
 * @author Álvaro Camilo Almanza Báez, David Encinas de Frutos, José Miguel Olivares Gil, José Manuel Serrano Ojeda
 * @version 1.0.0
 */
package pcdserver;

import java.io.*;
import java.net.*;
import java.lang.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase de iniciación de la interfaz del cliente 
 */
public class Principal extends javax.swing.JFrame {    
    
    private int puerto=0;

    /**
     * Llama a la función de iniciar los componentes. También muestra nuestra
     * IP pública.
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

    /**
     * Este método se lanza al hacer click en el botón Escuchar. Valida el puerto
     * y en caso de ser correcto llama al hilo de escuchar.
     * @param evt evento click del ratón
     */
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
     * Clase principal que llama al generador de la interfaz.
     * @param args no se usan
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
    
    /**
     * Clase Escucha
     * Este hilo recibirá el puerto en su instanciación, genera un Server Socket
     * y se pone a la escucha.
     */
    public class Escucha extends Thread{
        private ServerSocket yo;
        private int puerto;
        private Socket cliente;
        private int id = 0;
        /**
         * Constructor de la clase
         * @param puerto puerto de escucha
         */
        public Escucha(int puerto){
            this.puerto = puerto;
        }
        
        public void run(){
            try{
                // Creación del server socket
                this.yo = new ServerSocket (this.puerto);
                // Se cambia la interfaz para indicar que se está escuchando
                lb_icono_estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pcdserver/on.png")));
                lb_icono_estado.setText("ON ");
                fi_puerto.setEnabled(false);
                lb_puerto.setEnabled(false);
                bt_escuchar.setEnabled(false);
                tx_area_texto.setText("");
                // Se pone a la escucha de conexiones y cuando llega una crea
                // un nuevo hilo con la misma
                while (true) {
                    this.cliente = yo.accept();
                    Conexion conexion = new Conexion(this.cliente);
                    conexion.start(); 
                }
            }catch (IOException e){
                tx_area_texto.setText("Hubo un error al iniciar el servidor: "+ e);
            }
            
        }
    }
    /**
     * Clase Conexión
     * Crea un hilo que conecta el servidor con algún cliente
     */
    public class Conexion extends Thread {
        private Socket cliente = null;
        private byte ack = 0x05;
        private BufferedReader entrada = null;
        private DataOutputStream salida = null;
        
        /**
         * Constructor de la clase
         * @param cliente socket del cliente que se conecta
         */
        public Conexion (Socket cliente) {
            this.cliente = cliente;
        }
        
        /**
         * Inicia el hilo de conexión, para ello crea dos bufferes con el cliente,
         * uno de entrada y uno de salida.
         * 
         */
        public void run() {
            try {
                // Bufferes de comunicación
                this.salida = new DataOutputStream(cliente.getOutputStream());
                this.entrada = new BufferedReader(
                    new InputStreamReader(
                        cliente.getInputStream()));
                
                String mensaje = "";
                String intro = "";
                // IP pública del cliente
                String ip = cliente.getInetAddress().toString().substring(1);
                // Caracter -1
                int caracter = 65533;
                
                // Espera que el buffer de entrada esté listo
                while (!entrada.ready()){}
                
                // Mientras no lea un caracter -1 va creando el mensaje que recibe
                caracter = entrada.read();
                while (caracter != 65533
                        && caracter != 255
                        && caracter != -1){
                    mensaje += Character.toString((char)caracter);
                    caracter = entrada.read();
                }
                while (mensaje != null) {
                    
                    // Si el mensaje que recibe es el ACK se finaliza la conexión
                    
                    if (mensaje.equals(Character.toString((char)ack)))
                        break;
                    
                    // Mientras no nos llegue el mensaje vacio lo vamos añadiendo
                    // al area de texto
                    if (!((mensaje == "" || mensaje == "\n") && 
                            (caracter == 65533 || caracter == -1 || caracter == 255))){
                        // Añadimos al texto que ya tenemos una nueva línea, la 
                        // IP del cliente y el nuevo mensaje.
                        tx_area_texto.setText(tx_area_texto.getText()+
                                intro+ip+ ": " + mensaje);
                        
                        // Vamos al final del area de texto
                        tx_area_texto.setCaretPosition(tx_area_texto.getDocument()
                                .getLength());
                        intro = "\n";
                    }
                    
                    // Una vez recibido el mensaje mandamos el ACK al cliente
                    salida.write(ack);
                    
                    
                    // Vaciamos el mensaje y volvemos a leer el siguiente mensaje
                    // de este cliente.
                    mensaje = "";
                    while (!entrada.ready()) {}
                    
                    caracter = entrada.read();
                    while (caracter != 65533
                            && caracter != 255
                            && caracter != -1){
                        mensaje += Character.toString((char)caracter);
                        caracter = entrada.read();
                    }
                    
                }
                // Cuando finalizamos la comunicación con el cliente cerramos la
                // conexión y los buffers. Finalizando ya este hilo.
                entrada.close();
                salida.close();
                cliente.close();
            } catch (IOException e) {
                System.out.println("Error: "+e);
            }
        }
    }
    
    /**
     * Método para obtener la IP pública
     * @return String cadena de texto de IP
     */
    public String getMyIp(){
        String ip = "";
        // hacemos uso de un web service que devuelve nuestra IP
        try {
            URL cualEsMiIp = new URL("http://checkip.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cualEsMiIp.openStream()));            
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
