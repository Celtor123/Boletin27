/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Juan
 */
public class calculadora1 extends javax.swing.JFrame {
   
boolean e=false;
String a;
double b;
String c;
String d;
String f;
double resultado;
    /**
     * Creates new form calculadora1
     */
    public calculadora1() {
        
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        Igual = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();
        Botonpunto = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        jButtonsuma = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Encendido = new javax.swing.JToggleButton();
        Apagado = new javax.swing.JToggleButton();
        jButtonmultiplica = new javax.swing.JButton();
        jButtondivide = new javax.swing.JButton();
        jButtonmenos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${title}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"), "Calculadora");
        bindingGroup.addBinding(binding);

        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        Boton0.setText("0");
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });

        Botonpunto.setText(".");
        Botonpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonpuntoActionPerformed(evt);
            }
        });

        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        jButtonsuma.setText("+");
        jButtonsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsumaActionPerformed(evt);
            }
        });

        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Encendido.setText("ac");
        Encendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncendidoActionPerformed(evt);
            }
        });

        Apagado.setText("off");
        Apagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagadoActionPerformed(evt);
            }
        });

        jButtonmultiplica.setText("*");
        jButtonmultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmultiplicaActionPerformed(evt);
            }
        });

        jButtondivide.setText("/");
        jButtondivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivideActionPerformed(evt);
            }
        });

        jButtonmenos.setText("-");
        jButtonmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmenosActionPerformed(evt);
            }
        });

        Texto.setColumns(20);
        Texto.setRows(5);
        jScrollPane2.setViewportView(Texto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton4)
                            .addComponent(Boton1)
                            .addComponent(Boton0)
                            .addComponent(Boton7))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botonpunto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Igual)
                            .addComponent(Boton3)
                            .addComponent(Boton6)
                            .addComponent(Boton9))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonsuma)
                            .addComponent(jButtonmultiplica)
                            .addComponent(jButtondivide)
                            .addComponent(jButtonmenos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(Encendido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Apagado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encendido)
                    .addComponent(Apagado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtondivide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonpuntoActionPerformed
          Texto.setText(Texto.getText()+Botonpunto.getText());
    }//GEN-LAST:event_BotonpuntoActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
   

  Texto.setText(Texto.getText()+Boton1.getText());
    }//GEN-LAST:event_Boton1ActionPerformed

    private void jButtonsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsumaActionPerformed
       c=Texto.getText();
       Texto.setText(null);
      
    }//GEN-LAST:event_jButtonsumaActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
      Texto.setText(Texto.getText()+Boton4.getText());
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        Texto.setText(Texto.getText()+Boton2.getText());
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        Texto.setText(Texto.getText()+Boton5.getText());
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        Texto.setText(Texto.getText()+Boton8.getText());
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
      Texto.setText(Texto.getText()+Boton3.getText());
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        Texto.setText(Texto.getText()+Boton6.getText());
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
          Texto.setText(Texto.getText()+Boton9.getText());
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
         Texto.setText(Texto.getText()+Boton7.getText());
    }//GEN-LAST:event_Boton7ActionPerformed

    private void jButtonmultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmultiplicaActionPerformed
      d=Texto.getText();
       Texto.setText(null);
    }//GEN-LAST:event_jButtonmultiplicaActionPerformed

    private void jButtondivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivideActionPerformed
        f=Texto.getText();
       Texto.setText(null);
    }//GEN-LAST:event_jButtondivideActionPerformed

    private void jButtonmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmenosActionPerformed
 a=Texto.getText();
       Texto.setText(null);     
         
    }//GEN-LAST:event_jButtonmenosActionPerformed

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
  Texto.setText(Texto.getText()+Boton0.getText());
      
    }//GEN-LAST:event_Boton0ActionPerformed

    private void EncendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncendidoActionPerformed
     
    
    }//GEN-LAST:event_EncendidoActionPerformed

    private void ApagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagadoActionPerformed
         Texto.setText(null);
        
    }//GEN-LAST:event_ApagadoActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        double b=Double.parseDouble(Texto.getText());
        if(c!=null){
         double y=Double.parseDouble(c);
         double p=y+b;
         Texto.setText(""+p);
         c=null;
        }
        
        if(a!=null){
         double w=Double.parseDouble(a);
         double t=w-b;
         Texto.setText(""+t);
         a=null;
        }
        if(d!=null){
         double s=Double.parseDouble(d);
         double q=s*b;
         Texto.setText(""+q);
         d=null;
        }
         if(f!=null){
         double y=Double.parseDouble(f);
         double l=y/b;
         Texto.setText(""+l);
         f=null;
        }     
    }//GEN-LAST:event_IgualActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Apagado;
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton Botonpunto;
    private javax.swing.JToggleButton Encendido;
    private javax.swing.JButton Igual;
    private javax.swing.JTextArea Texto;
    private javax.swing.JButton jButtondivide;
    private javax.swing.JButton jButtonmenos;
    private javax.swing.JButton jButtonmultiplica;
    private javax.swing.JButton jButtonsuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
