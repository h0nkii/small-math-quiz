/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathquestionsproject;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
        
        String FN,LN;
        int SID,CV,PN,n1;
        double x,score=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 800));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setText("Student ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 0, 60, 20);

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(420, 0, 70, 20);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setText("Class:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 0, 60, 20);

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(60, 0, 70, 20);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 0, 60, 20);

        jTextField3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 0, 70, 20);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setText("First Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 60, 20);

        jTextField4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(320, 0, 70, 20);

        jLabel5.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("x");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 60, 20, 30);

        jLabel6.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("______");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 340, 110, 30);

        jLabel7.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("x");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 100, 20, 30);

        jLabel8.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel8.setText("2.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 100, 20, 30);

        jLabel9.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(":");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 140, 20, 30);

        jLabel10.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel10.setText("3.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 140, 20, 30);

        jLabel11.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(":");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 180, 20, 30);

        jLabel12.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel12.setText("4.");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 180, 20, 30);

        jLabel13.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("+");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(170, 220, 20, 30);

        jLabel14.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel14.setText("5.");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 220, 20, 30);

        jLabel15.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("+");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(170, 260, 20, 30);

        jLabel16.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel16.setText("6.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 260, 20, 30);

        jLabel17.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("-");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(170, 300, 20, 30);

        jLabel18.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel18.setText("7.");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 300, 30, 30);

        jLabel19.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("-");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(170, 340, 20, 30);

        jLabel20.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel20.setText("8.");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 340, 30, 30);

        jLabel21.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("=");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(320, 340, 30, 30);

        jLabel22.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("______");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(40, 60, 110, 30);

        jLabel23.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("______");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(40, 100, 110, 30);

        jLabel24.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("______");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(40, 140, 110, 30);

        jLabel41.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("______");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(40, 180, 110, 30);

        jLabel42.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("______");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(40, 220, 110, 30);

        jLabel43.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("______");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(40, 260, 110, 30);

        jLabel44.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("______");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(40, 300, 110, 30);

        jLabel45.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("______");
        getContentPane().add(jLabel45);
        jLabel45.setBounds(210, 340, 110, 30);

        jLabel46.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("______");
        getContentPane().add(jLabel46);
        jLabel46.setBounds(210, 60, 110, 30);

        jLabel47.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("______");
        getContentPane().add(jLabel47);
        jLabel47.setBounds(210, 100, 110, 30);

        jLabel48.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("______");
        getContentPane().add(jLabel48);
        jLabel48.setBounds(210, 140, 110, 30);

        jLabel49.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("______");
        getContentPane().add(jLabel49);
        jLabel49.setBounds(210, 180, 110, 30);

        jLabel50.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("______");
        getContentPane().add(jLabel50);
        jLabel50.setBounds(210, 220, 110, 30);

        jLabel51.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("______");
        getContentPane().add(jLabel51);
        jLabel51.setBounds(210, 260, 110, 30);

        jLabel52.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("______");
        getContentPane().add(jLabel52);
        jLabel52.setBounds(210, 300, 110, 30);

        jLabel53.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel53.setText("1.");
        getContentPane().add(jLabel53);
        jLabel53.setBounds(10, 60, 20, 30);

        jLabel54.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("=");
        getContentPane().add(jLabel54);
        jLabel54.setBounds(320, 60, 30, 30);

        jLabel55.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("=");
        getContentPane().add(jLabel55);
        jLabel55.setBounds(320, 100, 30, 30);

        jLabel56.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("=");
        getContentPane().add(jLabel56);
        jLabel56.setBounds(320, 100, 30, 30);

        jLabel57.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("=");
        getContentPane().add(jLabel57);
        jLabel57.setBounds(320, 140, 30, 30);

        jLabel58.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("=");
        getContentPane().add(jLabel58);
        jLabel58.setBounds(320, 180, 30, 30);

        jLabel59.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("=");
        getContentPane().add(jLabel59);
        jLabel59.setBounds(320, 220, 30, 30);

        jLabel60.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("=");
        getContentPane().add(jLabel60);
        jLabel60.setBounds(320, 260, 30, 30);

        jLabel61.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("=");
        getContentPane().add(jLabel61);
        jLabel61.setBounds(320, 300, 30, 30);

        jTextField21.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        getContentPane().add(jTextField21);
        jTextField21.setBounds(370, 340, 140, 30);

        jTextField22.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField22);
        jTextField22.setBounds(370, 60, 140, 30);

        jTextField23.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField23);
        jTextField23.setBounds(370, 100, 140, 30);

        jTextField24.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField24);
        jTextField24.setBounds(370, 140, 140, 30);

        jTextField25.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        getContentPane().add(jTextField25);
        jTextField25.setBounds(370, 180, 140, 30);

        jTextField26.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        getContentPane().add(jTextField26);
        jTextField26.setBounds(370, 220, 140, 30);

        jTextField27.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        getContentPane().add(jTextField27);
        jTextField27.setBounds(370, 260, 140, 30);

        jTextField28.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        getContentPane().add(jTextField28);
        jTextField28.setBounds(370, 300, 140, 30);

        jButton2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 380, 190, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 390, 300, 160);

        jButton3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton3.setText("Start Test");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(540, 0, 120, 20);

        jLabel25.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel25);
        jLabel25.setBounds(520, 100, 100, 30);

        jLabel26.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel26);
        jLabel26.setBounds(520, 340, 100, 30);

        jLabel27.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel27);
        jLabel27.setBounds(520, 60, 100, 30);

        jLabel28.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel28);
        jLabel28.setBounds(520, 140, 100, 30);

        jLabel29.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel29);
        jLabel29.setBounds(520, 180, 100, 30);

        jLabel30.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel30);
        jLabel30.setBounds(520, 220, 100, 30);

        jLabel31.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel31);
        jLabel31.setBounds(520, 260, 100, 30);

        jLabel32.setFont(new java.awt.Font("Aharoni", 0, 11)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel32);
        jLabel32.setBounds(520, 300, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed

    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed

    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FN=jTextField2.getText();
        LN=jTextField3.getText();
        SID=Integer.parseInt(jTextField4.getText());
        CV=Integer.parseInt(jTextField1.getText());
        JLabel Labels1[]={jLabel22,jLabel23,jLabel24,jLabel41,jLabel42,jLabel43,
            jLabel44,jLabel6,jLabel46,jLabel47,jLabel48,jLabel49,jLabel50,
        jLabel51,jLabel52,jLabel45};
        for (int i = 0; i < 16; i++) {
        n1=(int)(Math.floor(Math.random()*(100-1+1)+1));
        Labels1[i].setText(""+n1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JLabel Labels2[]={jLabel27,jLabel25,jLabel28,jLabel29,jLabel30,jLabel31,
            jLabel32,jLabel26};
        JTextField Fields[]={jTextField22,jTextField23,jTextField24,jTextField25,
            jTextField26,jTextField27,jTextField28,jTextField21};
        JLabel Labels1[]={jLabel22,jLabel23,jLabel24,jLabel41,jLabel42,jLabel43,
            jLabel44,jLabel6,jLabel46,jLabel47,jLabel48,jLabel49,jLabel50,
        jLabel51,jLabel52,jLabel45};
        for (int i = 0; i < 8; i++) {
            if (i<2){
                x=Double.parseDouble(Labels1[i].getText())*Double.parseDouble(Labels1[i+8].getText());
                if(Double.parseDouble(Fields[i].getText())==x){
                    Labels2[i].setText("Correct");
                    score+=12.5;
                    Labels2[i].setForeground(Color.green);
                }
                else{Labels2[i].setText("Incorrect");
                    Labels2[i].setForeground(Color.red);}
            }
            if (2<=i&&i<4){
                DecimalFormat df=new DecimalFormat("#.##");
                x=Double.parseDouble(df.format(Double.parseDouble(Labels1[i].getText())/
                        Double.parseDouble(Labels1[i+8].getText())));
                if(Double.parseDouble(Fields[i].getText())==x){
                    Labels2[i].setText("Correct");
                    score+=12.5;
                    Labels2[i].setForeground(Color.green);
                }
                else{Labels2[i].setText("Incorrect");
                    Labels2[i].setForeground(Color.red);}
            }
            
            if (4<=i&&i<6){
                x=Double.parseDouble(Labels1[i].getText())+Double.parseDouble(Labels1[i+8].getText());
                if(Double.parseDouble(Fields[i].getText())==x){
                    Labels2[i].setText("Correct");
                    score+=12.5;
                    Labels2[i].setForeground(Color.green);
                }
                else{ Labels2[i].setText("Incorrect");
                    Labels2[i].setForeground(Color.red);}
            }
            if (6<=i&&i<8){
                x=Double.parseDouble(Labels1[i].getText())-Double.parseDouble(Labels1[i+8].getText());
                if(Double.parseDouble(Fields[i].getText())==x){
                    Labels2[i].setText("Correct");
                    score+=12.5;
                    Labels2[i].setForeground(Color.green);
                }
                else{ Labels2[i].setText("Incorrect");
                    Labels2[i].setForeground(Color.red);}
            }
        }
        Student student=new Student(FN,LN,SID,CV);
        jTextArea1.setText(student.toString()+"\nScore: "+score+"/100");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        
    }//GEN-LAST:event_jTextField24ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
