import conek.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.zone.ZoneRulesProvider.refresh;
public class laptop extends javax.swing.JFrame {

   conek.koneksi k = new koneksi();
   private DefaultTableModel laptop;
 int index_baris;
 Connection con;
    public laptop() {
        initComponents();
        k.koneksi();
        k.koneksi();
        con=k.con;
        
       laptop = new DefaultTableModel() ;
tabel.setModel(laptop);

laptop.addColumn("Kode_Laptop");
laptop.addColumn("Nama_Laptop");
laptop.addColumn("Harga_Laptop");
laptop.addColumn("Warna");

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kode_laptop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama_laptop = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        harga_laptop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        warna_laptop = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMinimumSize(new java.awt.Dimension(647, 508));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Laptop");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 14, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Kode Laptop");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 159, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        kode_laptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_laptopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 37, 0, 0);
        getContentPane().add(kode_laptop, gridBagConstraints);

        jLabel3.setText("Nama Laptop");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 159, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        nama_laptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_laptopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 37, 0, 0);
        getContentPane().add(nama_laptop, gridBagConstraints);

        jLabel4.setText("Harga");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 159, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        harga_laptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_laptopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 37, 0, 0);
        getContentPane().add(harga_laptop, gridBagConstraints);

        jLabel5.setText("Warna Laptop");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 159, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        warna_laptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warna_laptopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 186;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 37, 0, 0);
        getContentPane().add(warna_laptop, gridBagConstraints);

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 182, 0, 0);
        getContentPane().add(btn_tambah, gridBagConstraints);

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 18, 0, 0);
        getContentPane().add(btn_edit, gridBagConstraints);

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 16, 0, 0);
        getContentPane().add(btn_hapus, gridBagConstraints);

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 18, 0, 0);
        getContentPane().add(btn_reset, gridBagConstraints);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 568;
        gridBagConstraints.ipady = 83;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(34, 15, 57, 10);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kode_laptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_laptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_laptopActionPerformed

    private void nama_laptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_laptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_laptopActionPerformed

    private void harga_laptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_laptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_laptopActionPerformed

    private void warna_laptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warna_laptopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warna_laptopActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
      
        if(kode_laptop.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Lengkapi data");
        }else{
        
         try{
             Class.forName("com.mysql.jdbc.Driver");
   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/laptop", "root", "");
    Statement statement = connection.createStatement();
         String sql="UPDATE datalaptop set nama='"+nama_laptop.getText()+"',harga='"+harga_laptop.getText()+"',warna='"+warna_laptop.getText()+"' WHERE id='"+kode_laptop.getText()+"'";
         
        PreparedStatement ps=con.prepareStatement(sql);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Berhasil Update Data");
        kosong();
     
       
    }catch(SQLException e){
         JOptionPane.showMessageDialog(this, "GAGAL \n"+e.getMessage());
    }    catch (ClassNotFoundException ex) {
             Logger.getLogger(laptop.class.getName()).log(Level.SEVERE, null, ex);
         }
         kosong();
      
        }
        
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
      try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/laptop", "root", "");
            Statement statement = connection.createStatement();
            String sql = "select * from datalaptop order by id";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Object [] o = new Object[4];
                o[0] = rs.getString("ID");
                o[1] = rs.getString("Nama");
                o[2] = rs.getString("Harga");
                o[3] = rs.getString("Warna");
              ;
                

               laptop.addRow(o);

            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(laptop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        
        int pilihan = JOptionPane.showConfirmDialog(this, ""
            +"Apa anda setuju?", "komfirmasi",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (pilihan ==0) {
            laptop.removeRow(index_baris);
            refresh();
        }
        
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
          try {
            k.stat.executeUpdate("insert into datalaptop values ("+"'"+kode_laptop.getText()+"',"
                + "'"+nama_laptop.getText()+"',"
               
                + "'"+harga_laptop.getText()+"',"
                
                
                + "'"+warna_laptop.getText()+"')");
            kode_laptop.setText("");
            nama_laptop.setText("");
            
            harga_laptop.setText("");
            warna_laptop.setText("");
            
            kode_laptop.requestFocus();
            JOptionPane.showMessageDialog(rootPane,"SUDAH TERINPUT");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
          int r = tabel.getSelectedRow();
        if (r != -1){
            int id = Integer.parseInt(tabel.getValueAt(r, 0).toString());
            String nama = tabel.getValueAt(r, 1).toString();
            String harga = tabel.getValueAt(r, 2).toString();
            String warna = tabel.getValueAt(r, 3).toString();
           
            
            
            nama_laptop.setText(nama);
        
            harga_laptop.setText(harga);
            warna_laptop.setText(warna);
           
         
            
         
            
            index_baris = r;}
    }//GEN-LAST:event_tabelMouseClicked

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
            java.util.logging.Logger.getLogger(laptop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laptop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laptop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laptop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laptop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JTextField harga_laptop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode_laptop;
    private javax.swing.JTextField nama_laptop;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField warna_laptop;
    // End of variables declaration//GEN-END:variables

       private void kosong(){
        kode_laptop.setText(null);
        nama_laptop.setText(null);
        
        harga_laptop.setText(null);
        warna_laptop.setText(null);  
        
    }
 
}
