package view.form;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class tuLuanPanel extends javax.swing.JPanel {

//    private int tula
    
    public tuLuanPanel() {
        initComponents();
    }

    public tuLuanPanel(JScrollPane jScrollPane1, JTextArea tuLuanTextArea) {
        this.jScrollPane1 = jScrollPane1;
        this.tuLuanTextArea = tuLuanTextArea;
    } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tuLuanTextArea = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(200, 20));

        tuLuanTextArea.setColumns(20);
        tuLuanTextArea.setLineWrap(true);
        tuLuanTextArea.setRows(5);
        tuLuanTextArea.setTabSize(2);
        tuLuanTextArea.setPreferredSize(new java.awt.Dimension(100, 84));
        jScrollPane1.setViewportView(tuLuanTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tuLuanTextArea;
    // End of variables declaration//GEN-END:variables
}
