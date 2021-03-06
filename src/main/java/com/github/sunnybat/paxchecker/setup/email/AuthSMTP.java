/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sunnybat.paxchecker.setup.email;

import com.github.sunnybat.commoncode.email.account.SmtpAccount;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.ExecutionException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingWorker;

/**
 *
 * @author SunnyBat
 */
public class AuthSMTP extends javax.swing.JPanel implements AuthEmail {

	private SmtpAccount emailAccount;
	private Runnable authCallback;
	private String savedUsername;
	private String savedPassword;

	/**
	 * Creates new form AuthSMTP
	 */
	public AuthSMTP(Runnable authCallback) {
		this.authCallback = authCallback;
		initComponents();
	}

	@Override
	public void recordCurrentFields() {
		savedUsername = JTFUsername.getText();
		savedPassword = new String(JPFPassword.getPassword());
	}

	@Override
	public void resetChanges() {
		JTFUsername.setText(savedUsername);
		JPFPassword.setText(savedPassword);
	}

	@Override
	public boolean isAuthenticated() {
		return emailAccount != null;
	}

	@Override
	public SmtpAccount getEmailAccount() {
		return emailAccount;
	}

	public void setEmailAddress(String address) {
		JTFUsername.setText(address);
		savedUsername = address;
	}

	private void authenticate() {
		try {
			SmtpAccount account = new SmtpAccount(JTFUsername.getText(), new String(JPFPassword.getPassword()));
			JLUsername.setEnabled(false);
			JLPassword.setEnabled(false);
			JTFUsername.setEnabled(false);
			JPFPassword.setEnabled(false);
			JBAuthenticate.setEnabled(false);
			authCallback.run();
			JLAuthStatus.setText("<Authenticating>");
			AuthenticationWorker authWorker = new AuthenticationWorker(account);
			authWorker.execute();
		} catch (IllegalArgumentException iae) {
			JLAuthStatus.setText(iae.getMessage());
		}
	}

	private void removeAuthStatusIfNecessary(KeyEvent event) {
		if (!event.isActionKey() && event.getKeyCode() != KeyEvent.VK_ALT && event.getKeyCode() != KeyEvent.VK_CONTROL && event.getKeyCode() != KeyEvent.VK_SHIFT && isAuthenticated()) {
			JLAuthStatus.setText("<Not Attempted>");
			emailAccount = null;
			JBAuthenticate.setEnabled(true);
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLUsername = new JLabel();
        JLPassword = new JLabel();
        JTFUsername = new JTextField();
        JPFPassword = new JPasswordField();
        JBAuthenticate = new JButton();
        jLabel3 = new JLabel();
        JLAuthStatus = new JLabel();

        JLUsername.setText("Username");

        JLPassword.setText("Password");

        JTFUsername.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                JTFUsernameKeyPressed(evt);
            }
        });

        JPFPassword.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                JPFPasswordKeyPressed(evt);
            }
        });

        JBAuthenticate.setText("Authenticate");
        JBAuthenticate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JBAuthenticateActionPerformed(evt);
            }
        });

        jLabel3.setText("Authentication Status:");

        JLAuthStatus.setText("<Not Attempted>");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(JBAuthenticate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(JLUsername)
                            .addComponent(JLPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(JPFPassword, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(JTFUsername)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JLAuthStatus)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JLAuthStatus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JLUsername)
                    .addComponent(JTFUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPassword)
                    .addComponent(JPFPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(JBAuthenticate)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBAuthenticateActionPerformed(ActionEvent evt) {//GEN-FIRST:event_JBAuthenticateActionPerformed
			authenticate();
    }//GEN-LAST:event_JBAuthenticateActionPerformed

    private void JTFUsernameKeyPressed(KeyEvent evt) {//GEN-FIRST:event_JTFUsernameKeyPressed
			if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
				if (JPFPassword.getPassword().length == 0) {
					JPFPassword.requestFocus();
				} else {
					authenticate();
				}
			} else {
				removeAuthStatusIfNecessary(evt);
			}
    }//GEN-LAST:event_JTFUsernameKeyPressed

    private void JPFPasswordKeyPressed(KeyEvent evt) {//GEN-FIRST:event_JPFPasswordKeyPressed
			if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
				if (JTFUsername.getText().isEmpty()) {
					JTFUsername.requestFocus();
				} else {
					authenticate();
				}
			} else {
				removeAuthStatusIfNecessary(evt);
			}
    }//GEN-LAST:event_JPFPasswordKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton JBAuthenticate;
    private JLabel JLAuthStatus;
    private JLabel JLPassword;
    private JLabel JLUsername;
    private JPasswordField JPFPassword;
    private JTextField JTFUsername;
    private JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

	private class AuthenticationWorker extends SwingWorker<Boolean, Integer> {

		private SmtpAccount toCheck;

		public AuthenticationWorker(SmtpAccount toCheck) {
			this.toCheck = toCheck;
		}

		@Override
		protected Boolean doInBackground() throws Exception {
			return toCheck.checkAuthentication();
		}

		@Override
		protected void done() {
			try {
				if (this.get()) {
					JLAuthStatus.setText("Success");
					emailAccount = toCheck;
				} else {
					JLAuthStatus.setText("Failed");
					JBAuthenticate.setEnabled(true);
					emailAccount = null;
				}
				JLUsername.setEnabled(true);
				JLPassword.setEnabled(true);
				JTFUsername.setEnabled(true);
				JPFPassword.setEnabled(true);
			} catch (InterruptedException | ExecutionException e) {
			}
			authCallback.run();
		}
	}

}
