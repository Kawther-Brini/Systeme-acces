package com.itgate.detection_rec.view;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 *
 * @author TOSHIBA
 */
public class PanelCamera extends javax.swing.JPanel {

	protected TimerThread timerThread;

	public PanelCamera() {
		initComponents();

		JStatusBar statusBar = new JStatusBar();
		JLabel leftLabel = new JLabel("Your application is running.");
		statusBar.setLeftComponent(leftLabel);

		final JLabel dateLabel = new JLabel();
		dateLabel.setHorizontalAlignment(JLabel.CENTER);
		statusBar.addRightComponent(dateLabel);

		final JLabel timeLabel = new JLabel();
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		statusBar.addRightComponent(timeLabel);

		timerThread = new TimerThread(dateLabel, timeLabel);
		timerThread.start();
		statusBar.setVisible(true);
		this.setSize(900, 760);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		btnCapture = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		btnStop = new javax.swing.JButton();
		btnActiver = new javax.swing.JToggleButton();

		setBackground(new java.awt.Color(204, 204, 255));
		//setLayout(new Absolut);

		btnCapture.setBackground(new java.awt.Color(204, 204, 255));
		btnCapture.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Camera-Nexus-icon.png"))); // NOI18N
		btnCapture.setText("Capturer");
		btnCapture.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCaptureActionPerformed(evt);
			}
		});
		add(btnCapture, new AbsoluteConstraints(110,
				410, -1, -1));

		jPanel1.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 388,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 278,
				Short.MAX_VALUE));

		add(jPanel1, new AbsoluteConstraints(10, 106,
				390, 280));

		jPanel2.setBackground(new java.awt.Color(204, 204, 255));

		btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Stop-Normal-Red-icon.png"))); // NOI18N
		btnStop.setText("Désactiver");

		btnActiver.setBackground(new java.awt.Color(102, 255, 204));
		btnActiver.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Actions-player-play-icon.png"))); // NOI18N
		btnActiver.setText("Activer");
		btnActiver.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnActiverActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												btnActiver,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												333, Short.MAX_VALUE)
										.addComponent(
												btnStop,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(27, 27, 27)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(31, 31, 31)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																btnActiver,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																32,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																btnStop,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																32,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(37, Short.MAX_VALUE)));

		add(jPanel2, new AbsoluteConstraints(10, 0,
				610, -1));
	}// </editor-fold>//GEN-END:initComponents

	private void btnActiverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnActiverActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnActiverActionPerformed

	private void btnCaptureActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCaptureActionPerformed
		// TODO add your handling code here:
		Date d = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		dateFormat.format(d);

		// File directory = new
		// File("D:\\img_etudiant\\image\\"+dateFormat.format(d));
		// try {
		// getAllImages(directory, false);
		// captureImage();
		// } catch (IOException ex) {
		// System.out.println("view.PanelCamera.btnCaptureActionPerformed()");
		// captureImage();
		// }

		String strDirectoy = "D:\\img_etudiant\\image\\" + dateFormat.format(d);
		System.out.println(strDirectoy);
		try {

			// Create one directory
			boolean success = (new File(strDirectoy)).mkdir();
			captureImage(strDirectoy);

		} catch (Exception e) {// Catch exception if any
			JOptionPane.showConfirmDialog(null,
					"Impossible de prendre une capture d'image", "Erreur",
					JOptionPane.OK_OPTION);

		}

	}// GEN-LAST:event_btnCaptureActionPerformed

	public void captureImage(String path) {
		OutputStream out = null;
		try {
			BufferedImage shot = (new Robot())
					.createScreenCapture(new Rectangle(200, 200, 400, 250));
			Date d = new Date();
			SimpleDateFormat timeFormat = new SimpleDateFormat("hh-mm-ss");
			System.out.println(path + timeFormat.format(d) + ".jpg");
			out = new BufferedOutputStream(new FileOutputStream(path + "\\"
					+ timeFormat.format(d) + ".jpg"));
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			encoder.encode(shot);
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				// System.exit(0);
			} catch (Throwable t) {
			}
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JToggleButton btnActiver;
	private javax.swing.JButton btnCapture;
	private javax.swing.JButton btnStop;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	// End of variables declaration//GEN-END:variables
}
