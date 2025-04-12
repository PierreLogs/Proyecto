package proyecto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConfigurarDescuentos extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textUnidad1;
	private JTextField textUnidad2;
	private JTextField textUnidad3;
	private JTextField textUnidad4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConfigurarDescuentos dialog = new DialogoConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConfigurarDescuentos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(174, 174, 174));
			panel.setBounds(12, 48, 426, 215);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblUnidad1 = new JLabel("1 a 5 unidades");
				lblUnidad1.setBounds(12, 22, 125, 17);
				panel.add(lblUnidad1);
			}
			{
				textUnidad1 = new JTextField();
				textUnidad1.setBounds(155, 20, 215, 21);
				panel.add(textUnidad1);
				textUnidad1.setColumns(10);
			}
			{
				JLabel lblUnidad2 = new JLabel("6 a 10 unidades");
				lblUnidad2.setBounds(12, 70, 125, 17);
				panel.add(lblUnidad2);
			}
			{
				textUnidad2 = new JTextField();
				textUnidad2.setBounds(155, 68, 215, 21);
				panel.add(textUnidad2);
				textUnidad2.setColumns(10);
			}
			{
				JLabel lblUnidad3 = new JLabel("11 a 15 unidades");
				lblUnidad3.setBounds(12, 114, 125, 17);
				panel.add(lblUnidad3);
			}
			{
				textUnidad3 = new JTextField();
				textUnidad3.setBounds(155, 112, 215, 21);
				panel.add(textUnidad3);
				textUnidad3.setColumns(10);
			}
			{
				JLabel lblUnidad4 = new JLabel("Mas de 15 unidades");
				lblUnidad4.setBounds(12, 156, 125, 17);
				panel.add(lblUnidad4);
			}
			{
				textUnidad4 = new JTextField();
				textUnidad4.setBounds(155, 154, 215, 21);
				panel.add(textUnidad4);
				textUnidad4.setColumns(10);
			}
			{
				JLabel lblPercent1 = new JLabel("%");
				lblPercent1.setBounds(388, 22, 18, 17);
				panel.add(lblPercent1);
			}
			{
				JLabel lblPercent2 = new JLabel("%");
				lblPercent2.setBounds(388, 70, 18, 17);
				panel.add(lblPercent2);
			}
			{
				JLabel lblPercent3 = new JLabel("%");
				lblPercent3.setBounds(388, 115, 18, 17);
				panel.add(lblPercent3);
			}
			{
				JLabel lblPercent4 = new JLabel("%");
				lblPercent4.setBounds(388, 155, 18, 17);
				panel.add(lblPercent4);
			}
		}
		
		JLabel lblTitle = DefaultComponentFactory.getInstance().createTitle("Configuracion de porcentaje de descuento");
		lblTitle.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 13));
		lblTitle.setBounds(12, 12, 340, 24);
		contentPanel.add(lblTitle);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setForeground(new Color(255, 255, 255));
				okButton.setBackground(new Color(88, 11, 12));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(new Color(255, 255, 255));
				cancelButton.setBackground(new Color(88, 11, 12));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
