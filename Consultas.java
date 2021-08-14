package vista;

import controladorBO.controladorBO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modeloVO.modeloVO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Consultas extends javax.swing.JDialog {
    
    public void limpiar(){
        txtConsultas.setText(null);
    }
    
    private DefaultTableModel modelo;

    public Consultas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Nacimiento");
        modelo.addColumn("Correo institucional");
        modelo.addColumn("Coreo personal");
        modelo.addColumn("Teléfono celular");
        modelo.addColumn("Teléfono fijo");
        modelo.addColumn("Programa");
        TDatos.setModel(modelo);
        List<modeloVO> estudiantes = new controladorBO().obtenerEstudiantes();
        for (modeloVO estudiante : estudiantes){
            String fila[] = {estudiante.getNombres(), estudiante.getApellidos(), estudiante.getNacimiento(), estudiante.getCorreoInst(), estudiante.getCorreoPers(), estudiante.getCelular() + "", estudiante.getFijo() + "", estudiante.getCarrera()};
            modelo.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxConsultas = new javax.swing.JComboBox<>();
        txtConsultas = new javax.swing.JTextField();
        ButConsultar = new javax.swing.JButton();
        ButContar = new javax.swing.JButton();
        txtNEstudiantes = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_estudiantes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ComboBoxConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apellidos", "Programa", "Correo institucional", "Celular", "Fecha de nacimiento" }));
        ComboBoxConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxConsultasActionPerformed(evt);
            }
        });

        ButConsultar.setText("Consultar");
        ButConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButConsultarActionPerformed(evt);
            }
        });

        ButContar.setText("Contar");
        ButContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButContarActionPerformed(evt);
            }
        });

        TDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TDatos);

        jLabel1.setText("Número de estudiantes por programa: ");

        jLabel2.setText("TOTAL ESTUDIANTES: ");

        lbl_estudiantes.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButContar)
                    .addComponent(txtNEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(122, 122, 122)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButConsultar)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButConsultar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_estudiantes))
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButContar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxConsultasActionPerformed

    private void ButConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButConsultarActionPerformed
        modelo.setRowCount(0);
        String tipoconsulta = (String) ComboBoxConsultas.getSelectedItem();
        List<modeloVO> estudiantes = null;
        if(tipoconsulta.equals("Apellidos")){
            estudiantes = new controladorBO().consultarPorApellido(txtConsultas.getText());
            limpiar();
        }else if(tipoconsulta.equals("Programa")){
            estudiantes = new controladorBO().consultarPorPrograma(txtConsultas.getText());
            limpiar();
        }else if(tipoconsulta.equals("Celular")){
            long celu;
            celu = Long.parseLong(txtConsultas.getText());
            estudiantes = new controladorBO().consultarPorCelular(celu);
            limpiar();
        }else if(tipoconsulta.equals("Correo institucional")){
            estudiantes = new ArrayList();
            estudiantes.add(new controladorBO().obtenerEstudiante(txtConsultas.getText()));
        }else if(tipoconsulta.equals("Fecha de nacimiento")){
            estudiantes = new controladorBO().consultarPorFechaNacimiento(txtConsultas.getText());
            limpiar();
            
        }for(modeloVO estudiante : estudiantes){
            String fila[] = {estudiante.getNombres(), estudiante.getApellidos(), estudiante.getNacimiento(), estudiante.getCorreoInst(), estudiante.getCorreoPers(), estudiante.getCelular() + "", estudiante.getFijo() + "", estudiante.getCarrera()};
            modelo.addRow(fila);
        }
        lbl_estudiantes.setText(estudiantes.size() + "");
    }//GEN-LAST:event_ButConsultarActionPerformed

    private void ButContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButContarActionPerformed
        int resultado; 
        resultado = new controladorBO().consultarCantidadEstudiantes(txtNEstudiantes.getText());
        JOptionPane.showMessageDialog(this, "Número de estudiantes: " + resultado);
        txtNEstudiantes.setText(null);
    }//GEN-LAST:event_ButContarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Consultas dialog = new Consultas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButConsultar;
    private javax.swing.JButton ButContar;
    private javax.swing.JComboBox<String> ComboBoxConsultas;
    private javax.swing.JTable TDatos;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_estudiantes;
    private javax.swing.JTextField txtConsultas;
    private javax.swing.JTextField txtNEstudiantes;
    // End of variables declaration//GEN-END:variables
}
/*
1. TDatos: Check
2. btnConsultar: Check - ButConsultar
3. btnContar: Check - ButContar;
4. cbx_tipoconsulta: Check - ComboBoxConsultas
5. JLabell1: Check
6. JLabell2. Check
JScrollPanel; (ScrollPane)
lbl_estudiantes (JLabel)
8. txtConsultas: Check 
9. txtNEstudiantes: Check

*/