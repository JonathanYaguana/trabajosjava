/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package angeldx;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author AngelDX
 */
public class frmPuzzle extends javax.swing.JFrame {
static int cont=1;
int i=0;
javax.swing.Timer timer;
    /**
     * Creates new form frmPuzzle
     */
    public frmPuzzle() {
        initComponents();
        //setSize(400,400);
        setLocationRelativeTo(null);
        setTitle("Juego PUZZLE v1.0.");
        btn9.setVisible(false);       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblVista = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuNueva = new javax.swing.JMenu();
        jMenuPartida = new javax.swing.JMenu();
        jMenuItemAndroid = new javax.swing.JMenuItem();
        jMenuItemJuliacasoft = new javax.swing.JMenuItem();
        jMenuItemTecnotronic = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemManual = new javax.swing.JMenuItem();
        jMenuItemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenedor.setPreferredSize(new java.awt.Dimension(500, 500));
        Contenedor.setLayout(new java.awt.GridLayout(3, 3));

        btn1.setBackground(new java.awt.Color(102, 0, 102));
        btn1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/1.png"))); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        Contenedor.add(btn1);

        btn2.setBackground(new java.awt.Color(102, 0, 102));
        btn2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/2.png"))); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        Contenedor.add(btn2);

        btn3.setBackground(new java.awt.Color(102, 0, 102));
        btn3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/3.png"))); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        Contenedor.add(btn3);

        btn4.setBackground(new java.awt.Color(102, 0, 102));
        btn4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/4.png"))); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        Contenedor.add(btn4);

        btn5.setBackground(new java.awt.Color(102, 0, 102));
        btn5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/5.png"))); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        Contenedor.add(btn5);

        btn6.setBackground(new java.awt.Color(102, 0, 102));
        btn6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/6.png"))); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        Contenedor.add(btn6);

        btn7.setBackground(new java.awt.Color(102, 0, 102));
        btn7.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/7.png"))); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        Contenedor.add(btn7);

        btn8.setBackground(new java.awt.Color(102, 0, 102));
        btn8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/8.png"))); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        Contenedor.add(btn8);

        btn9.setBackground(new java.awt.Color(102, 0, 102));
        btn9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android/9.png"))); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        Contenedor.add(btn9);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 4, true), "Resultados"));

        jLabel1.setText("Número de Movimientos:");

        txtContador.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        txtContador.setForeground(new java.awt.Color(255, 0, 51));

        jLabel2.setText("Tiempo de Juego:");

        lblTiempo.setBackground(new java.awt.Color(102, 0, 153));
        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 0, 51));
        lblTiempo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/l_juliacasoft.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("VISTA PREVIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVista, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(txtContador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(lblVista))
        );

        jMenuNueva.setText("Nueva");

        jMenuPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/laptop.png"))); // NOI18N
        jMenuPartida.setText("Partida");

        jMenuItemAndroid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/apple.png"))); // NOI18N
        jMenuItemAndroid.setText("Android");
        jMenuItemAndroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAndroidActionPerformed(evt);
            }
        });
        jMenuPartida.add(jMenuItemAndroid);

        jMenuItemJuliacasoft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/apple.png"))); // NOI18N
        jMenuItemJuliacasoft.setText("Juliacasoft");
        jMenuItemJuliacasoft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJuliacasoftActionPerformed(evt);
            }
        });
        jMenuPartida.add(jMenuItemJuliacasoft);

        jMenuItemTecnotronic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/apple.png"))); // NOI18N
        jMenuItemTecnotronic.setText("Tecnotronic");
        jMenuItemTecnotronic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTecnotronicActionPerformed(evt);
            }
        });
        jMenuPartida.add(jMenuItemTecnotronic);

        jMenuNueva.add(jMenuPartida);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/shut_down.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuNueva.add(jMenuItemSalir);

        jMenuBar1.add(jMenuNueva);

        jMenuAyuda.setText("Ayuda");

        jMenuItemManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/books.png"))); // NOI18N
        jMenuItemManual.setText("Manual");
        jMenuItemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManualActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemManual);

        jMenuItemAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/apple.png"))); // NOI18N
        jMenuItemAcerca.setText("Acerca de...");
        jMenuItemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemAcerca);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if(btn9.isVisible()==false){
            btn9.setText(btn8.getText()); //Cambiando la etiqueta del 8 al 9
            btn9.setIcon(btn8.getIcon());
            btn8.setVisible(false); //ocultando el btn8
            btn9.setVisible(true);  //mostrando el btn9
        }
        if(btn7.isVisible()==false){
            btn7.setText(btn8.getText()); //Cambiando la etiqueta del 8 al 9
            btn7.setIcon(btn8.getIcon());
            btn8.setVisible(false); //ocultando el btn8
            btn7.setVisible(true);  //mostrando el btn9
        }
        if(btn5.isVisible()==false){
            btn5.setText(btn8.getText()); //Cambiando la etiqueta del 8 al 9
            btn5.setIcon(btn8.getIcon());
            btn8.setVisible(false); //ocultando el btn8
            btn5.setVisible(true);  //mostrando el btn9
        }
        contarMovimiento();
        ordenado();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if(btn8.isVisible()==false){
            btn8.setText(btn9.getText());
            btn8.setIcon(btn9.getIcon());
            btn9.setVisible(false);
            btn8.setVisible(true);
        }
        if(btn6.isVisible()==false){
            btn6.setText(btn9.getText());
            btn6.setIcon(btn9.getIcon());
            btn9.setVisible(false);
            btn6.setVisible(true);
        }
        contarMovimiento();
        ordenado();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if(btn9.isVisible()==false){
            btn9.setText(btn6.getText());
            btn9.setIcon(btn6.getIcon());
            btn6.setVisible(false);
            btn9.setVisible(true);
        }
        if(btn3.isVisible()==false){
            btn3.setText(btn6.getText());
            btn3.setIcon(btn6.getIcon());
            btn6.setVisible(false);
            btn3.setVisible(true);
        }
        if(btn5.isVisible()==false){
            btn5.setText(btn6.getText());
            btn5.setIcon(btn6.getIcon());
            btn6.setVisible(false);
            btn5.setVisible(true);
        }
        contarMovimiento();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if(btn8.isVisible()==false){
            btn8.setText(btn7.getText()); //Cambiando la etiqueta del 8 al 9
            btn8.setIcon(btn7.getIcon());
            btn7.setVisible(false); //ocultando el btn8
            btn8.setVisible(true);  //mostrando el btn9
        }
        if(btn4.isVisible()==false){
            btn4.setText(btn7.getText()); //Cambiando la etiqueta del 8 al 9
            btn4.setIcon(btn7.getIcon());
            btn7.setVisible(false); //ocultando el btn8
            btn4.setVisible(true);  //mostrando el btn9
        }
        contarMovimiento();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(btn7.isVisible()==false){
            btn7.setText(btn4.getText()); //Cambiando la etiqueta del 8 al 9
            btn7.setIcon(btn4.getIcon());
            btn4.setVisible(false); //ocultando el btn8
            btn7.setVisible(true);  //mostrando el btn9
        }
        if(btn1.isVisible()==false){
            btn1.setText(btn4.getText()); //Cambiando la etiqueta del 8 al 9
            btn1.setIcon(btn4.getIcon());
            btn4.setVisible(false); //ocultando el btn8
            btn1.setVisible(true);  //mostrando el btn9
        }
        if(btn5.isVisible()==false){
            btn5.setText(btn4.getText()); //Cambiando la etiqueta del 8 al 9
            btn5.setIcon(btn4.getIcon());
            btn4.setVisible(false); //ocultando el btn8
            btn5.setVisible(true);  //mostrando el btn9
        }
        contarMovimiento();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(btn4.isVisible()==false){
            btn4.setText(btn1.getText()); //Cambiando la etiqueta del 8 al 9
            btn4.setIcon(btn1.getIcon());
            btn1.setVisible(false); //ocultando el btn8
            btn4.setVisible(true);  //mostrando el btn9
        }
        if(btn2.isVisible()==false){
            btn2.setText(btn1.getText()); //Cambiando la etiqueta del 8 al 9
            btn2.setIcon(btn1.getIcon());
            btn1.setVisible(false); //ocultando el btn8
            btn2.setVisible(true);  //mostrando el btn9
        }
        contarMovimiento();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if(btn1.isVisible()==false){
            btn1.setText(btn2.getText()); //Cambiando la etiqueta del 8 al 9
            btn1.setIcon(btn2.getIcon());
            btn2.setVisible(false); //ocultando el btn8
            btn1.setVisible(true);  //mostrando el btn9
        }
        if(btn3.isVisible()==false){
            btn3.setText(btn2.getText()); //Cambiando la etiqueta del 8 al 9
            btn3.setIcon(btn2.getIcon());
            btn2.setVisible(false); //ocultando el btn8
            btn3.setVisible(true);  //mostrando el btn9
        }
        if(btn5.isVisible()==false){
            btn5.setText(btn2.getText()); //Cambiando la etiqueta del 8 al 9
            btn5.setIcon(btn2.getIcon());
            btn2.setVisible(false); //ocultando el btn8
            btn5.setVisible(true);  //mostrando el btn9
        }
        contarMovimiento();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(btn2.isVisible()==false){
            btn2.setText(btn3.getText()); //Cambiando la etiqueta del 8 al 9
            btn2.setIcon(btn3.getIcon());
            btn3.setVisible(false); //ocultando el btn8
            btn2.setVisible(true);  //mostrando el btn9
        }
        if(btn6.isVisible()==false){
            btn6.setText(btn3.getText()); //Cambiando la etiqueta del 8 al 9
            btn6.setIcon(btn3.getIcon());
            btn3.setVisible(false); //ocultando el btn8
            btn6.setVisible(true);  //mostrando el btn9
        }
        contarMovimiento();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(btn8.isVisible()==false){
            btn8.setText(btn5.getText()); //Cambiando la etiqueta del 8 al 9
            btn8.setIcon(btn5.getIcon());
            btn5.setVisible(false); //ocultando el btn8
            btn8.setVisible(true);  //mostrando el btn9
        }
        if(btn6.isVisible()==false){
            btn6.setText(btn5.getText()); //Cambiando la etiqueta del 8 al 9
            btn6.setIcon(btn5.getIcon());
            btn5.setVisible(false); //ocultando el btn8
            btn6.setVisible(true);  //mostrando el btn9
        }
        if(btn4.isVisible()==false){
            btn4.setText(btn5.getText()); //Cambiando la etiqueta del 8 al 9
            btn4.setIcon(btn5.getIcon());
            btn5.setVisible(false); //ocultando el btn8
            btn4.setVisible(true);  //mostrando el btn9
        }
        if(btn2.isVisible()==false){
            btn2.setText(btn5.getText()); //Cambiando la etiqueta del 8 al 9
            btn2.setIcon(btn5.getIcon());
            btn5.setVisible(false); //ocultando el btn8
            btn2.setVisible(true);  //mostrando el btn9
        }
        contarMovimiento();
    }//GEN-LAST:event_btn5ActionPerformed

    private void jMenuItemAndroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAndroidActionPerformed
        // TODO add your handling code here:
        i=0;
        cont=1;
        
         int n=8;  //numeros aleatorios
        int k=n;  //auxiliar;
        int[] numeros=new int[n];
        int[] valor=new int[n];
        Random rnd=new Random();
        int res;

        //se rellena una matriz ordenada del 1 al 9(1..n)
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }

        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);
            valor[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            System.out.println(valor[i]);
        }
        System.out.println("------------------------------------------");

        btn1.setText(String.valueOf(valor[0]));
        btn2.setText(String.valueOf(valor[1]));
        btn3.setText(String.valueOf(valor[2]));
        btn4.setText(String.valueOf(valor[3]));
        btn5.setText(String.valueOf(valor[4]));
        btn6.setText(String.valueOf(valor[5]));
        btn7.setText(String.valueOf(valor[6]));
        btn8.setText(String.valueOf(valor[7]));
        
        btn9.setVisible(false);//espacio que permite realizar los moviemientos en le PUZZLE
        
        System.out.println("------------------------------------------");
        this.btn1.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/"+valor[0]+".png")));
        this.btn2.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/"+valor[1]+".png")));
        this.btn3.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/"+valor[2]+".png")));
        this.btn4.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/"+valor[3]+".png")));
        this.btn5.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/"+valor[4]+".png")));
        this.btn6.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/"+valor[5]+".png")));
        this.btn7.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/"+valor[6]+".png")));
        this.btn8.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/"+valor[7]+".png")));
        
        lblVista.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/android/imagen.png")));
        tiempo();
        
    }//GEN-LAST:event_jMenuItemAndroidActionPerformed

    private void jMenuItemJuliacasoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJuliacasoftActionPerformed
        // TODO add your handling code here:
        int n=8;  //numeros aleatorios
        int k=n;  //auxiliar;
        int[] numeros=new int[n];
        int[] valor=new int[n];
        Random rnd=new Random();
        int res;
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }

        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);
            valor[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            System.out.println(valor[i]);
        }

        btn1.setText(String.valueOf(valor[0]));
        btn2.setText(String.valueOf(valor[1]));
        btn3.setText(String.valueOf(valor[2]));
        btn4.setText(String.valueOf(valor[3]));
        btn5.setText(String.valueOf(valor[4]));
        btn6.setText(String.valueOf(valor[5]));
        btn7.setText(String.valueOf(valor[6]));
        btn8.setText(String.valueOf(valor[7]));
        
        btn9.setVisible(false);//espacio que permite realizar los moviemientos en le PUZZLE
        
        System.out.println("------------------------------------------");
        this.btn1.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/"+valor[0]+".png")));
        this.btn2.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/"+valor[1]+".png")));
        this.btn3.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/"+valor[2]+".png")));
        this.btn4.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/"+valor[3]+".png")));
        this.btn5.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/"+valor[4]+".png")));
        this.btn6.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/"+valor[5]+".png")));
        this.btn7.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/"+valor[6]+".png")));
        this.btn8.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/"+valor[7]+".png")));
        
        lblVista.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/juliacasoft/imagen.png")));
        tiempo();
        cont=1;
    }//GEN-LAST:event_jMenuItemJuliacasoftActionPerformed

    private void jMenuItemTecnotronicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTecnotronicActionPerformed
        // TODO add your handling code here:
                    int n=8;  //numeros aleatorios
        int k=n;  //auxiliar;
        int[] numeros=new int[n];
        int[] valor=new int[n];
        Random rnd=new Random();
        int res;

        //se rellena una matriz ordenada del 1 al 9(1..n)
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }

        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);
            valor[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            System.out.println(valor[i]);
        }
        System.out.println("------------------------------------------");

        btn1.setText(String.valueOf(valor[0]));
        btn2.setText(String.valueOf(valor[1]));
        btn3.setText(String.valueOf(valor[2]));
        btn4.setText(String.valueOf(valor[3]));
        btn5.setText(String.valueOf(valor[4]));
        btn6.setText(String.valueOf(valor[5]));
        btn7.setText(String.valueOf(valor[6]));
        btn8.setText(String.valueOf(valor[7]));
        
        btn9.setVisible(false);//espacio que permite realizar los moviemientos en le PUZZLE
        
        System.out.println("------------------------------------------");
        this.btn1.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/"+valor[0]+".png")));
        this.btn2.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/"+valor[1]+".png")));
        this.btn3.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/"+valor[2]+".png")));
        this.btn4.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/"+valor[3]+".png")));
        this.btn5.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/"+valor[4]+".png")));
        this.btn6.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/"+valor[5]+".png")));
        this.btn7.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/"+valor[6]+".png")));
        this.btn8.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/"+valor[7]+".png")));
        
        lblVista.setIcon(new  javax.swing.ImageIcon(this.getClass().getResource("../imagenes/tecnotronic/imagen.png")));
        tiempo();
        cont=1;
    }//GEN-LAST:event_jMenuItemTecnotronicActionPerformed

    private void jMenuItemAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaActionPerformed
        // TODO add your handling code here:
        new frmAcercaDe().show();
    }//GEN-LAST:event_jMenuItemAcercaActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManualActionPerformed
        // TODO add your handling code here:
        try {
             File path = new File ("manual/pdfauris.pdf");
             Desktop.getDesktop().open(path);
        }catch (IOException ex) {
             ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemManualActionPerformed

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
            java.util.logging.Logger.getLogger(frmPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPuzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPuzzle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAcerca;
    private javax.swing.JMenuItem jMenuItemAndroid;
    private javax.swing.JMenuItem jMenuItemJuliacasoft;
    private javax.swing.JMenuItem jMenuItemManual;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemTecnotronic;
    private javax.swing.JMenu jMenuNueva;
    private javax.swing.JMenu jMenuPartida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblVista;
    private javax.swing.JTextField txtContador;
    // End of variables declaration//GEN-END:variables

    private void contarMovimiento() {        
        txtContador.setText(String.valueOf(cont++));
    }
    public void ordenado(){
       String b1=btn1.getText();
       String b2=btn2.getText();
       String b3=btn3.getText();
       String b4=btn4.getText();
       String b5=btn5.getText();
       String b6=btn6.getText();
       String b7=btn7.getText();
       String b8=btn8.getText();
       //String b9=btn9.getText();
       
       if(b1.equals("1")&&b2.equals("2")&&b3.equals("3")&&b4.equals("4")&&
          b5.equals("5")&&b6.equals("6")&&b7.equals("7")&&b8.equals("8")&&btn9.isVisible()==false){
           timer.stop();
           JOptionPane.showMessageDialog(rootPane,"FELICITACIONES UD. GANO!! \n En: "+cont+" Movimientos \n y "+i+" Segundos");    
       }
       System.out.println(b1+b2+b3+b4+b5+b6+b7+b8);       
    }
    private void tiempo() { 
        timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() { 
        @ Override 
        public void actionPerformed(java.awt.event.ActionEvent ae) { 
           i++;
           //System.out.println(i);
           lblTiempo.setText(String.valueOf(i)+" Segundos");
        } 
        }); 
        timer.start(); 
    }
}
