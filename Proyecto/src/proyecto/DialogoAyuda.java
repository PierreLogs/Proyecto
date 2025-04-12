package proyecto;

import java.awt.BorderLayout;
//import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Panel;

public class DialogoAyuda extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoAyuda dialog = new DialogoAyuda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoAyuda() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTienda = new JLabel("Version v1.0");
		lblTienda.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 24));
		lblTienda.setForeground(new Color(0, 0, 0));
		lblTienda.setBounds(144, 36, 195, 37);
		contentPanel.add(lblTienda);
		
		JLabel lblWindowTitle = DefaultComponentFactory.getInstance().createTitle("Byte Store");
		lblWindowTitle.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 15));
		lblWindowTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblWindowTitle.setForeground(new Color(139, 0, 0));
		lblWindowTitle.setBounds(12, 12, 120, 27);
		contentPanel.add(lblWindowTitle);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(174, 174, 174));
		panel.setBounds(0, 77, 450, 223);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitle = DefaultComponentFactory.getInstance().createLabel("Grupo");
		lblTitle.setForeground(new Color(88, 11, 12));
		lblTitle.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 15));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(188, 12, 76, 27);
		panel.add(lblTitle);
		
		JLabel lblPartner1 = new JLabel("Gelber Paolo Lozano Huangal ");
		lblPartner1.setForeground(new Color(88, 11, 12));
		lblPartner1.setBounds(142, 51, 181, 17);
		panel.add(lblPartner1);
		
		JLabel lblPartner2 = new JLabel("Katia Katherine de la Torre Lorenzo");
		lblPartner2.setForeground(new Color(88, 11, 12));
		lblPartner2.setBounds(142, 72, 221, 17);
		panel.add(lblPartner2);
		
		JLabel lblPartner3 = new JLabel("Walter Jose Ca\u00F1apata\u00F1a Vargas");
		lblPartner3.setForeground(new Color(88, 11, 12));
		lblPartner3.setBounds(142, 96, 221, 17);
		panel.add(lblPartner3);
		
		JLabel lblPartner4 = new JLabel("Luis Pierre Oscco Lara");
		lblPartner4.setForeground(new Color(88, 11, 12));
		lblPartner4.setBounds(142, 118, 221, 17);
		panel.add(lblPartner4);
		
		JLabel lblPartner5 = new JLabel("Gianfranco Paolo Rebatta Morales");
		lblPartner5.setForeground(new Color(88, 11, 12));
		lblPartner5.setBounds(142, 141, 221, 17);
		panel.add(lblPartner5);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(193, 172, 71, 27);
		panel.add(btnCerrar);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
	}
}
