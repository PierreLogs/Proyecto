package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class DialogoVender extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoVender dialog = new DialogoVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnVender = new JButton("Vender\r\n");
			btnVender.setBounds(318, 29, 89, 23);
			contentPanel.add(btnVender);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(318, 63, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(161, 64, 86, 20);
			contentPanel.add(txtPrecio);
		}
package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DialogoVender extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoVender dialog = new DialogoVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnVender = new JButton("Vender");
			btnVender.setBounds(318, 29, 89, 23);
			btnVender.setForeground(new Color(255, 255, 255));
			btnVender.setBackground(new Color(88, 11, 12));
			contentPanel.add(btnVender);
		}
		{
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.setBounds(318, 63, 89, 23);
			btnCerrar.setForeground(new Color(255, 255, 255));
			btnCerrar.setBackground(new Color(88, 11, 12));
			btnCerrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			contentPanel.add(btnCerrar);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(161, 64, 145, 20);
			txtPrecio.setColumns(10);
			contentPanel.add(txtPrecio);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(161, 95, 145, 20);
			txtCantidad.setColumns(10);
			contentPanel.add(txtCantidad);
		}
		{
			JLabel lblModelo = new JLabel("Modelo\r\n");
			lblModelo.setBounds(29, 33, 114, 14);
			contentPanel.add(lblModelo);
		}
		{
			JLabel lblPrecio = new JLabel("Precio (S/.)");
			lblPrecio.setBounds(29, 67, 114, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblCantidad = new JLabel("Cantidad\r\n");
			lblCantidad.setBounds(29, 98, 114, 14);
			contentPanel.add(lblCantidad);
		}
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 136, 378, 114);
		contentPanel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		comboBox = new JComboBox();
		comboBox.setBounds(161, 29, 145, 22);
		contentPanel.add(comboBox);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(174, 174, 174));
			panel.setBounds(12, 12, 426, 276);
			contentPanel.add(panel);
		}
	}
}
