/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgate.detection_rec.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.itgate.detection_rec.db.Connexion;

/**
 *
 * @author TOSHIBA
 */
public class ModifierCompte extends javax.swing.JFrame {

	/**
	 * Creates new form AjouterCompte
	 */
	protected TimerThread timerThread;

	public ModifierCompte() {
		initComponents();

		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout());
		JStatusBar statusBar = new JStatusBar();
		JLabel leftLabel = new JLabel("Application en cours....");
		statusBar.setLeftComponent(leftLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setHorizontalAlignment(JLabel.CENTER);
		statusBar.addRightComponent(dateLabel);

		final JLabel timeLabel = new JLabel();
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		statusBar.addRightComponent(timeLabel);

		contentPane.add(statusBar, BorderLayout.SOUTH);
		timerThread = new TimerThread(dateLabel, timeLabel);
		timerThread.start();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		txtDatePickerNaissance.setFormats(dateFormat);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		fileChooser = new javax.swing.JFileChooser();
		Nom = new javax.swing.JLabel();
		Prenom = new javax.swing.JLabel();
		image = new javax.swing.JLabel();
		naissance = new javax.swing.JLabel();
		txtPrenom = new javax.swing.JTextField();
		txtCode = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		btnSave = new javax.swing.JButton();
		btnAnnuler = new javax.swing.JButton();
		btnImage = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		txtNom = new javax.swing.JTextField();
		txtDatePickerNaissance = new org.jdesktop.swingx.JXDatePicker();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		txtGSM = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		jLabelID = new javax.swing.JLabel();
		txtID = new javax.swing.JTextField();

		Nom.setText("Nom:(*)");

		Prenom.setText("Pr�nom:(*)");

		image.setText("Code:(*)");
		image.setMaximumSize(new java.awt.Dimension(106, 14));
		image.setMinimumSize(new java.awt.Dimension(106, 14));

		naissance.setText("Date de naissance:(*)");

		jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
		jLabel1.setText("Modifier un compte");

		btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/save.png"))); // NOI18N
		btnSave.setText("Enregistrer");
		btnSave.setActionCommand("Modifier");
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});

		btnAnnuler.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/X.png"))); // NOI18N
		btnAnnuler.setText("Annuler");
		btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAnnulerActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(btnSave)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnAnnuler)
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(btnSave)
														.addComponent(
																btnAnnuler))
										.addGap(19, 19, 19)));

		btnImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Camera-Nexus-icon.png"))); // NOI18N
		btnImage.setText("Choisir une image");
		btnImage.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnImageActionPerformed(evt);
			}
		});

		jLabel2.setForeground(new java.awt.Color(255, 0, 0));
		jLabel2.setText("(*):sont des champs obligatoirs");

		jLabel3.setText("GSM:(*)");

		jLabel4.setText("Emai:(*)l");

		jLabelID.setText("ID:");
		jLabelID.setEnabled(false);

		txtID.setEnabled(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel2)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(0,
																		0,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addComponent(
																						jPanel1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						btnImage,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						200,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						Prenom,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						86,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						naissance)
																				.addComponent(
																						image,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						77,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						jLabel4))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						txtID,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						200,
																						Short.MAX_VALUE)
																				.addComponent(
																						txtGSM)
																				.addComponent(
																						txtDatePickerNaissance,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						200,
																						Short.MAX_VALUE)
																				.addComponent(
																						txtCode)
																				.addComponent(
																						txtPrenom)
																				.addComponent(
																						txtNom)
																				.addComponent(
																						txtEmail))))
								.addGap(30, 30, 30))
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		Nom,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addGap(204,
																		204,
																		204))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		jLabelID)
																.addGap(71,
																		329,
																		Short.MAX_VALUE))))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										209,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(70, 70, 70)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabelID)
												.addComponent(
														txtID,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														txtNom,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Nom))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(Prenom)
												.addComponent(
														txtPrenom,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														image,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														txtCode,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(naissance)
												.addComponent(
														txtDatePickerNaissance,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														txtGSM,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(
														txtEmail,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(btnImage,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										51,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel2).addGap(25, 25, 25)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	public String checkFile(String imageName) {
		String temp = new String(imageName);
		temp.toLowerCase();
		if (temp.endsWith(".png")) {
			return "PNG";
		}
		if (temp.endsWith(".gif")) {
			return "GIF";
		}
		if (temp.endsWith(".jpeg")) {
			return "JPEG";
		}
		if (temp.endsWith(".jpg")) {
			return "JPG";
		}
		return "null";
	}

	private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveActionPerformed
		Connection cn = Connexion.getConnection();
		String id = txtID.getText();
		String nom = txtNom.getText();
		String prenom = txtPrenom.getText();
		String code = txtCode.getText();
		String dateText = txtDatePickerNaissance.getDate().toString();
		Date dateNaissance = txtDatePickerNaissance.getDate();
		String tel = txtGSM.getText();
		String email = txtEmail.getText();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.format(dateNaissance);
		if ((nom.compareTo("") != 0) && (prenom.compareTo("") != 0)
				&& (code.compareTo("") != 0) && (dateText.compareTo("") != 0)) {

			String req = "UPDATE etudiant SET " + "nom= '" + nom + "'"
					+ ",prenom='" + prenom + "'" + ",dateNaissance='"
					+ dateFormat.format(dateNaissance) + "'" + ",code='" + code
					+ "'" + ",email='" + email + "'" + ",tel='" + tel + "'"
					+ " WHERE id ='" + id + "';";

			System.out.println(req);
			try {
				cn.createStatement().executeUpdate(req);

				JOptionPane.showMessageDialog(null,
						"L'étudiant a été mis à jour correctement.",
						"Validation", JOptionPane.DEFAULT_OPTION);

//				DefaultTableModel dtm = (DefaultTableModel) jTableCompte
//						.getModel();
//				int ligneSelectionne = jTableCompte.getSelectedRow();
//
//				dtm.setValueAt(nom, ligneSelectionne, 1);
//				dtm.setValueAt(prenom, ligneSelectionne, 2);
//				dtm.setValueAt(dateNaissance, ligneSelectionne, 3);
//				dtm.setValueAt(code, ligneSelectionne, 4);
//				dtm.setValueAt(email, ligneSelectionne, 5);
//				dtm.setValueAt(tel, ligneSelectionne, 6);

				//dtm.fireTableDataChanged();

				this.dispose();
			} catch (SQLException ex) {
				Logger.getLogger(ModifierCompte.class.getName()).log(
						Level.SEVERE, null, ex);
				JOptionPane.showMessageDialog(null,
						"Problème d'accès à la base de donnée", "Erreur",
						JOptionPane.WARNING_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Verifier que les champs son bien rensegné", "Erreur",
					JOptionPane.ERROR_MESSAGE);

		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ModifierCompte.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);

		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ModifierCompte.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);

		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ModifierCompte.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);

		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ModifierCompte.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				ModifierCompte f = new ModifierCompte();
				f.setVisible(true);
			}
		});

	}// GEN-LAST:event_btnSaveActionPerformed

	private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAnnulerActionPerformed
		this.dispose();
		// TODO add your handling code here:
	}// GEN-LAST:event_btnAnnulerActionPerformed

	private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnImageActionPerformed
		// TODO add your handling code here:
		Image img = null;

		int returnVal = fileChooser.showOpenDialog(this);
		BufferedImage image = null;
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				if (checkFile(file.getName()).compareTo("null") == 0) {
					JOptionPane.showMessageDialog(null,
							"Selectionnez une image", "Erreur",
							JOptionPane.ERROR_MESSAGE);
				} else {
					image = ImageIO.read(file);
					// What to do with the file, e.g. display it in a TextArea
					String currentId = txtID.getText();
					ImageIO.write(image, "png", new File("D:\\img_etudiant\\"
							+ currentId + ".png"));

					System.out.println("" + file.getAbsolutePath());
				}
			} catch (IOException ex) {
				System.out.println("problem accessing file"
						+ file.getAbsolutePath());
			}
		} else {
			System.out.println("File access cancelled by user.");
		}
	}// GEN-LAST:event_btnImageActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel Nom;
	private javax.swing.JLabel Prenom;
	private javax.swing.JButton btnAnnuler;
	private javax.swing.JButton btnImage;
	private javax.swing.JButton btnSave;
	private javax.swing.JFileChooser fileChooser;
	private javax.swing.JLabel image;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabelID;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel naissance;
	public javax.swing.JTextField txtCode;
	public org.jdesktop.swingx.JXDatePicker txtDatePickerNaissance;
	public javax.swing.JTextField txtEmail;
	public javax.swing.JTextField txtGSM;
	public javax.swing.JTextField txtID;
	public javax.swing.JTextField txtNom;
	public javax.swing.JTextField txtPrenom;
	// End of variables declaration//GEN-END:variables
}