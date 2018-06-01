/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_sarahcastelar;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Usuario
 */
public class principal extends javax.swing.JFrame {
double pesoUniverso = 0, pesoTortuga = 0, pesoCriaturas;


    
    /**
     * Creates new form principal
     */
    public principal() {
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

        jpop_tree = new javax.swing.JPopupMenu();
        jmi_verUniverso = new javax.swing.JMenuItem();
        jpop_Mundos = new javax.swing.JPopupMenu();
        jmi_verPeso = new javax.swing.JMenuItem();
        jpop_Criatura = new javax.swing.JPopupMenu();
        jmi_verRaza = new javax.swing.JMenuItem();
        jmi_verRegion = new javax.swing.JMenuItem();
        jmi_verEnergia = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_mundos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_criaturas = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_Universo = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jb_agregarMundo = new javax.swing.JButton();
        jb_modificarMundo = new javax.swing.JButton();
        jb_eliminarMundo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jb_agregarCriaturas = new javax.swing.JButton();
        jb_modificarCriaturas = new javax.swing.JButton();
        jb_eliminarCriaturas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jb_universo = new javax.swing.JButton();
        jb_agregarUniverso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jmi_verUniverso.setText("Ver datos del Universo");
        jmi_verUniverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verUniversoActionPerformed(evt);
            }
        });
        jpop_tree.add(jmi_verUniverso);

        jmi_verPeso.setText("Ver peso del mundo");
        jmi_verPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verPesoActionPerformed(evt);
            }
        });
        jpop_Mundos.add(jmi_verPeso);

        jmi_verRaza.setText("Ver raza ");
        jmi_verRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verRazaActionPerformed(evt);
            }
        });
        jpop_Criatura.add(jmi_verRaza);

        jmi_verRegion.setText("Ver region");
        jmi_verRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verRegionActionPerformed(evt);
            }
        });
        jpop_Criatura.add(jmi_verRegion);

        jmi_verEnergia.setText("Ver energia de la criatura");
        jmi_verEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verEnergiaActionPerformed(evt);
            }
        });
        jpop_Criatura.add(jmi_verEnergia);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_mundos.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_mundos);

        jl_criaturas.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_criaturas);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Universo");
        jt_Universo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_Universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_UniversoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jt_Universo);

        jLabel1.setText("Mundos");

        jLabel2.setText("Criaturas");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jb_agregarMundo.setText("Agregar Mundos");
        jb_agregarMundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMundoMouseClicked(evt);
            }
        });

        jb_modificarMundo.setText("Modificar Mundo");
        jb_modificarMundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarMundoMouseClicked(evt);
            }
        });

        jb_eliminarMundo.setText("Eliminar Mundo");
        jb_eliminarMundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarMundoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_eliminarMundo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_modificarMundo, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jb_agregarMundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_agregarMundo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_modificarMundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_eliminarMundo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jb_agregarCriaturas.setText("Agregar Criaturas");
        jb_agregarCriaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarCriaturasMouseClicked(evt);
            }
        });

        jb_modificarCriaturas.setText("Modificar Criaturas");
        jb_modificarCriaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarCriaturasMouseClicked(evt);
            }
        });

        jb_eliminarCriaturas.setText("Eliminar Criatura");
        jb_eliminarCriaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarCriaturasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_eliminarCriaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jb_modificarCriaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_agregarCriaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_agregarCriaturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_modificarCriaturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_eliminarCriaturas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jb_universo.setText("Agregar al Arbol");
        jb_universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_universoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jb_universo)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jb_universo)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jb_agregarUniverso.setText("AGREGAR UNIVERSO");
        jb_agregarUniverso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarUniversoMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("PARA EMPEZAR AGREGA UN UNIVERSO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jb_agregarUniverso, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_agregarUniverso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_agregarMundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMundoMouseClicked
        // TODO add your handling code here:
        if (!universo.isEmpty()) {
             String nombre = JOptionPane.showInputDialog("Ingrese nombre del mundo: ");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso del mundo: "));
            ((Universo) universo.get(0)).getMundos().add(new MundoDisco(nombre, peso));

            //agregarlo al jlist.
            DefaultListModel modelo = (DefaultListModel) jl_mundos.getModel();
            modelo.addElement(new MundoDisco(nombre, peso));
            jl_mundos.setModel(modelo);
            pesoTortuga += peso;
        } else 
            JOptionPane.showMessageDialog(this, "No ha agregado ningun universo todavia. Por favor hagalo.");
       
        
        
    }//GEN-LAST:event_jb_agregarMundoMouseClicked

    private void jb_agregarUniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarUniversoMouseClicked
        // TODO add your handling code here:
        String codigo = JOptionPane.showInputDialog("Ingrese codigo universo: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del universo: "));
        universo.add(new Universo(codigo, edad, 0));
        
    }//GEN-LAST:event_jb_agregarUniversoMouseClicked

    private void jb_modificarMundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarMundoMouseClicked
        // TODO add your handling code here:
        if (jl_mundos.getSelectedIndex() >= 0) {
         String nombre = JOptionPane.showInputDialog("Ingrese nombre nuevo del mundo: ");
         ((Universo)universo.get(0)).getMundos().get(jl_mundos.getSelectedIndex()).setNombreTortuga(nombre);   
         
         //modificar jlist
         DefaultListModel modelo = (DefaultListModel)jl_mundos.getModel();
         ((MundoDisco)modelo.get(jl_mundos.getSelectedIndex())).setNombreTortuga(nombre);
         jl_mundos.setModel(modelo);
        }else
            JOptionPane.showMessageDialog(this, "no ha seleccionado ningun mundo que modificar. ");
         
    }//GEN-LAST:event_jb_modificarMundoMouseClicked

    private void jb_eliminarMundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarMundoMouseClicked
        // TODO add your handling code here:
        if (jl_mundos.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) jl_mundos.getModel();
            modelo.remove(jl_mundos.getSelectedIndex()); 
            double pesoMundo = Double.parseDouble(String.valueOf(((Universo)universo.get(0)).getMundos().get(jl_mundos.getSelectedIndex())));
            pesoTortuga-= pesoMundo;
        }else
            JOptionPane.showMessageDialog(this, "no ha seleccionado ningun mundo que eliminar. ");
    }//GEN-LAST:event_jb_eliminarMundoMouseClicked

    private void jb_agregarCriaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarCriaturasMouseClicked
        // TODO add your handling code here:
        if (jl_mundos.getSelectedIndex() >= 0) {
            String nombre = JOptionPane.showInputDialog("Ingrese nombre de la raza: ");
            int numEnergia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de energia: "));
            int maxAnios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero maximo de anios "));
            String nombreRegion = JOptionPane.showInputDialog("Ingrese nombre de la region: ");
            int cantidadVivos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de vivos: "));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso de la criatura: "));
            ((Universo)universo.get(jl_mundos.getSelectedIndex())).getMundos().get(jl_mundos.getSelectedIndex()).getCriaturas().add(new Criatura(nombre, numEnergia, maxAnios, nombreRegion, cantidadVivos));
            
            pesoCriaturas+= cantidadVivos * peso;
            //agregar al jlist
            DefaultListModel modelo = (DefaultListModel) jl_criaturas.getModel();
            modelo.addElement(new Criatura(nombre, numEnergia, maxAnios, nombreRegion, cantidadVivos));
            jl_criaturas.setModel(modelo);
        }else
            JOptionPane.showMessageDialog(this, "No se ha seleecionado algun mundo al cual agregarle la criatura.");
        
        
    }//GEN-LAST:event_jb_agregarCriaturasMouseClicked

    private void jb_modificarCriaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarCriaturasMouseClicked
        // TODO add your handling code here:
        
        if (jl_mundos.getSelectedIndex() >= 0) {
            String nombre = JOptionPane.showInputDialog("Ingrese nuevo nombre de la raza: ");
            int numEnergia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo numero de energia: "));
            int maxAnios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo numero maximo de anios "));
            String nombreRegion = JOptionPane.showInputDialog("Ingrese nuevo nombre de la region: ");
            int cantidadVivos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva cantidad de vivos: "));
         ((Universo)universo.get(0)).getMundos().get(jl_mundos.getSelectedIndex()).getCriaturas().get(jl_mundos.getSelectedIndex()).setCantidadVivos(cantidadVivos);
         ((Universo)universo.get(0)).getMundos().get(jl_mundos.getSelectedIndex()).getCriaturas().get(jl_mundos.getSelectedIndex()).setMaximoAnios(maxAnios);
         ((Universo)universo.get(0)).getMundos().get(jl_mundos.getSelectedIndex()).getCriaturas().get(jl_mundos.getSelectedIndex()).setNombreRaza(nombre);
         ((Universo)universo.get(0)).getMundos().get(jl_mundos.getSelectedIndex()).getCriaturas().get(jl_mundos.getSelectedIndex()).setNombreRegion(nombreRegion);
         ((Universo)universo.get(0)).getMundos().get(jl_mundos.getSelectedIndex()).getCriaturas().get(jl_mundos.getSelectedIndex()).setNumeroEnergia(numEnergia);


         //modificar jlist
         DefaultListModel modelo = (DefaultListModel)jl_criaturas.getModel();
         ((Criatura)modelo.get(jl_mundos.getSelectedIndex())).setCantidadVivos(cantidadVivos);
         ((Criatura)modelo.get(jl_mundos.getSelectedIndex())).setMaximoAnios(maxAnios);
         ((Criatura)modelo.get(jl_mundos.getSelectedIndex())).setNombreRaza(nombre);
         ((Criatura)modelo.get(jl_mundos.getSelectedIndex())).setNombreRegion(nombreRegion);
         ((Criatura)modelo.get(jl_mundos.getSelectedIndex())).setNumeroEnergia(numEnergia);
         jl_criaturas.setModel(modelo);
        }else
            JOptionPane.showMessageDialog(this, "no ha seleccionado ningun mundo que modificar. ");
    }//GEN-LAST:event_jb_modificarCriaturasMouseClicked

    private void jb_eliminarCriaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarCriaturasMouseClicked
        // TODO add your handling code here:
        if (jl_criaturas.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) jl_criaturas.getModel();
            modelo.remove(jl_criaturas.getSelectedIndex()); 
        double cantidadVivos = ((Universo)universo.get(jl_mundos.getSelectedIndex())).getMundos().get(jl_mundos.getSelectedIndex()).getCriaturas().get(jl_mundos.getSelectedIndex()).getCantidadVivos();  
        double peso =   ((Universo)universo.get(jl_mundos.getSelectedIndex())).getMundos().get(jl_mundos.getSelectedIndex()).getCriaturas().get(jl_mundos.getSelectedIndex()).getPesoCriatura();
        pesoCriaturas -= cantidadVivos*peso;
        }else
            JOptionPane.showMessageDialog(this, "no ha seleccionado ninguna criatura que eliminar. ");
    }//GEN-LAST:event_jb_eliminarCriaturasMouseClicked

    private void jb_universoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_universoMouseClicked
        // TODO add your handling code here:
        
        
        if(jl_mundos.getSelectedIndex() >= 0 && jl_criaturas.getSelectedIndex() >= 0 ){
            DefaultTreeModel m = (DefaultTreeModel) jt_Universo.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultListModel mundo = (DefaultListModel) jl_mundos.getModel();
            DefaultListModel criatura = (DefaultListModel) jl_criaturas.getModel();
            int c = -1;
            
             for (int i = 0; i < raiz.getChildCount(); i++) {
                 if(raiz.getChildAt(i).toString().equals(((MundoDisco) mundo.get(jl_mundos.getSelectedIndex())).toString())){
                     DefaultMutableTreeNode p = new DefaultMutableTreeNode((Criatura) criatura.get(jl_criaturas.getSelectedIndex()));
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                    c = 1;
                 }    
             }
             
             if(c == -1){
                DefaultMutableTreeNode n = new DefaultMutableTreeNode ((MundoDisco) mundo.get(jl_mundos.getSelectedIndex()));
                DefaultMutableTreeNode p = new DefaultMutableTreeNode((Criatura) criatura.get(jl_criaturas.getSelectedIndex()));
                n.add(p);
                raiz.add(n); 
             } 
             m.reload();
             mundo.remove(jl_mundos.getSelectedIndex());
             criatura.remove(jl_criaturas.getSelectedIndex());
            
            m.reload();
            
        }else{
            JOptionPane.showMessageDialog(this, "No hay mundo ni criatura seleccionado");
        }
        
        
    }//GEN-LAST:event_jb_universoMouseClicked

    private void jt_UniversoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_UniversoMouseClicked
        // TODO add your handling code here:
        if(evt.isMetaDown()){
            int row = jt_Universo.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_Universo.setSelectionRow(row);
            Object v1 = jt_Universo.getSelectionPath().getLastPathComponent();
            n_sel = (DefaultMutableTreeNode) v1;
            if(n_sel.getUserObject() instanceof String && n_sel.getUserObject().equals("Universo")){
                jpop_tree.show(evt.getComponent(),evt.getX(),evt.getY());
                
            }
            
             if(n_sel.getUserObject() instanceof MundoDisco){
                 m_sel = (MundoDisco) n_sel.getUserObject();
                jpop_Mundos.show(evt.getComponent(),evt.getX(),evt.getY());
                
            }
             if(n_sel.getUserObject() instanceof Criatura){
                c_sel = (Criatura) n_sel.getUserObject();
                jpop_Criatura.show(evt.getComponent(),evt.getX(),evt.getY());
                
            }
            
            /*
            if(n_sel.getUserObject() instanceof String && !n_sel.getUserObject().equals("Personas")){
                jpm_an.show(evt.getComponent(),evt.getX(),evt.getY());
            }
            */         
        }
        
        
    }//GEN-LAST:event_jt_UniversoMouseClicked

    private void jmi_verUniversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verUniversoActionPerformed
        // TODO add your handling code here:
        pesoUniverso = pesoTortuga + pesoCriaturas;
        JOptionPane.showMessageDialog(this, ""
                        + "Codigo universo: " + String.valueOf(((Universo)universo.get(0)).getCodigo()) + "\n"
                        + "Edad Universo: " + String.valueOf(((Universo)universo.get(0)).getEdad()) + "\n"
                        + "Peso Universo: " + pesoUniverso + "\n"  );
        
        /*
            Cada vez que agregaba criaturas o mundos iba sumando el peso del universo,
        igual si se eliminaba el mundo o la criatura iba restandolo del peso total
        al final solo sume las dos varibales pesoTortuga + pesoCriaturas para tener el 
        peso total :)
        */
    }//GEN-LAST:event_jmi_verUniversoActionPerformed

    private void jmi_verPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verPesoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Peso del mundo: " + m_sel.getPesoTortuga());
    }//GEN-LAST:event_jmi_verPesoActionPerformed

    private void jmi_verRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verRazaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Raza de la criatura: " + c_sel.getNombreRaza());
    }//GEN-LAST:event_jmi_verRazaActionPerformed

    private void jmi_verRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verRegionActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Region de la Criatura: " + c_sel.getNombreRegion());
    }//GEN-LAST:event_jmi_verRegionActionPerformed

    private void jmi_verEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verEnergiaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Numero de Energia de la Criatura: " + c_sel.getNumeroEnergia());
    }//GEN-LAST:event_jmi_verEnergiaActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_agregarCriaturas;
    private javax.swing.JButton jb_agregarMundo;
    private javax.swing.JButton jb_agregarUniverso;
    private javax.swing.JButton jb_eliminarCriaturas;
    private javax.swing.JButton jb_eliminarMundo;
    private javax.swing.JButton jb_modificarCriaturas;
    private javax.swing.JButton jb_modificarMundo;
    private javax.swing.JButton jb_universo;
    private javax.swing.JList<String> jl_criaturas;
    private javax.swing.JList<String> jl_mundos;
    private javax.swing.JMenuItem jmi_verEnergia;
    private javax.swing.JMenuItem jmi_verPeso;
    private javax.swing.JMenuItem jmi_verRaza;
    private javax.swing.JMenuItem jmi_verRegion;
    private javax.swing.JMenuItem jmi_verUniverso;
    private javax.swing.JPopupMenu jpop_Criatura;
    private javax.swing.JPopupMenu jpop_Mundos;
    private javax.swing.JPopupMenu jpop_tree;
    private javax.swing.JTree jt_Universo;
    // End of variables declaration//GEN-END:variables
ArrayList <Universo> universo = new ArrayList();
private DefaultMutableTreeNode n_sel;
private Universo u_sel;
private MundoDisco m_sel;
private Criatura c_sel;
}
