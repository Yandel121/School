package library;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class category extends JFrame {
    private JPanel  jPanel2;
    private JLabel jLabel1,jLabel9,jLabel10;
    private JTextField txtcat;
    private JComboBox<String> txtstatus;
    private JButton jButton1,jButton2,jButton3,jButton4;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
public category(){
    initComponents();
    Connect();
    table_update();
}
Connection con;
PreparedStatement pst;

    private void initComponents(){
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        txtcat = new JTextField();
        txtstatus = new JComboBox<>();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel2.setBorder(BorderFactory.createTitledBorder(null,"Category", TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION, new Font("Tahoma",1,14)));
        jLabel9.setText("Category");
        jLabel10.setText("Status");
        txtstatus.setModel(new DefaultComboBoxModel<String>(new String[] {"Active","DeActive"}));
        jButton1.setText("Add");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setText("Edit");
        jButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.setText("Delete");
        jButton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                jButton3ActionPerformed(evt);
            }
        });
        jTable1.setModel(new DefaultTableModel(
                new Object [] [] {
                },
                new String [] {
                        "Id","Category","Status"
                }
        ){
            Class[] types = new Class []{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            public class getColumnClass(int columnIndex){
                return types[columnIndex];
            }
        });
        jTable1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new Color(255,255,255));
        jTable1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                jTable1MouseClicked(evt);

            }
        });
        jScrollPane1.setViewportView(jTable1);
        jButton4.setText("Cancel");
        jButton4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                jButton4ActionPerformed(evt);
            }
        });
       GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
       jPanel2.setLayout(jPanel2Layout);
       jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                       .addGroup(jPanel2Layout.createSequentialGroup()
                               .addGap(26,26,26)
                               .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                       .addGroup(jPanel2Layout.createSequentialGroup()
                                       .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                               .addComponent(jLabel9)
                                               .addComponent(jLabel10))
                                               .addGap(35,35,35)
                                               .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                       .addComponent(txtstatus, GroupLayout.PREFERRED_SIZE, 153,GroupLayout.PREFERRED_SIZE)))

       )

    }
}
