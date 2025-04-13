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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class DialogoMantenimientoConsultar extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblModelo;
	private JLabel lblProcesador;
	private JLabel lblMemoriaRam;
	private JLabel lblAlmacenamiento;
	private JLabel lblSistemaOperativo;
	private JTextField txtProcesador;
	private JTextField txtRAM;
	private JTextField txtHDD;
	private JTextField txtOS;
	private JButton btnCerrar;

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
		
		txtProcesador = new JTextField();
		txtProcesador.setBounds(192, 81, 145, 20);
		contentPanel.add(txtProcesador);
		txtProcesador.setColumns(10);
		
		txtRAM = new JTextField();
		txtRAM.setColumns(10);
		txtRAM.setBounds(192, 124, 145, 20);
		contentPanel.add(txtRAM);
		
		txtHDD = new JTextField();
		txtHDD.setColumns(10);
		txtHDD.setBounds(192, 165, 145, 20);
		contentPanel.add(txtHDD);
		
		txtOS = new JTextField();
		txtOS.setColumns(10);
		txtOS.setBounds(192, 209, 145, 20);
		contentPanel.add(txtOS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setForeground(new Color(255, 255, 255));
		btnCerrar.setBackground(new Color(88, 11, 12));
		btnCerrar.setBounds(349, 41, 89, 23);
		contentPanel.add(btnCerrar);
		
		JComboBox comboModelos = new JComboBox();
		comboModelos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		comboModelos.setBounds(190, 39, 147, 26);
		contentPanel.add(comboModelos);
	}
}
