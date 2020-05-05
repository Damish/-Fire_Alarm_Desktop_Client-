
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import Add.Interface.AddInterface;
import Update.Interface.UpdateInterface2;
import static email.SendEmailSSL.createMail;
import static email.SendEmailSSL.mailActivity;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.mail.Session;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import models.Sensor;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author Damish
 */
public class Add extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Add
     */
    
    public Add() {
        initComponents();
        
        idInput.setVisible(false);
        jLabel4.setVisible(false);
        
        
        timer.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ActionHeading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        Floor = new javax.swing.JTextField();
        Room = new javax.swing.JTextField();
        show_validation_floorNo = new javax.swing.JLabel();
        show_validation_roomNo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoutClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ActionHeading.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ActionHeading.setText("Register Sensor");

        jLabel2.setText("Floor No :");

        jLabel3.setText("Room No :");

        addbtn.setText("Save");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        Floor.setToolTipText("");

        Room.setToolTipText("");

        show_validation_floorNo.setForeground(new java.awt.Color(255, 0, 0));
        show_validation_floorNo.setText(" ");

        show_validation_roomNo.setForeground(new java.awt.Color(255, 0, 51));
        show_validation_roomNo.setText(" ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sid", "Co2", "Smoke", "Floor", "Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(140);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        idInput.setEditable(false);

        jLabel4.setText("Id :");

        btnClear.setText("Clear");
        btnClear.setMaximumSize(new java.awt.Dimension(58, 32));
        btnClear.setMinimumSize(new java.awt.Dimension(58, 32));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        jLabel1.setText("*Select sensor from table to update");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Logged in as Admin");

        logoutClient.setText("Logout");
        logoutClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ActionHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutClient))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Room, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(Floor)
                                            .addComponent(show_validation_floorNo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(show_validation_roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(idInput)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActionHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Floor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(show_validation_floorNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_validation_roomNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean validatefNo = false;
    boolean validaterNo = false;
    boolean validateInputs = false;

    boolean updateMode = false;

    private void inputValidation() {

        try {
            int fNo = Integer.parseInt(Floor.getText());
            show_validation_floorNo.setText(" Floor no is valid ");
            validatefNo = true;
        } catch (NumberFormatException e) {
            validatefNo = false;
            show_validation_floorNo.setText("Floor no should be an integer!!!");
        }
        try {
            int fNo = Integer.parseInt(Room.getText());
            show_validation_roomNo.setText(" Room no is valid ");
            validaterNo = true;
        } catch (NumberFormatException e) {
            validaterNo = false;
            show_validation_roomNo.setText("Room no should be an integer!!!");
        }
        if (validatefNo == true && validaterNo == true) {
            validateInputs = true;
        } else if (validatefNo == false || validaterNo == false) {
            validateInputs = false;
        }
    }

    public ArrayList ListSensors() {

        ArrayList<Sensor> tempList = new ArrayList<>();
        //////////////////////GET Method/////////////////////////
        try {

            URL urlForGetRequest = new URL("http://localhost:8080/SensorData_REST_API/rest/sensors");
            HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
            conection.setRequestProperty("Content-Type", "application/json;");
            conection.setDoOutput(true);
            conection.setDoInput(true);
            conection.setRequestMethod("GET");
            int responseCode = conection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                InputStream in = new BufferedInputStream(conection.getInputStream());

                String result = org.apache.commons.io.IOUtils.toString(in, "UTF-8");

                System.out.println("Result from GET : " + result);

                JSONArray ja1 = new JSONArray(result);

                System.out.println("My Json Array: " + ja1);

                System.out.println("My Json Array Size: " + ja1.length());

                for (int i = 0; i < ja1.length(); i++) {

                    JSONObject myResponse = ja1.getJSONObject(i);

//                    System.out.println("Json Array Element/Json Object:" + i + " Values : \n"
//                            + " sid : " + myResponse.getString("sid")
//                            + " co2 : " + myResponse.getInt("co2Level")
//                            + " smoke : " + myResponse.getInt("smokeLevel")
//                            + " floor : " + myResponse.getInt("floorNo")
//                            + " room : " + myResponse.getInt("roomNo") + "\n");
                    Sensor sensorEntry1 = new Sensor(
                            myResponse.getString("sid"),
                            myResponse.getInt("co2Level"),
                            myResponse.getInt("smokeLevel"),
                            myResponse.getInt("floorNo"),
                            myResponse.getInt("roomNo")
                    );
                    tempList.add(sensorEntry1);

                }

                in.close();
                conection.disconnect();
            } else {
                System.out.println("GET NOT WORKED");
            }
        } catch (Exception e) {
        }
/////////////////////end of GET method////////////////
        return tempList;
    }
    
  
    Timer timer = new Timer(15000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            //create email session object
            Session emailSession = mailActivity();
          
            System.out.println("Timer started 15 sec");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            ArrayList<Sensor> sdata = new ArrayList<>();
            sdata = ListSensors();
            
//            System.out.println("addRowToJTable method called GET Method Data : " + sdata);

            Object rowData[] = new Object[5];

            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            for (int i = 0; i < sdata.size(); i++) {

                rowData[0] = sdata.get(i).id;
                rowData[1] = sdata.get(i).co2Level;
                rowData[2] = sdata.get(i).smokeLevel;
                rowData[3] = sdata.get(i).floor;
                rowData[4] = sdata.get(i).room;

                model.addRow(rowData);

                
                  //send mail using email service
                if(sdata.get(i).co2Level>=5 || sdata.get(i).smokeLevel>=5){
                   
                    createMail( emailSession ,sdata.get(i).id, sdata.get(i).floor,sdata.get(i).room);
                    
//                    JOptionPane.showMessageDialog(null,"Sensor exceeded threshold Level!!!"
//                        + "\n!!!FIRE WARNING!!!"
//                        + "\nSensor id:"+sdata.get(i).id
//                        + "\nFloor:"+sdata.get(i).floor
//                        + "\nRoom:"+sdata.get(i).room
//                        + "\nEmail sent to Management Team"
//                    );
                    
                    
                    
                }
                
                
                
                
                
            }
        }
    });


    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed

//        validateInputs=true;
        if (updateMode == false) {
            //do add code here
            inputValidation();

            boolean Addsuccess = false;
            try {
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
                AddInterface i = (AddInterface) reg.lookup("Add");

                if (validateInputs == true) {

                    Addsuccess = i.AddItem(Integer.parseInt(Floor.getText()), Integer.parseInt(Room.getText()));
                    if (Addsuccess == true) {
                        JOptionPane.showMessageDialog(null, "Add suceess");
                        timer.start();
//                        show_validation_floorNo.setText(" ");
//                        show_validation_roomNo.setText(" ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Add fail");
                    }
                }
            } catch (Exception e) {
                System.out.println("Registering new sensor  Failed!!!");;
            }

        } else {
            //do update code here
            
            idInput.setVisible(true);
            jLabel4.setVisible(true);
            
            inputValidation();
            
            boolean Updatesuccess = false;
            try {
                Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
                UpdateInterface2 i2 = (UpdateInterface2) reg.lookup("Update");

                if (validateInputs == true) {

                    Updatesuccess = i2.UpdateItem(idInput.getText().toString(), Integer.parseInt(Floor.getText()), Integer.parseInt(Room.getText()));
                    if (Updatesuccess == true) {
                        JOptionPane.showMessageDialog(null, "Update success");
//                        show_validation_floorNo.setText(" ");
//                        show_validation_roomNo.setText(" ");
                        timer.start();
                    } else {
                        JOptionPane.showMessageDialog(null, "Update fail");
                    }
                }
            } catch (Exception e) {
                System.out.println("Updating new sensor Failed!!!");
            }

        }


    }//GEN-LAST:event_savebtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        updateMode = true;

        ActionHeading.setText("Update Sensor");

        int selectedRow = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        idInput.setText(model.getValueAt(selectedRow, 0).toString());
        Floor.setText(model.getValueAt(selectedRow, 3).toString());
        Room.setText(model.getValueAt(selectedRow, 4).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Floor.setText("");
        Room.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed

        ActionHeading.setText("Register Sensor");
        idInput.setVisible(false);
        jLabel4.setVisible(false);
        Floor.setText("");
        Room.setText("");
        show_validation_floorNo.setText("");
        show_validation_roomNo.setText("");
        updateMode = false;
        
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void logoutClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutClientActionPerformed

        this.dispose();

        new Login().setVisible(true);

        JOptionPane.showMessageDialog(null,"Logged out succesfully");

    }//GEN-LAST:event_logoutClientActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ActionHeading;
    private javax.swing.JTextField Floor;
    private javax.swing.JTextField Room;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClear;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutClient;
    private javax.swing.JLabel show_validation_floorNo;
    private javax.swing.JLabel show_validation_roomNo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
