package sms;


// Import all the necessary packages, classes, and interfaces
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abscyssa
 */
public class inventory extends javax.swing.JFrame {

    /**
     *
     */
    public inventory() {
        // Method that Netbeans swing Designer creates to initialize components
        initComponents();
        // Calls the function, Connect
        Connect();
        // Calls the function, load
        load();
        // Aligns itself with windows task bar; sets maximum screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    // Session between Java application and database; factory of Statement, PreparedStatement, and DatabaseMetaData
   Connection con;
   // An object that represents a precompiled SQL statement
   PreparedStatement pst;
   // Implementation of TableModel that uses a Vector of Vectors to store the cell value objects
   DefaultTableModel df;

    // Connection method

    /**
     *
     */
    public void Connect(){
         try {
             // Register the driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establishes a connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost/stock","root","");
            // Handles the error
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtsupplier = new javax.swing.JTextField();
        txtitemdescription = new javax.swing.JTextField();
        txtitemid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        txtminus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(0, 51, 255));
        jTable1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item #", "Date", "Item Description", "Item ID", "Supplier", "Add", "Minus", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Description:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item ID:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Supplier:");

        txtsupplier.setFont(new java.awt.Font("Tox Typewriter", 0, 24)); // NOI18N

        txtitemdescription.setFont(new java.awt.Font("Tox Typewriter", 0, 24)); // NOI18N

        txtitemid.setFont(new java.awt.Font("Tox Typewriter", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date:");

        txtdate.setFont(new java.awt.Font("Tox Typewriter", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Add:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Minus:");

        txtadd.setFont(new java.awt.Font("Tox Typewriter", 0, 24)); // NOI18N

        txtminus.setFont(new java.awt.Font("Tox Typewriter", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtitemdescription)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtminus, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtitemdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtitemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtminus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 120)); // NOI18N
        jLabel1.setText("INVENTORY");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/inventory_icon.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(14, 14, 14)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Enter button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try { 
        // Returns the innertext of the elements
        String date = txtdate.getText();
        String itemdescription = txtitemdescription.getText();
        String itemid = txtitemid.getText();
        String supplier = txtsupplier.getText();
        String addstock = txtadd.getText();
        String minus = txtminus.getText();
        // Add the values of addstock and minus
        String balance = String.valueOf(Integer.parseInt(addstock)+Integer.parseInt(minus)); 
            // Insert the rows into the database
            pst = con.prepareStatement("insert into inventorytable(date, itemdescription, itemid, supplier,addstock,minus,balance)values(?,?,?,?,?,?,?)");
            pst.setString(1, date);
            pst.setString(2, itemdescription);
            pst.setString(3, itemid);
            pst.setString(4, supplier);
            pst.setString(5, addstock);
            pst.setString(6, minus);
            pst.setString(7, balance);
            // Insert, update, and delete rows in those tables
            pst.executeUpdate();
            // Show a JOptionPane dialog with a text message "Inventory Added"
            JOptionPane.showMessageDialog(this, "Inventory Added");
            // Sets the text to blank
            txtdate.setText("");
            txtitemdescription.setText("");
            txtitemid.setText("");
            txtsupplier.setText("");
            txtadd.setText("");
            txtminus.setText("");
            txtdate.requestFocus();
            // Calls the function, load
            load();
            // Enables the enter button
            jButton1.setEnabled(true);
            // Handles the error
        } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Edit button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Loads the table
        df = (DefaultTableModel)jTable1.getModel();
       // Gets the data of the selected row
       int selected = jTable1.getSelectedRow();
       // Assigns the itemnumber as the starting position
       int itemnumber = Integer.parseInt(df.getValueAt(selected, 0).toString());
       // Returns the innertext of the elements
       String date = txtdate.getText();
       String itemdescription = txtitemdescription.getText();
       String itemid = txtitemid.getText();
       String supplier = txtsupplier.getText();
       String addstock = txtadd.getText();
       String minus = txtminus.getText();
       // Adds the values of addstock and minus
       String balance = String.valueOf(Integer.parseInt(addstock)+Integer.parseInt(minus)); 

       try{
       // Updates the rows in the database
       pst = con.prepareStatement("update inventorytable set date=?,itemdescription=?, itemid=?, supplier=?, addstock=?, minus=?,balance=? where itemnumber=?"); 
       pst.setString(1, date);
       pst.setString(2, itemdescription);
       pst.setString(3, itemid);
       pst.setString(4, supplier);
       pst.setString(5, addstock);
       pst.setString(6, minus);
       pst.setString(7,balance);
       pst.setInt(8, itemnumber);
       // Insert, update, and delete rows in those tables
       pst.executeUpdate();
       JOptionPane.showMessageDialog(this, "Inventory Updated");
       // Sets the text to blank 
       txtdate.setText("");
       txtitemdescription.setText("");
       txtitemid.setText("");
       txtsupplier.setText("");
       txtadd.setText("");
       txtminus.setText("");
       txtdate.requestFocus();
       // Calls the function, load
       load();
       // Handles the error
       }catch(SQLException ex){
           Logger.getLogger(sales.class.getName()).log(Level.SEVERE,null,ex);
       }          
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // When you click a certain row in the table
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Loads the table
        df = (DefaultTableModel)jTable1.getModel();
        // Gets the data of the selected row
        int selected = jTable1.getSelectedRow();
        // Assigns the itemnumber as the starting position
        int itemnumber = Integer.parseInt(df.getValueAt(selected, 0).toString());
        // Assigns date as the second row or index 1
        txtdate.setText(df.getValueAt(selected,1).toString());
        // Assigns item description as the third row or index 2
        txtitemdescription.setText(df.getValueAt(selected, 2).toString());
        // Assigns item id as the fourth row or index 3
        txtitemid.setText(df.getValueAt(selected, 3).toString());
        // Assigns supplier as the fifth row or index 4
        txtsupplier.setText(df.getValueAt(selected, 4).toString());
        // Assigns add as the sixth row or index 5
        txtadd.setText(df.getValueAt(selected,5).toString());
        // Assigns minus as the seventh row or index 6
        txtminus.setText(df.getValueAt(selected, 6).toString());
        // Enter button is not enabled
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked
    
    
    // Delete button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // Loads the table
       df=(DefaultTableModel)jTable1.getModel();
       // Gets the data of the selected row
       int selected = jTable1.getSelectedRow();
       // Assigns the item number as the starting position
       int itemnumber = Integer.parseInt(df.getValueAt(selected, 0).toString());

       try{
       // Deletes the row in the database
       pst = con.prepareStatement("delete from inventorytable where itemnumber=?"); 
       pst.setInt(1, itemnumber);
        // Insert, update, and delete rows in those tables
       pst.executeUpdate();
       // Show a JOptionPane dialog with a text message "Inventory Deleted"
       JOptionPane.showMessageDialog(this, "Inventory Deleted");
       // Sets the text to blank
       txtdate.setText("");
       txtitemdescription.setText("");
       txtitemid.setText("");
       txtsupplier.setText("");
       txtadd.setText("");
       txtminus.setText("");
       // Makes a request that txtdate gets set to a focused state
       txtdate.requestFocus();
       // Calls the function, load
       load();
       // Handles the error
       }catch(SQLException ex){
           Logger.getLogger(sales.class.getName()).log(Level.SEVERE,null,ex);
       }               
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    // Cancel button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Sets the text to blank
         txtdate.setText("");
         txtitemdescription.setText("");
         txtitemid.setText("");
         txtsupplier.setText("");
         txtadd.setText("");
         txtminus.setText("");
         // Makes a request that txtitemdescription gets set to a focused state
         txtitemdescription.requestFocus();
         // Calls the function, load
         load();
         // Enables the enter button
         jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    
    
    // Close button
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // The frame will become invisible  
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

   // Function for the table to load

    /**
     *
     */
   public void load(){
       int a;
       try {
           // Select all the columns from the table
            pst=con.prepareStatement("select * from inventorytable"); 
            // Used to execute statements that returns tabular data; returns an object of rs
            ResultSet rs = pst.executeQuery();
            // Retrieves rd of rs
            ResultSetMetaData rd = rs.getMetaData();
            // Retrieves the number of columns of rd
            a = rd.getColumnCount();
            // Loads the table
            df = (DefaultTableModel)jTable1.getModel();
            // Sets the number of rows in the model to be 0
            df.setRowCount(0);
            // Finds and returns the next complete token from this scanner 
            while(rs.next()){
                // Create vector class object
                Vector v2 = new Vector();
                // Add itemnumber, date, itemdescription, itemid, supplier, addstock, minus, and balance in the vector with their corresponding indices
                for(int i=1; i<=a; i++){
                    v2.add(rs.getString("itemnumber"));
                    v2.add(rs.getString("date"));
                    v2.add(rs.getString("itemdescription"));
                    v2.add(rs.getString("itemid"));
                    v2.add(rs.getString("supplier"));
                    v2.add(rs.getString("addstock"));
                    v2.add(rs.getString("minus"));
                    v2.add(rs.getString("balance"));
                }
                // Adds the row to the end of the model
                df.addRow(v2);
            }
            // Handles the error
                    } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new inventory().setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtitemdescription;
    private javax.swing.JTextField txtitemid;
    private javax.swing.JTextField txtminus;
    private javax.swing.JTextField txtsupplier;
    // End of variables declaration//GEN-END:variables
}