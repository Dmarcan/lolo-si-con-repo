package Ventanas;

import Clases.Empresa;
import Clases.Pasajero;
import Clases.ViajeBus;
import Excepciones.PasajeroExisteException;
import Excepciones.ViajeBusAsientoFueraRangoException;
import Excepciones.ViajeBusAsientoOcupadoException;
import Excepciones.ViajeBusNoExisteException;

public class Opcion4Jframe extends javax.swing.JFrame {
    Empresa empresa;

    public Opcion4Jframe(Empresa empresa) {
        initComponents();
        this.empresa = empresa;
    }

    private Opcion4Jframe() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        label_codigo = new javax.swing.JLabel();
        textField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Tipo de Pasajero");

        label_codigo.setText("Codigo del Viaje de Bus");

        jButton2.setText("Agregar Pasajero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Pasajero");

        jLabel2.setText("RUT del Pasajero");

        jLabel4.setText("Ver Asientos Disponibles");

        jButton1.setText("Asientos Disponibles");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero de Asiento del Pasajero");

        textField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textField5KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel6.setText("AGREGAR PASAJERO");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel7.setText("Estado:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel8.setText("Rellene los campos");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Estudiante", "Tercera Edad" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_codigo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1)
                            .addComponent(textField2)
                            .addComponent(textField1)
                            .addComponent(textField3)
                            .addComponent(textField5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_codigo)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                      


    /* Lo que hace el siguiente metodo es mostrar los asientos disponibles del bus que se desea agregar el pasajero
    primero se verifica que el usuario ingrese texto en el campo de codigo viaje bus y posteriormente se verifica que el bus exista.
    en caso que ambas condiciones se cumplan se llama a una ventana que muestra los asientos del bus*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoViaje = textField1.getText();
        
        if (codigoViaje.isEmpty()){
            jLabel8.setText("Rellene el campo del código de viaje");
            return;
        }
        
        ViajeBus bus = empresa.getViajeBus(codigoViaje);

        if (bus == null)jLabel8.setText("Ingrese Viaje Bus valido");
        else
        {
            jLabel8.setText("Mostrando asientos...");
            Opcion4JframeMostrarAsientos op4M = new Opcion4JframeMostrarAsientos(bus);
            op4M.setVisible(true);
        }

    }


     /* Lo que hace el siguiente método consiste en que, al presionar el botón de "Agregar Pasajero", se almacenan los textos 
    ingresados en los campos de entrada de texto en variables locales, y verifica si hay algún campo vacío. Si no lo hay,
    convierte las variables de texto que simbolizan datos cuantitativos en variables de tipo int. Luego, se intenta agregar a 
    la colección de objetos Pasajero asociada al objeto ViajeBus respectivo mediante el uso de una excepción.*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String codigoViaje = textField1.getText();
        String nombrePasajero = textField2.getText();
        String rutPasajero = textField3.getText();
        String tipoPasajero = jComboBox1.getSelectedItem().toString();
        String numeroAsientoStr = textField5.getText();

        if (codigoViaje.isEmpty() || nombrePasajero.isEmpty() || rutPasajero.isEmpty()
            || tipoPasajero.isEmpty() || numeroAsientoStr.isEmpty()){
            jLabel8.setText("Rellene los campos faltantes");
            return;
        }
        
        int numeroAsiento = Integer.parseInt(numeroAsientoStr);

        

        Pasajero pasajero = new Pasajero(nombrePasajero, rutPasajero, tipoPasajero, numeroAsiento, codigoViaje);
        try {
            empresa.agregarPasajero(codigoViaje, pasajero);
            jLabel8.setText("Pasajero agregado");
        } catch (PasajeroExisteException e1) {
            jLabel8.setText("Pasajero ya existe");
        } catch (ViajeBusNoExisteException e2) {
            jLabel8.setText("Viaje Bus no existe");
        } catch (ViajeBusAsientoFueraRangoException e3) {
            jLabel8.setText("Asiento Viaje Bus fuera de rango");
        } catch (ViajeBusAsientoOcupadoException e4) {
            jLabel8.setText("Asiento Viaje Bus ocupado");
        }
    }// GEN-LAST:event_jButton2ActionPerformed
    
    //verificacion para que el usuario no ingrese letras en el campo de numero de asiento
    private void textField5KeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_textField5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }// GEN-LAST:event_textField5KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Opcion4Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcion4Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcion4Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcion4Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcion4Jframe().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label_codigo;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    private javax.swing.JTextField textField3;
    private javax.swing.JTextField textField5;
}
