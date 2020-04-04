package Drone;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        PMotor.setStringPainted(true);
        PHelice.setStringPainted(true);
        PFrame.setStringPainted(true);
        PPlaca.setStringPainted(true);
        brProducao.setStringPainted(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDrone = new javax.swing.JPanel();
        lbMotores = new javax.swing.JLabel();
        PMotor = new javax.swing.JProgressBar();
        estoqueMotor = new javax.swing.JTextField();
        Helice = new javax.swing.JLabel();
        PHelice = new javax.swing.JProgressBar();
        estoqueHelice = new javax.swing.JTextField();
        Frame = new javax.swing.JLabel();
        PFrame = new javax.swing.JProgressBar();
        estoqueFrame = new javax.swing.JTextField();
        Placa = new javax.swing.JLabel();
        Baterria = new javax.swing.JLabel();
        brProducao = new javax.swing.JProgressBar();
        PPlaca = new javax.swing.JProgressBar();
        estoquePlaca = new javax.swing.JTextField();
        estoqueBateria = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        lbEstoque = new javax.swing.JLabel();
        lbProducao = new javax.swing.JLabel();
        PBateria = new javax.swing.JProgressBar();
        Caixa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRONE");
        setResizable(false);

        panelDrone.setName("Drone"); // NOI18N
        setTitle("PAINEL FABRICA");

        lbMotores.setText("Motor");

        PMotor.setStringPainted(true);

        estoqueMotor.setEditable(false);
        estoqueMotor.setHorizontalAlignment(javax.swing.JTextField.CENTER);


        Helice.setText("Helice");

        PHelice.setStringPainted(true);

        estoqueHelice.setEditable(false);
        estoqueHelice.setHorizontalAlignment(javax.swing.JTextField.CENTER);


        Frame.setText("Frame");

        PFrame.setStringPainted(true);

        estoqueFrame.setEditable(false);
        estoqueFrame.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Placa.setText("Placa");

        Baterria.setText("Bateria");

        brProducao.setStringPainted(true);

        PPlaca.setStringPainted(true);

        estoquePlaca.setEditable(false);
        estoquePlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        estoqueBateria.setEditable(false);
        estoqueBateria.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        lbEstoque.setText("Estoque");

        lbProducao.setText("PRODUÇÃO");

        PBateria.setStringPainted(true);

        Caixa.setEditable(false);
        Caixa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Caixa");

        javax.swing.GroupLayout panelDroneLayout = new javax.swing.GroupLayout(panelDrone);
        panelDrone.setLayout(panelDroneLayout);
        panelDroneLayout.setHorizontalGroup(
            panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDroneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Frame, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Helice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMotores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Placa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Baterria, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Caixa)
                    .addComponent(brProducao, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(PFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PHelice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PBateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PMotor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(estoqueMotor)
                    .addComponent(estoqueHelice)
                    .addComponent(estoqueFrame)
                    .addComponent(estoquePlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(estoqueBateria)
                    .addComponent(lbEstoque))
                .addContainerGap())
            .addGroup(panelDroneLayout.createSequentialGroup()
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDroneLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lbProducao))
                    .addGroup(panelDroneLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDroneLayout.setVerticalGroup(
            panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDroneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEstoque)
                .addGap(5, 5, 5)
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMotores)
                    .addComponent(estoqueMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PHelice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estoqueHelice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Helice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estoqueFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Frame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estoquePlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Placa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDroneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estoqueBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Baterria)
                    .addComponent(PBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbProducao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Caixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(start)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDrone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelDrone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        new Thread(new Motor()).start();
        new Thread(new Helice()).start();
        new Thread(new Frame()).start();
        new Thread(new Placa()).start();
        new Thread(new Bateria()).start();
        new Thread(new Producao()).start();
    }//GEN-LAST:event_startActionPerformed


    int motor;
    int placa;
    int helice;
    int bateria;
    int frame;

    int _caixa = 0;

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    public class Motor implements Runnable {

        public void run() {
            for (motor = 0; motor <= 16; motor++) {
                estoqueMotor.setText(Integer.toString(motor));
                PMotor.setValue((int) (6.25*motor));
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                }

            }
        }
    }

    public class Helice implements Runnable {

        public void run() {

            for (helice = 0; helice<= 80; helice += 1) {
                PHelice.setValue((int) (1.25*helice));
                estoqueHelice.setText(Integer.toString(helice));
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }

            }
        }
    }

    public class Frame implements Runnable {

        public void run() {

            for (frame = 0; frame <= 10; frame++) {
                PFrame.setValue((int)(frame*10) );
                estoqueFrame.setText(Integer.toString(frame));
                try {
                    Thread.sleep(9000);
                } catch (Exception e) {

                }
            }
        }
    }

    public class Placa implements Runnable {

        public void run() {

            for (placa = 0; placa <= 8; placa++) {
                PPlaca.setValue((int)(placa*12.5) );
                estoquePlaca.setText(Integer.toString(placa));
                try {
                    Thread.sleep(7000);
                } catch (Exception e) {

                }
            }

        }
    }

    public class Bateria implements Runnable {

        public void run() {
            for (bateria = 0; bateria <= 20; bateria++) {
                PBateria.setValue((int)(bateria*5));
                estoqueBateria.setText(Integer.toString(bateria));
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {

                }

            }
        }
    }

    public class Producao implements Runnable {

        public void run() {

            while (true) {
                Caixa.setText("temos " + _caixa + " prontos");
                if (       placa >= 1
                        && frame >= 1
                        && motor >= 4
                        && helice >= 4
                        && bateria >= 2) {
                    for (int i = 0; i <= 100; i += 10) {
                        brProducao.setValue(i);
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {

                        }
                    }
                    estoqueMotor.setText(Integer.toString(motor-=4));
                    estoqueBateria.setText(Integer.toString(bateria-=2));
                    estoquePlaca.setText(Integer.toString(placa-=1));
                    estoqueFrame.setText(Integer.toString(frame-=1));
                    estoqueHelice.setText(Integer.toString(helice-=4));

                    if (_caixa == 8) {
                        break;
                    }
                    _caixa++;
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Baterria;
    private javax.swing.JTextField Caixa;
    private javax.swing.JLabel Frame;
    private javax.swing.JLabel Helice;
    private javax.swing.JProgressBar PBateria;
    private javax.swing.JProgressBar PFrame;
    private javax.swing.JProgressBar PHelice;
    private javax.swing.JProgressBar PMotor;
    private javax.swing.JProgressBar PPlaca;
    private javax.swing.JLabel Placa;
    private javax.swing.JProgressBar brProducao;
    private javax.swing.JTextField estoqueBateria;
    private javax.swing.JTextField estoqueFrame;
    private javax.swing.JTextField estoqueHelice;
    private javax.swing.JTextField estoqueMotor;
    private javax.swing.JTextField estoquePlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbMotores;
    private javax.swing.JLabel lbProducao;
    private javax.swing.JPanel panelDrone;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
