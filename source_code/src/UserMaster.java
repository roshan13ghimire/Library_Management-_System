
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class UserMaster extends javax.swing.JFrame {
    MainClass mc=new MainClass();
    ResultSet rsuser;
    int rspos=0;
    int rscount=0;
    boolean chadd=false;
    public UserMaster() {
        initComponents();
    }
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        TxtUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CmbUserType = new javax.swing.JComboBox();
        ChkUserActive = new javax.swing.JCheckBox();
        CmdFirst = new javax.swing.JButton();
        CmdPrevious = new javax.swing.JButton();
        CmdNext = new javax.swing.JButton();
        CmdLast = new javax.swing.JButton();
        CmdNew = new javax.swing.JButton();
        CmdEdit = new javax.swing.JButton();
        CmdSave = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();
        LblPosition = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("P2P Library : User Master");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("User Name :");

        TxtUserName.setText("jTextField1");

        jLabel4.setText("Password :");

        TxtPassword.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("P2P Library - User Master");

        jLabel8.setText("User Type :");

        CmbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ChkUserActive.setText("Member Active");

        CmdFirst.setText("Fisrt");
        CmdFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdFirstActionPerformed(evt);
            }
        });

        CmdPrevious.setText("Previous");
        CmdPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdPreviousActionPerformed(evt);
            }
        });

        CmdNext.setText("Next");
        CmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdNextActionPerformed(evt);
            }
        });

        CmdLast.setText("Last");
        CmdLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdLastActionPerformed(evt);
            }
        });

        CmdNew.setText("New");
        CmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdNewActionPerformed(evt);
            }
        });

        CmdEdit.setText("Edit");
        CmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdEditActionPerformed(evt);
            }
        });

        CmdSave.setText("Save");
        CmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSaveActionPerformed(evt);
            }
        });

        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        LblPosition.setText("position");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(495, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ChkUserActive)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmbUserType, 0, 187, Short.MAX_VALUE)
                            .addComponent(TxtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(TxtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                        .addGap(340, 340, 340))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CmdFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdLast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CmdNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdEdit)
                .addGap(6, 6, 6)
                .addComponent(CmdSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdClose)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(LblPosition)
                .addContainerGap(527, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(CmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(ChkUserActive)
                .addGap(61, 61, 61)
                .addComponent(LblPosition)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdFirst)
                    .addComponent(CmdPrevious)
                    .addComponent(CmdNext)
                    .addComponent(CmdLast)
                    .addComponent(CmdEdit)
                    .addComponent(CmdSave)
                    .addComponent(CmdNew)
                    .addComponent(CmdClose))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }

    private void CmdFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdFirstActionPerformed
        try {
            rsuser.first();
            Display();
            
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }

    private void CmdPreviousActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (rsuser.isFirst()==true) {
                JOptionPane.showMessageDialog(null,"Already in first record.");
                return;
                
            }
            
            rsuser.previous();
            Display();
            
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }

    private void CmdNextActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (rsuser.isLast()==true) {
                JOptionPane.showMessageDialog(null,"Already in last record.");
                return;
                
            }
            rsuser.next();
            Display();
            
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }

    private void CmdLastActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            rsuser.last();
            Display();
            
        } catch (Exception e) {
            System.err.println(e);
            
        }
    }

    private void CmdNewActionPerformed(java.awt.event.ActionEvent evt) {
        chadd=true;
        ClearText();
    }

    private void CmdEditActionPerformed(java.awt.event.ActionEvent evt) {
        chadd=false;
    }

    private void CmdSaveActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            
            if (TxtUserName.getText().trim().length()==0 ) {
                JOptionPane.showMessageDialog(null,"Enter user name.");
                return;
            }
            
            if (TxtPassword.getText().trim().length()==0 ) {
                JOptionPane.showMessageDialog(null,"Enter password.");
                return;
            }
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            
            if (chadd==true ) {
                
                rsuser.moveToInsertRow();
                
                rsuser.updateString("user_name",TxtUserName.getText());
                rsuser.updateString("user_password",TxtPassword.getText());
                rsuser.updateString("user_type",CmbUserType.getSelectedItem().toString());
                
                if (ChkUserActive.isSelected()==true) {
                    rsuser.updateString("user_active","YES");
                } else {
                    rsuser.updateString("user_active","NO");
                }
                
                rsuser.insertRow();
                
                rsuser.last();
                Display();
            } else {
                rsuser.updateString("user_password",TxtPassword.getText());
                rsuser.updateString("user_type",CmbUserType.getSelectedItem().toString());
                
                if (ChkUserActive.isSelected()==true) {
                    rsuser.updateString("user_active","YES");
                } else {
                    rsuser.updateString("user_active","NO");
                }
                
                
                
                rsuser.updateRow();
                rsuser.refreshRow();
            }
            
            chadd=false;
            JOptionPane.showMessageDialog(null,"Record updated.");
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Unable to save record.");
            return;
        }
    }

    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {
       
        this.setVisible(false);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
               try
        {
            
            this.setLocationRelativeTo(null);
            
            ClearText();
            CmbUserType.removeAllItems();
            CmbUserType.addItem("Admin");
            CmbUserType.addItem("User");
        
            Connection connection;          
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            ResultSet rs;    
            PreparedStatement stmt
            stmt=connection.prepareStatement("select count(*) from lib_user");
            rs = stmt.executeQuery();
            rs.first();
            rscount=rs.getInt(1);
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery = "select * from lib_user ";
            rsuser = stmt1.executeQuery(sqlQuery);
            rsuser.first();
            Display();         

        }
        catch (Exception e)
        {
            System.err.println(e);
        }
 
    }
    private void Display()
    {
        try
        {
            TxtUserName.setText(rsuser.getString("user_name"));
            TxtPassword.setText(rsuser.getString("user_password"));
            CmbUserType.setSelectedItem(rsuser.getString("user_type"));
            
            if (rsuser.getString("user_active").equals("YES"))
            {
                ChkUserActive.setSelected(true);
            }
            else
            {
                ChkUserActive.setSelected(false);
            }
            
            LblPosition.setText("Record position : " + rsuser.getRow() + "/" + String.valueOf(rscount));
        }
        catch (Exception e)
        {
            System.err.println(e);
            
        }
    }
    
    private void ClearText()
    {
        TxtUserName.setText("");
        TxtPassword.setText("");
        ChkUserActive.setSelected(false);

        
        LblPosition.setText("");
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMaster().setVisible(true);
            }
        });
    }
    private javax.swing.JCheckBox ChkUserActive;
    private javax.swing.JComboBox CmbUserType;
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdEdit;
    private javax.swing.JButton CmdFirst;
    private javax.swing.JButton CmdLast;
    private javax.swing.JButton CmdNew;
    private javax.swing.JButton CmdNext;
    private javax.swing.JButton CmdPrevious;
    private javax.swing.JButton CmdSave;
    private javax.swing.JLabel LblPosition;
    private javax.swing.JTextField TxtPassword;
    private javax.swing.JTextField TxtUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    
}
