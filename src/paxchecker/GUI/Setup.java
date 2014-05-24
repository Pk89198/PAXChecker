/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paxchecker.GUI;

import paxchecker.*;

/**
 *
 * @author SunnyBat
 */
public class Setup extends javax.swing.JFrame {

  /** Creates new form Setup */
  public Setup() {
    initComponents();
    customComponents();
  }

  private void customComponents() {
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTabbedPane1 = new javax.swing.JTabbedPane();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jPasswordField1 = new javax.swing.JPasswordField();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jTextField2 = new javax.swing.JTextField();
    jComboBox1 = new javax.swing.JComboBox();
    jLabel6 = new javax.swing.JLabel();
    jSlider1 = new javax.swing.JSlider();
    jButton1 = new javax.swing.JButton();
    jCheckBox1 = new javax.swing.JCheckBox();
    jCheckBox2 = new javax.swing.JCheckBox();
    jCheckBox3 = new javax.swing.JCheckBox();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane3 = new javax.swing.JScrollPane();
    jTextArea3 = new javax.swing.JTextArea();
    jPanel4 = new javax.swing.JPanel();
    jScrollPane4 = new javax.swing.JScrollPane();
    jTextArea4 = new javax.swing.JTextArea();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTextArea2 = new javax.swing.JTextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("PAX Checker Setup");
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("PAX Checker Setup");

    jLabel2.setText("Username");

    jTextField1.setToolTipText("<html>\nPlease note that the only email addresses currently<br>\nsupported are Yahoo! and GMail. Put your full email<br>\naddres in, otherwise it defaults to @yahoo.com.\n</html>");

    jLabel3.setText("Password");

    jLabel4.setText("Cell Num");

    jTextField2.setToolTipText("<html>\nSpecify the number you want to receive texts at.<br>\nONLY use numbers - no dashes, no spaces, no ().<br>\nIf you use a different carrier, you may find their<br>\ntexting email address extension and put it onto<br>\nthe end of your number.<br>\nExample: 1234567890@car.rier.net\n</html>");

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AT&T", "Verizon", "Sprint", "T-Mobile", "U.S. Cellular", "[Other]" }));

    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("Seconds Between Website Update");

    jSlider1.setMajorTickSpacing(10);
    jSlider1.setMaximum(60);
    jSlider1.setMinimum(5);
    jSlider1.setMinorTickSpacing(2);
    jSlider1.setPaintLabels(true);
    jSlider1.setPaintTicks(true);
    jSlider1.setPaintTrack(false);
    jSlider1.setValue(10);

    jButton1.setText("START!");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jCheckBox1.setSelected(true);
    jCheckBox1.setText("Scan PAX Registration website");
    jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox1ActionPerformed(evt);
      }
    });

    jCheckBox2.setSelected(true);
    jCheckBox2.setText("Scan Showclix website");
    jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCheckBox2ActionPerformed(evt);
      }
    });

    jCheckBox3.setSelected(true);
    jCheckBox3.setText("Play Sound when Updated");
    jCheckBox3.setToolTipText("<html>\nIf checked, the program will play a sound when an update to<br>\nthe PAX Prime website OR the Showclix website (whichever one(s)<br>\nyou have enabled) is found.\n</html>");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
          .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCheckBox3)
              .addComponent(jCheckBox2)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                  .addComponent(jTextField1)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jTextField2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addComponent(jCheckBox1))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jCheckBox1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jCheckBox2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jCheckBox3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel6)
        .addGap(0, 0, 0)
        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton1)
        .addContainerGap())
    );

    jTabbedPane1.addTab("Setup", jPanel1);

    jTextArea3.setEditable(false);
    jTextArea3.setColumns(20);
    jTextArea3.setLineWrap(true);
    jTextArea3.setRows(5);
    jTextArea3.setText("========================================\nIMPORTANT: Do NOT rely on only one way of checking for PAX ticket sales. Get Twitter notifications. Watch the Reddit live thread. Ask friends to watch for tickets. Do not bank on one method to work!\n========================================\n->To receive text messages, you must specify the GMail or Yahoo email and password you want to use as well as the phone number and carrier (or @car.rier.ext at the end of the email). If you don't, you will be unable to receive texts.\n->The cell number is the number that is texted when tickets go on sale. The format is 1234567890 -- no 1 in front, no dashes, no perentheses. Just your area code and phone number. You must specify your carrier using the dropdown box. If your carrier is not there, go to emailtextmessages.com and find it.\n->To specify multiple phone numbers, separate each number by a ; (semicolon) and put the email ending for every phone number -- including Verizon, Sprint, etc. -- for each number.\n=>For example: 1234567890@mms.att.net;2345678901@vtext.net;3456789012@cwemail.com\n=>Note that you are allowed to put spaces between each number:\n1234567890@mms.att.net; 2345678901@vtext.net\n=>Also note that the selected carrier will be the default extension. So, if you select AT&T, all numbers without an extension (@car.rier.net) will have AT&T's extension put onto them.");
    jTextArea3.setWrapStyleWord(true);
    jScrollPane3.setViewportView(jTextArea3);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Instructions", jPanel2);

    jTextArea4.setEditable(false);
    jTextArea4.setColumns(20);
    jTextArea4.setLineWrap(true);
    jTextArea4.setRows(5);
    jTextArea4.setText("~~~1.0.1~~~\n->Fixed issue with program not ending when all windows were closed\n->Added default carrier to multiple number list -- if no @car.rier.ext is specified for a number, the option selected is used\n->\n\n~~~1.0.0~~~\n->Fixed issue sending email when website update was found while using multiple email addresses\n->Fixed issue with playing multiple alarm sounds at the same time\n->Various minor bugfixes (see Github repo)\n\n~~~Pre-versioning~~~\n->Added alarm to program (significant program size increase... Darn WAV files)\n-->Can choose to enable or disable the alarm\n->Added option to check Showclix website for updates and choose whether to check the PAX website, Showclix website, or both\n->Added \"Recent Changes\" section\n->Added tooltips to the program\n->Made program updater display update size before downloading update\n->Made program updater display current update progress\n->Made program select Showclix website monitoring and play sound when update found by default");
    jTextArea4.setWrapStyleWord(true);
    jScrollPane4.setViewportView(jTextArea4);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Recent Changes", jPanel4);

    jTextArea2.setEditable(false);
    jTextArea2.setColumns(20);
    jTextArea2.setLineWrap(true);
    jTextArea2.setRows(5);
    jTextArea2.setText("->Program created by Sunny Bat -- Sunnybat@yahoo.com\n->Credit to /u/GrahamArthurBlair for the Showclix website checker code -- it was basically copy+pasted into this program.\n->To the awesome Guilder of Reddit Gold: You singlehandedly inspired me to update the program with Showclix monitoring and sound alerts.\n->Link to Github repository for source code:\nhttps://github.com/SunnyBat/PAXChecker");
    jTextArea2.setWrapStyleWord(true);
    jScrollPane2.setViewportView(jTextArea2);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Extra", jPanel3);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jTabbedPane1)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
    // TODO add your handling code here:
    if (!jCheckBox1.isSelected() && !jCheckBox2.isSelected()) {
      jButton1.setEnabled(false);
    } else {
      jButton1.setEnabled(true);
    }
  }//GEN-LAST:event_jCheckBox2ActionPerformed

  private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
    // TODO add your handling code here:
    if (!jCheckBox1.isSelected() && !jCheckBox2.isSelected()) {
      jButton1.setEnabled(false);
    } else {
      jButton1.setEnabled(true);
    }
  }//GEN-LAST:event_jCheckBox1ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    if (jCheckBox1.isSelected()) {
      Browser.enablePaxWebsiteChecking();
    } else {
      if (!jCheckBox2.isSelected()) {
        return;
      }
    }
    if (jCheckBox2.isSelected()) {
      Browser.enableShowclixWebsiteChecking();
    }
    PAXChecker.setPlayAlarm(jCheckBox3.isSelected());
    Email.setUsername(jTextField1.getText());
    Email.setPassword(new String(jPasswordField1.getPassword()));
    String text = jTextField2.getText();
    if (text.contains(";")) {
      Email.setCellList(text);
    } else if (text.length() > 4) {
      Email.setCellNum(text, jComboBox1.getSelectedItem().toString());
    }
    PAXChecker.setRefreshTime(jSlider1.getValue());
    this.dispose();
  }//GEN-LAST:event_jButton1ActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JCheckBox jCheckBox3;
  private javax.swing.JComboBox jComboBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPasswordField jPasswordField1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JSlider jSlider1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTextArea jTextArea2;
  private javax.swing.JTextArea jTextArea3;
  private javax.swing.JTextArea jTextArea4;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField2;
  // End of variables declaration//GEN-END:variables
}
