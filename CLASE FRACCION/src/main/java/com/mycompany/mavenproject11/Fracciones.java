/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject11;

/**
 *
 * @author lopez
 */
public class Fracciones extends javax.swing.JFrame {

    /**
     * Creates new form Fracciones
     */
    Mixto M1, MR;
    FRACCION F1;

    public Fracciones() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelgeneral = new javax.swing.JTabbedPane();
        panelmixmix = new javax.swing.JPanel();
        txtNume2 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        txtdeno2 = new javax.swing.JTextField();
        panelmixfrac = new javax.swing.JPanel();
        txtnumf = new javax.swing.JTextField();
        txtdenof = new javax.swing.JTextField();
        panelmixent = new javax.swing.JPanel();
        txtent = new javax.swing.JTextField();
        txtdeno3 = new javax.swing.JTextField();
        cbOperaciones = new javax.swing.JComboBox<>();
        txtnum1 = new javax.swing.JTextField();
        Ejecutar = new javax.swing.JButton();
        txtdeno1 = new javax.swing.JTextField();
        txtNume1 = new javax.swing.JTextField();
        lbligual = new javax.swing.JLabel();
        txtNume3 = new javax.swing.JTextField();
        txtnum3 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        txtcontfraccion = new javax.swing.JTextField();
        txtcontmixto = new javax.swing.JTextField();
        lblcotmixto = new javax.swing.JLabel();
        lblcontfraccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNume2.setText("0");

        txtnum2.setText("0");

        txtdeno2.setText("0");

        javax.swing.GroupLayout panelmixmixLayout = new javax.swing.GroupLayout(panelmixmix);
        panelmixmix.setLayout(panelmixmixLayout);
        panelmixmixLayout.setHorizontalGroup(
            panelmixmixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmixmixLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNume2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelmixmixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdeno2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelmixmixLayout.setVerticalGroup(
            panelmixmixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmixmixLayout.createSequentialGroup()
                .addGroup(panelmixmixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmixmixLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdeno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelmixmixLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(txtNume2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        panelgeneral.addTab("Mixto ", panelmixmix);

        txtnumf.setText("0");

        txtdenof.setText("0");

        javax.swing.GroupLayout panelmixfracLayout = new javax.swing.GroupLayout(panelmixfrac);
        panelmixfrac.setLayout(panelmixfracLayout);
        panelmixfracLayout.setHorizontalGroup(
            panelmixfracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmixfracLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelmixfracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnumf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdenof, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        panelmixfracLayout.setVerticalGroup(
            panelmixfracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmixfracLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtnumf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdenof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelgeneral.addTab("Fraccion", panelmixfrac);

        txtent.setText("0");

        javax.swing.GroupLayout panelmixentLayout = new javax.swing.GroupLayout(panelmixent);
        panelmixent.setLayout(panelmixentLayout);
        panelmixentLayout.setHorizontalGroup(
            panelmixentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmixentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtent, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panelmixentLayout.setVerticalGroup(
            panelmixentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmixentLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        panelgeneral.addTab("Entero", panelmixent);

        txtdeno3.setEditable(false);
        txtdeno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeno3ActionPerformed(evt);
            }
        });

        cbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        cbOperaciones.setName("+\n-\n*\n/\n"); // NOI18N
        cbOperaciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbOperacionesItemStateChanged(evt);
            }
        });
        cbOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOperacionesActionPerformed(evt);
            }
        });

        txtnum1.setText("0");
        txtnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum1ActionPerformed(evt);
            }
        });

        Ejecutar.setText("Ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        txtdeno1.setText("0");

        txtNume1.setText("0");
        txtNume1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNume1ActionPerformed(evt);
            }
        });

        lbligual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbligual.setText("=");

        txtNume3.setEditable(false);

        txtnum3.setEditable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitulo.setText("Operaciones Mixtos");

        txtcontfraccion.setEditable(false);
        txtcontfraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontfraccionActionPerformed(evt);
            }
        });

        txtcontmixto.setEditable(false);
        txtcontmixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontmixtoActionPerformed(evt);
            }
        });

        lblcotmixto.setText("Contador objetos mixto:");
        lblcotmixto.setToolTipText("");

        lblcontfraccion.setText("Contador objetos Fraccion:");
        lblcontfraccion.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNume1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdeno1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ejecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbligual)
                        .addGap(3, 3, 3)
                        .addComponent(txtNume3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdeno3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelgeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblcontfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcontfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblcotmixto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(393, Short.MAX_VALUE)
                    .addComponent(txtcontmixto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(77, 77, 77)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblTitulo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdeno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(cbOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtNume1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ejecutar)
                                    .addComponent(lbligual)
                                    .addComponent(txtNume3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtnum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdeno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelgeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lblcotmixto)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontfraccion))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(213, Short.MAX_VALUE)
                    .addComponent(txtcontmixto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)))
        );

        panelgeneral.getAccessibleContext().setAccessibleName("Mixto ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOperacionesActionPerformed

    private void txtnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum1ActionPerformed

    private void cbOperacionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbOperacionesItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOperacionesItemStateChanged

    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed

        if (M1 == null) {
            M1 = new Mixto(Integer.parseInt(this.txtNume1.getText()),
                    Integer.parseInt(this.txtnum1.getText()),
                    Integer.parseInt(this.txtdeno1.getText()));
        } else {
            M1.setEnt(Integer.parseInt(this.txtNume1.getText()));
            M1.setNum(Integer.parseInt(this.txtnum1.getText()));
            M1.setDen(Integer.parseInt(this.txtdeno1.getText()));
        }

        if (this.panelgeneral.getSelectedIndex() == 0) {
            if (this.cbOperaciones.getSelectedIndex() == 0) {
                MR = M1.SumaMixto(Integer.parseInt(this.txtNume2.getText()),
                        Integer.parseInt(this.txtnum2.getText()),
                        Integer.parseInt(this.txtdeno2.getText()));
                Imprimir();
            } else if (this.cbOperaciones.getSelectedIndex() == 1) {
                MR = M1.RestaMixto(Integer.parseInt(this.txtNume2.getText()),
                        Integer.parseInt(this.txtnum2.getText()),
                        Integer.parseInt(this.txtdeno2.getText()));
                Imprimir();
            } else if (this.cbOperaciones.getSelectedIndex() == 2) {
                MR = M1.MultiplicacionMixto(Integer.parseInt(this.txtNume2.getText()),
                        Integer.parseInt(this.txtnum2.getText()),
                        Integer.parseInt(this.txtdeno2.getText()));
                Imprimir();
            } else if (this.cbOperaciones.getSelectedIndex() == 3) {
                MR = M1.DivicionMixto(Integer.parseInt(this.txtNume2.getText()),
                        Integer.parseInt(this.txtnum2.getText()),
                        Integer.parseInt(this.txtdeno2.getText()));
                Imprimir();
            }

        } else if (this.panelgeneral.getSelectedIndex() == 1) {
            if (this.cbOperaciones.getSelectedIndex() == 0) {
                MR = M1.SumaMixto(Integer.parseInt(this.txtnumf.getText()),
                        Integer.parseInt(this.txtdenof.getText()));
                Imprimir();
            } else if (this.cbOperaciones.getSelectedIndex() == 1) {
                MR = M1.RestaMixto(Integer.parseInt(this.txtnumf.getText()),
                        Integer.parseInt(this.txtdenof.getText()));
                Imprimir();
            } else if (this.cbOperaciones.getSelectedIndex() == 2) {
                MR = M1.MultiplicacionMixto(Integer.parseInt(this.txtnumf.getText()),
                        Integer.parseInt(this.txtdenof.getText()));
                Imprimir();
            } else if (this.cbOperaciones.getSelectedIndex() == 3) {
                MR = M1.DivicionMixto(
                        Integer.parseInt(this.txtnumf.getText()),
                        Integer.parseInt(this.txtdenof.getText()));
                Imprimir();
            }

        } else if (this.panelgeneral.getSelectedIndex() == 2) {
            if (this.cbOperaciones.getSelectedIndex() == 0) {
                MR = M1.SumaMixto(Integer.parseInt(this.txtent.getText()));
                Imprimir();

            } else if (this.cbOperaciones.getSelectedIndex() == 1) {
                MR = M1.RestaMixto(Integer.parseInt(this.txtent.getText()));
                Imprimir();

            } else if (this.cbOperaciones.getSelectedIndex() == 2) {
                MR = M1.MultiplicacionMixto(Integer.parseInt(this.txtent.getText()));
                Imprimir();

            } else if (this.cbOperaciones.getSelectedIndex() == 3) {
                MR = M1.DivicionMixto(Integer.parseInt(this.txtent.getText()));
                Imprimir();
            }

        }

        this.txtcontmixto.setText((Mixto.cont)+"");
        this.txtcontfraccion.setText((FRACCION.cont)+"");
   
    }//GEN-LAST:event_EjecutarActionPerformed

    private void txtdeno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeno3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeno3ActionPerformed

    private void txtNume1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNume1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNume1ActionPerformed

    private void txtcontfraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontfraccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontfraccionActionPerformed

    private void txtcontmixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontmixtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontmixtoActionPerformed

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
            java.util.logging.Logger.getLogger(Fracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fracciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fracciones().setVisible(true);
            }
        });
    }

    private void Imprimir() {
        this.txtNume3.setText(MR.getEnt() + "");
        if (MR.getNum()==0&&MR.getDen()==1)
        {
            this.txtnum3.setVisible(false);
            this.txtdeno3.setVisible(false);
        }else
        {
            this.txtnum3.setVisible(true);
            this.txtdeno3.setVisible(true);
        this.txtnum3.setText(MR.getNum() + "");
        this.txtdeno3.setText(MR.getDen() + "");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ejecutar;
    private javax.swing.JComboBox<String> cbOperaciones;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblcontfraccion;
    private javax.swing.JLabel lblcotmixto;
    private javax.swing.JLabel lbligual;
    private javax.swing.JTabbedPane panelgeneral;
    private javax.swing.JPanel panelmixent;
    private javax.swing.JPanel panelmixfrac;
    private javax.swing.JPanel panelmixmix;
    private javax.swing.JTextField txtNume1;
    private javax.swing.JTextField txtNume2;
    private javax.swing.JTextField txtNume3;
    private javax.swing.JTextField txtcontfraccion;
    private javax.swing.JTextField txtcontmixto;
    private javax.swing.JTextField txtdeno1;
    private javax.swing.JTextField txtdeno2;
    private javax.swing.JTextField txtdeno3;
    private javax.swing.JTextField txtdenof;
    private javax.swing.JTextField txtent;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    private javax.swing.JTextField txtnum3;
    private javax.swing.JTextField txtnumf;
    // End of variables declaration//GEN-END:variables
}
