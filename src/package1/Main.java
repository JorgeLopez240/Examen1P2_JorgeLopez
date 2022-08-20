
package package1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Collections;

public class Main extends javax.swing.JFrame {

    Random r = new Random();
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        jugadores.add(new Jugador("Lechuga",543, "contraseña", new Medico("LifeLine", 100, 50, new Arma("FlatLine", 10, 80))));
        jugadores.add(new Jugador("Loco Bryan", 23, "contraseña", new Rastreador("Vantage", 100, 50, new Arma("PeaceFinder", 15, 40))));
        jugadores.add(new Jugador("Dr. Nuila", 2, "contrasena", new Fortaleza("Gibby", 125, 75, new Arma("Carabina", 30, 40))));
        ids.add(jugadores.get(0).getId());
        ids.add(jugadores.get(1).getId());
        ids.add(jugadores.get(2).getId());
        
        DefaultComboBoxModel dc= (DefaultComboBoxModel) cb_personajes.getModel();
        dc.addElement(jugadores.get(0).getPersonaje());
        dc.addElement(jugadores.get(1).getPersonaje());
        dc.addElement(jugadores.get(2).getPersonaje());
        cb_personajes.setModel(dc);
        
        DefaultComboBoxModel dc1= (DefaultComboBoxModel) cb_tipo.getModel();
        dc1.addElement("Fortaleza");
        dc1.addElement("Medico");
        dc1.addElement("Rastreador");
        cb_tipo.setModel(dc1);
        
        DefaultComboBoxModel dc2= (DefaultComboBoxModel) cb_arma.getModel();
        dc2.addElement(new Arma("FlatLine"));
        dc2.addElement(new Arma("PeaceFinder"));
        dc2.addElement(new Arma("Carabina"));
        cb_arma.setModel(dc2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Frame1 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cb_personajes = new javax.swing.JComboBox<>();
        bt_seleccionar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bt_comenzar = new javax.swing.JButton();
        label_Restantes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_jugadores = new javax.swing.JTextArea();
        tf_idAtacar = new javax.swing.JTextField();
        bt_atacar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombrePer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_escudoPer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_vida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cb_arma = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_nombreArma = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_daño = new javax.swing.JTextField();
        bt_crearArma = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tf_presicion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        tf_contra = new javax.swing.JTextField();
        bt_ingresar = new javax.swing.JButton();

        Frame1.setLocationByPlatform(true);
        Frame1.setMaximumSize(new java.awt.Dimension(569, 394));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Seleccionar Personaje");

        bt_seleccionar.setText("Seleccionar");
        bt_seleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_seleccionarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cb_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cb_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bt_seleccionar)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Seleccionar", jPanel2);

        bt_comenzar.setText("Comenzar");
        bt_comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_comenzarMouseClicked(evt);
            }
        });

        label_Restantes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_Restantes.setText("Restantes:  ");

        ta_jugadores.setColumns(20);
        ta_jugadores.setRows(5);
        jScrollPane1.setViewportView(ta_jugadores);

        tf_idAtacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_idAtacarMouseClicked(evt);
            }
        });

        bt_atacar.setText("Atacar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bt_comenzar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_Restantes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tf_idAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(bt_atacar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_comenzar)
                    .addComponent(label_Restantes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_idAtacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_atacar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jugar", jPanel3);

        jLabel6.setText("Nombre");

        jLabel7.setText("Escudo");

        jLabel8.setText("Vida");

        jLabel9.setText("Tipo");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel10.setText("Arma");

        jButton3.setText("Crear Personaje");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Crear Arma");

        jLabel12.setText("Nombre");

        jLabel13.setText("Daño");

        bt_crearArma.setText("Crear Arma");
        bt_crearArma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearArmaMouseClicked(evt);
            }
        });

        jLabel14.setText("Presicion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(tf_nombrePer)
                            .addComponent(tf_escudoPer, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tf_vida, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cb_arma, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jLabel9)
                            .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_daño, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(tf_nombreArma, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(bt_crearArma)
                            .addComponent(tf_presicion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombrePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_escudoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(45, 45, 45)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_presicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_crearArma)
                    .addComponent(tf_daño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear", jPanel4);

        javax.swing.GroupLayout Frame1Layout = new javax.swing.GroupLayout(Frame1.getContentPane());
        Frame1.getContentPane().setLayout(Frame1Layout);
        Frame1Layout.setHorizontalGroup(
            Frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        Frame1Layout.setVerticalGroup(
            Frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        bt_ingresar.setText("Ingresar");
        bt_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_ingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(bt_ingresar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(tf_user)
                            .addComponent(tf_contra, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bt_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int idRandom(){
        int id=1+r.nextInt(999);
        while(ids.contains(id)){
            id=1+r.nextInt(999);
        }
        return id;
    }
    
    private void bt_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ingresarMouseClicked
        String user = tf_user.getText();
        String pass = tf_contra.getText();
        int id = idRandom();
        jugadores.add(new Jugador(user, id, pass));
        ids.add(id);
        //JOptionPane.showMessageDialog(this, "Se ha registrado!");
        Frame1.setLocationRelativeTo(null);
        Frame1.setAlwaysOnTop(true);
        Frame1.pack();
        Frame1.setVisible(true);
    }//GEN-LAST:event_bt_ingresarMouseClicked

    public String randomizerCad(){
        String cad="";
        int a=10;
        while(a>0){
            int num = 97+r.nextInt(25);
            cad += (char)num;
            a--;
        }
        return cad;
    }
    
    private void bt_comenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_comenzarMouseClicked
       Date inicio = new Date();
       int seg = inicio.getSeconds();
       int x=60;
       Personaje tipo;
       //Object r;
       //tipo = (Personaje)r;
       DefaultComboBoxModel dc1 = (DefaultComboBoxModel) cb_tipo.getModel();
       while(x>0){
           int id = idRandom();
           int r1= r.nextInt(dc1.getSize()-1);
           if(dc1.getElementAt(r1).equals("Fortaleza")){
                tipo = jugadores.get(r1).getPersonaje();
                jugadores.add(new Jugador(randomizerCad(), id, randomizerCad(), tipo));
           } else if(dc1.getElementAt(r1).equals("Medico")){
               tipo =jugadores.get(r1).getPersonaje();
                jugadores.add(new Jugador(randomizerCad(), id, randomizerCad(), tipo));
           } else if(dc1.getElementAt(r1).equals("Rastreador")){
               tipo =jugadores.get(r1).getPersonaje();
                jugadores.add(new Jugador(randomizerCad(), id, randomizerCad(), tipo));
           }
           ids.add(id);
           
           x--;
       }
       ta_jugadores.setText("");
        for (Jugador e : jugadores) {
            ta_jugadores.append(e.toString()+"\n");;
        }
    }//GEN-LAST:event_bt_comenzarMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String nombre = tf_nombrePer.getText();
        int vida = Integer.parseInt(tf_vida.getText());
        int escudo =Integer.parseInt(tf_escudoPer.getText());
        Arma arma = (Arma)cb_arma.getSelectedItem();
        Personaje personaje;
        if(cb_tipo.getSelectedItem().equals("Fortaleza")){
            personaje = new Fortaleza();
        } else if(cb_tipo.getSelectedItem().equals("Medico")){
            personaje = new Medico();
        } else{
            personaje = new Rastreador();
        }
        DefaultComboBoxModel dc= (DefaultComboBoxModel) cb_personajes.getModel();
        if(personaje instanceof Fortaleza){
            dc.addElement(new Fortaleza(nombre, vida, escudo, arma));
        } else if(personaje instanceof Medico){
            dc.addElement(new Medico(nombre, vida, escudo, arma));
        } else if(personaje instanceof Rastreador){
            dc.addElement(new Rastreador(nombre, vida, escudo, arma));
        }
        JOptionPane.showMessageDialog(Frame1, "Personaje creado exitosamente!");
        tf_nombrePer.setText("");
        tf_vida.setText("");
        tf_escudoPer.setText("");
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void bt_crearArmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearArmaMouseClicked
        String nombreA = tf_nombreArma.getText();
        int daño = Integer.parseInt(tf_daño.getText());
        int presicion = Integer.parseInt(tf_presicion.getText());
        DefaultComboBoxModel dc2= (DefaultComboBoxModel) cb_arma.getModel();
        dc2.addElement(new Arma(nombreA, daño, presicion));
        JOptionPane.showMessageDialog(Frame1, "Arma creada exitosamente!");
        cb_arma.setModel(dc2);
        tf_nombreArma.setText("");
        tf_daño.setText("");
        tf_presicion.setText("");
    }//GEN-LAST:event_bt_crearArmaMouseClicked

    private void bt_seleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_seleccionarMouseClicked
        Personaje p = (Personaje)cb_personajes.getSelectedItem();
        jugadores.get(3).setPersonaje(p);
    }//GEN-LAST:event_bt_seleccionarMouseClicked

    
    
    private void tf_idAtacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_idAtacarMouseClicked
        Collections.sort(ids);
        
    }//GEN-LAST:event_tf_idAtacarMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Frame1;
    private javax.swing.JButton bt_atacar;
    private javax.swing.JButton bt_comenzar;
    private javax.swing.JButton bt_crearArma;
    private javax.swing.JButton bt_ingresar;
    private javax.swing.JButton bt_seleccionar;
    private javax.swing.JComboBox<String> cb_arma;
    private javax.swing.JComboBox<String> cb_personajes;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_Restantes;
    private javax.swing.JTextArea ta_jugadores;
    private javax.swing.JTextField tf_contra;
    private javax.swing.JTextField tf_daño;
    private javax.swing.JTextField tf_escudoPer;
    private javax.swing.JTextField tf_idAtacar;
    private javax.swing.JTextField tf_nombreArma;
    private javax.swing.JTextField tf_nombrePer;
    private javax.swing.JTextField tf_presicion;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_vida;
    // End of variables declaration//GEN-END:variables

    ArrayList<Jugador> jugadores=new ArrayList(); 
  
    ArrayList<Integer> ids = new ArrayList();
    
}
