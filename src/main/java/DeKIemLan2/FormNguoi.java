/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DeKIemLan2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;
/**
 *
 * @author Nguyen Hai Trieu
 */
public class FormNguoi extends javax.swing.JFrame {
   private List<Nguoi> list=new ArrayList<>();
   private DefaultTableModel model=new DefaultTableModel();
   public static final String file_name="data.dat";
   
    /**
     * Creates new form FormNguoi
     */
    public FormNguoi() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public void clearForm(){
        txtTen.setText("");
        txtChieuCao.setText("");
        txtNgaySinh.setText("");
        txtMucChi.setText("");
        txtDiaChi.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable1 = new javax.swing.JTable();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable2 = new javax.swing.JTable();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        txtChieuCao = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        txtMucChi = new javax.swing.JTextField();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JButton btnSapXep = new javax.swing.JButton();
        javax.swing.JButton btnOpen = new javax.swing.JButton();
        javax.swing.JButton btnSave = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane3 = new javax.swing.JScrollPane();
        tbNguoi = new javax.swing.JTable();
        javax.swing.JButton btnUpdate = new javax.swing.JButton();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        javax.swing.JButton jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ NGƯỜI");

        jLabel2.setText("Tên :");

        jLabel3.setText("Ngày sinh :");

        jLabel4.setText("Chiều cao :");

        jLabel5.setText("Đại chỉ :");

        jLabel6.setText("Mức chi :");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sắp xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tbNguoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Ngáy sinh", "Chiều cao", "Đại chỉ", "Mức chi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbNguoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNguoiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbNguoi);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel7.setText("Tìm kiếm :");

        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(27, 27, 27)
                                .addComponent(btnSapXep)
                                .addGap(18, 18, 18)
                                .addComponent(btnOpen)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtChieuCao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMucChi)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtChieuCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMucChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSapXep)
                    .addComponent(btnOpen)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtTen.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tên Không được để trống");
            return;
        }
        double chieuCao=Double.parseDouble(txtChieuCao.getText());
        if(chieuCao<0){
            JOptionPane.showMessageDialog(this, "Chiều Cao phải lơn hơn không");
            return;
        }
        Nguoi ng=new Nguoi();
        ng.setName(txtTen.getText());
        ng.setNgaySinh(txtNgaySinh.getText());
        ng.setDiaChi(txtDiaChi.getText());
        ng.setChieucao(Double.parseDouble(txtChieuCao.getText()));
        ng.setMucChi(Double.parseDouble(txtMucChi.getText()));
        if(Double.parseDouble(txtMucChi.getText())==0){
            JOptionPane.showMessageDialog(this, "Dừng");
            return;
        }else{
           
            list.add(ng);
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        }
       loadTable();
       clearForm();
       txtTen.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
         list.sort((n1, n2) -> Double.compare(n1.getChieucao(), n2.getChieucao()));
    
    // Sort by name if heights are equal
    list.sort((n1, n2) -> {
        if (n1.getChieucao() == n2.getChieucao()) {
            return n1.getName().compareToIgnoreCase(n2.getName());
        }
        return 0;
    });

    // Update the table
    loadTable();
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    String diaChi = txtSearch.getText();
    DefaultTableModel model = (DefaultTableModel) tbNguoi.getModel();
    model.setRowCount(0); // Clear the current table content
    
    for (Nguoi item : list) {
        if (item.getDiaChi().equalsIgnoreCase(diaChi)) {
            model.addRow(new Object[] { item.getName(), item.getNgaySinh(), item.getChieucao(), item.getDiaChi(), item.getMucChi() });
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed
   public void setModel(Nguoi st) {
    txtTen.setText(st.getName());
    txtNgaySinh.setText(st.getNgaySinh());
    txtChieuCao.setText(String.valueOf(st.getChieucao())); // Convert to String
    txtDiaChi.setText(st.getDiaChi());
    txtMucChi.setText(String.valueOf(st.getMucChi())); // Convert to String
}
    private void tbNguoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNguoiMouseClicked
        // TODO add your handling code here:
        int point=tbNguoi.getSelectedRow();
        
        setModel(list.get(point));
    }//GEN-LAST:event_tbNguoiMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int index=tbNguoi.getSelectedRow();
        Nguoi ng=list.get(index);
        ng.setName(txtTen.getText());
        ng.setNgaySinh(txtNgaySinh.getText());
        ng.setChieucao(Double.parseDouble(txtChieuCao.getText()));
        ng.setDiaChi(txtDiaChi.getText());
        ng.setMucChi(Double.parseDouble(txtMucChi.getText()));
        loadTable();
        clearForm();
        txtTen.requestFocus();
        
    }//GEN-LAST:event_btnUpdateActionPerformed
    public List<Nguoi> readFile() {
    ArrayList<Nguoi> list = new ArrayList<>();
    try {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file_name));
        while (true) {
            Nguoi nguoi = (Nguoi) ois.readObject();
            list.add(nguoi);
        }
    } catch (EOFException e) {
        // End of file reached
    } catch (Exception e) {
        System.out.println("Error reading data: " + e.getMessage());
    }
    return list;
}

    public void writeFile(List<Nguoi> ls){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file_name));
            for (Nguoi student : list) {    
                oos.writeObject(student);
            }
            oos.close();
        } catch (Exception e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }
        
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        writeFile(list);
        JOptionPane.showMessageDialog(this, "Lưu file thành công");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        list=readFile();
        loadTable();
    }//GEN-LAST:event_btnOpenActionPerformed
   private void loadTable(){
       DefaultTableModel model=(DefaultTableModel)tbNguoi.getModel();
       model.setRowCount(0);
       for(Nguoi item:list){
         model.addRow(new Object[]{item.getName(),item.getNgaySinh(),item.getChieucao(),item.getDiaChi(),item.getMucChi()});
       }
   }
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
            java.util.logging.Logger.getLogger(FormNguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNguoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNguoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable tbNguoi;
    javax.swing.JTextField txtChieuCao;
    javax.swing.JTextField txtDiaChi;
    javax.swing.JTextField txtMucChi;
    javax.swing.JTextField txtNgaySinh;
    javax.swing.JTextField txtSearch;
    javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}