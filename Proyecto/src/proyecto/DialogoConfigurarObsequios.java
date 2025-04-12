package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConfigurarObsequios extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarObsequios dialog = new DialogoConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarObsequios() {
		setBackground(new Color(195, 207, 221));
		getContentPane().setBackground(new Color(195, 207, 221));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(174, 174, 174));
		panel.setBounds(12, 45, 426, 206);
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel lblUnidad = new JLabel("1 Unidad");
			lblUnidad.setBounds(12, 24, 109, 17);
			panel.add(lblUnidad);
		}
		
		textField = new JTextField();
		textField.setBounds(139, 22, 215, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUnidades = new JLabel("2 a 5 Unidades");
		lblUnidades.setBounds(12, 74, 109, 17);
		panel.add(lblUnidades);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 72, 215, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("a a mas unidades");
		lblNewLabel_2.setBounds(12, 119, 109, 17);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 117, 215, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTitle = DefaultComponentFactory.getInstance().createTitle("Configuracion Obsequios");
		lblTitle.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 13));
		lblTitle.setBounds(12, 12, 225, 21);
		contentPanel.add(lblTitle);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setForeground(new Color(255, 255, 255));
				okButton.setBackground(new Color(88, 11, 12));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setForeground(new Color(255, 255, 255));
				cancelButton.setBackground(new Color(88, 11, 12));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
