package view;

import java.awt.event.ActionEvent;
import java.util.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Binh
 */
public class ClassesPanel extends javax.swing.JPanel {
    private List<ActionListener> addClassBtnActionListeners;
    /**
     * Creates new form ClassesPanel
     */
    public ClassesPanel() {
        initComponents();
        
        // Allows to add subscribers to the events on addClassBtn element
        this.addClassBtnActionListeners = new ArrayList<>();
        this.addClassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (ActionListener listener : addClassBtnActionListeners) {
                    listener.actionPerformed(e);
                }
            }
        });
    }
    
    public void addAddClassBtnActionListener(ActionListener a) {
        if (!this.addClassBtnActionListeners.contains(a)) {
            this.addClassBtnActionListeners.add(a);
        }
    }
    
    public void removeAddClassBtnActionListener(ActionListener a) {
        this.addClassBtnActionListeners.remove(a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addClassBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        addClassBtn.setText("Add Class");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 352, Short.MAX_VALUE)
                        .addComponent(addClassBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addClassBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
