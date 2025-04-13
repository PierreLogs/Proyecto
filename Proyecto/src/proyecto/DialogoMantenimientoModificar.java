package proyecto;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DialogoMantenimientoModificar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel jpModificar = new JPanel();
	private JLabel lblModelo;
	private JLabel lblProcesador;
	private JLabel lblMemoriaRam;
	private JLabel lblAlmacenamiento;
	private JLabel lblSistemaOperativo;
	private JTextField txtProcesador;
	private JTextField txtModelo;
	private JTextField txtMemoriaRam;
	private JTextField txtAlmacenamiento;
	private JTextField txtSistemaOperativo;
	private JButton btnCerrar;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoMantenimientoModificar dialog = new DialogoMantenimientoModificar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoMantenimientoModificar() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		txtAlmacenamiento.setBackground(new Color(174, 174, 174));
		txtAlmacenamiento.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(txtAlmacenamiento, BorderLayout.CENTER);
		txtAlmacenamiento.setLayout(null);
		
		lblModelo = new JLabel("Modelo\r\n");
		lblModelo.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 12));
		lblModelo.setBounds(22, 42, 135, 14);
		txtAlmacenamiento.add(lblModelo);
		
		lblProcesador = new JLabel("Procesador\r\n");
		lblProcesador.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 12));
		lblProcesador.setBounds(22, 81, 135, 14);
		txtAlmacenamiento.add(lblProcesador);
		
		lblMemoriaRam = new JLabel("Memoria RAM (GB)");
		lblMemoriaRam.setBounds(22, 124, 135, 14);
		txtAlmacenamiento.add(lblMemoriaRam);
		
		lblAlmacenamiento = new JLabel("Almacenamiento (GB)");
		lblAlmacenamiento.setBounds(22, 165, 135, 14);
		txtAlmacenamiento.add(lblAlmacenamiento);
		
		lblSistemaOperativo = new JLabel("Sistema Operativo\r\n\r\n");
		lblSistemaOperativo.setBounds(22, 209, 135, 14);
		txtAlmacenamiento.add(lblSistemaOperativo);
		
		txtProcesador = new JTextField();
		txtProcesador.setColumns(10);
		txtProcesador.setBounds(192, 78, 145, 20);
		txtAlmacenamiento.add(txtProcesador);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(192, 38, 145, 20);
		txtAlmacenamiento.add(txtModelo);
		
		txtMemoriaRam = new JTextField();
		txtMemoriaRam.setColumns(10);
		txtMemoriaRam.setBounds(192, 121, 145, 20);
		txtAlmacenamiento.add(txtMemoriaRam);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(192, 162, 145, 20);
		txtAlmacenamiento.add(txtAlmacenamiento);
		
		txtSistemaOperativo = new JTextField();
		txtSistemaOperativo.setColumns(10);
		txtSistemaOperativo.setBounds(192, 206, 145, 20);
		txtAlmacenamiento.add(txtSistemaOperativo);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBackground(new Color(88, 11, 12));
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(349, 37, 89, 23);
		txtAlmacenamiento.add(btnCerrar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(88, 11, 12));
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(349, 77, 89, 23);
		txtAlmacenamiento.add(btnGuardar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnNewButton_1(e);
		}
	}
protected void actionPerformedBtnNewButton_1(ActionEvent e) {
	
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		dispose();
	}
}
