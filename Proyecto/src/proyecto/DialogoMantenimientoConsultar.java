package proyecto;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoMantenimientoConsultar extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblProcesador;
	private JLabel lblMemoriaRam;
	private JLabel lblAlmacenamiento;
	private JLabel lblSistemaOperativo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoMantenimientoConsultar dialog = new DialogoMantenimientoConsultar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoMantenimientoConsultar() {
		setTitle("Consultar laptop\r\n");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(174, 174, 174));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo\r\n");
		lblModelo.setFont(new Font("Dialog", Font.BOLD, 12));
		lblModelo.setBounds(24, 45, 106, 14);
		contentPanel.add(lblModelo);
		
		lblProcesador = new JLabel("Procesador\r\n");
		lblProcesador.setFont(new Font("Dialog", Font.BOLD, 12));
		lblProcesador.setBounds(24, 84, 106, 14);
		contentPanel.add(lblProcesador);
		
		lblMemoriaRam = new JLabel("Memoria RAM (GB)");
		lblMemoriaRam.setBounds(24, 127, 117, 14);
		contentPanel.add(lblMemoriaRam);
		
		lblAlmacenamiento = new JLabel("Almacenamiento (GB)");
		lblAlmacenamiento.setBounds(24, 168, 137, 14);
		contentPanel.add(lblAlmacenamiento);
		
		lblSistemaOperativo = new JLabel("Sistema Operativo\r\n\r\n");
		lblSistemaOperativo.setBounds(24, 212, 117, 14);
		contentPanel.add(lblSistemaOperativo);
		
		textField = new JTextField();
		textField.setBounds(192, 81, 145, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 42, 145, 20);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(192, 124, 145, 20);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(192, 165, 145, 20);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(192, 209, 145, 20);
		contentPanel.add(textField_4);
		
		btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(88, 11, 12));
		btnNewButton.setBounds(349, 41, 89, 23);
		contentPanel.add(btnNewButton);
	}
}
