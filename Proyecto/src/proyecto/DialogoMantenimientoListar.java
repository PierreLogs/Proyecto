package proyecto;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;

public class DialogoMantenimientoListar extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoMantenimientoListar dialog = new DialogoMantenimientoListar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoMantenimientoListar() {
		setBackground(new Color(174, 174, 174));
		getContentPane().setForeground(new Color(174, 174, 174));
		setTitle("Listar");
		setBounds(100, 100, 466, 321);
		getContentPane().setLayout(null);

		btnListar = new JButton("Listar");
		btnListar.setForeground(new Color(255, 255, 255));
		btnListar.setBackground(new Color(88, 11, 12));
		btnListar.setBounds(131, 283, 89, 23);
		getContentPane().add(btnListar);
		
				btnCerrar = new JButton("Cerrar");
				btnCerrar.setForeground(new Color(255, 255, 255));
				btnCerrar.setBackground(new Color(88, 11, 12));
				btnCerrar.setBounds(232, 283, 89, 23);
				getContentPane().add(btnCerrar);
				
						panel = new JPanel();
						panel.setBounds(133, 283, 188, 23);
						getContentPane().add(panel);
						panel.setLayout(null);
						
								txtS = new JTextArea();
								txtS.setBounds(20, 46, 427, 223);
								getContentPane().add(txtS);
								txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
								
										scrollPane = new JScrollPane();
										scrollPane.setBounds(17, 45, 430, 226);
										getContentPane().add(scrollPane);
										
										JLabel lblTitle = DefaultComponentFactory.getInstance().createTitle("Listado de laptops");
										lblTitle.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 12));
										lblTitle.setBounds(17, 12, 140, 17);
										getContentPane().add(lblTitle);
				btnCerrar.addActionListener(this);
		btnListar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}

	protected void actionPerformedBtnListar(ActionEvent e) {

	}
}
