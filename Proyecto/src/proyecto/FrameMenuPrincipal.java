package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FrameMenuPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuProyecto;
	private JMenu mnArchivo;
	private JMenuItem mnmntmSalir;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmListadodeLaptop;
	private JMenuItem mntmConsultarLaptop;
	private JMenuItem mntmModificarLaptop;
	private JMenuItem mntmPorcentajeDescuento;
	private JMenuItem mntmObsequios;
	private JMenuItem mntmAyuda;
	private JMenuItem mntmVender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMenuPrincipal frame = new FrameMenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameMenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(174, 174, 174));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuProyecto = new JMenuBar();
		menuProyecto.setBounds(0, 0, 450, 22);
		contentPane.add(menuProyecto);
		
		mnArchivo = new JMenu("Archivo");
		menuProyecto.add(mnArchivo);
		
		mnmntmSalir = new JMenuItem("Salir");
		mnmntmSalir.addActionListener(this);
		mnArchivo.add(mnmntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento ");
		menuProyecto.add(mnMantenimiento);
		
		mntmConsultarLaptop = new JMenuItem("Consultar Laptop");
		mntmConsultarLaptop.addActionListener(this);
		mnMantenimiento.add(mntmConsultarLaptop);
		
		mntmModificarLaptop = new JMenuItem("Modificar Laptop\r\n");
		mntmModificarLaptop.addActionListener(this);
		mnMantenimiento.add(mntmModificarLaptop);
		
		mntmListadodeLaptop = new JMenuItem("Listado de Laptop");
		mntmListadodeLaptop.addActionListener(this);
		mnMantenimiento.add(mntmListadodeLaptop);
		
		mnVentas = new JMenu("Ventas");
		menuProyecto.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mnConfiguracion = new JMenu("Configuracion");
		menuProyecto.add(mnConfiguracion);
		
		mntmPorcentajeDescuento = new JMenuItem("Porcentaje de descuento\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
		mntmPorcentajeDescuento.addActionListener(this);
		mnConfiguracion.add(mntmPorcentajeDescuento);
		
		mntmObsequios = new JMenuItem("Obsequios\r\n");
		mntmObsequios.addActionListener(this);
		mnConfiguracion.add(mntmObsequios);
		
		mnAyuda = new JMenu("Ayuda");
		menuProyecto.add(mnAyuda);
		
		mntmAyuda = new JMenuItem("Nosotros\r\n");
		mntmAyuda.addActionListener(this);
		mnAyuda.add(mntmAyuda);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("\u00A1Bienvenido a Bite Store!");
		lblNewJgoodiesTitle.setForeground(new Color(88, 11, 12));
		lblNewJgoodiesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewJgoodiesTitle.setFont(new Font("FiraMono Nerd Font", Font.BOLD, 24));
		lblNewJgoodiesTitle.setBounds(38, 127, 386, 60);
		contentPane.add(lblNewJgoodiesTitle);
		
		JLabel lblSubTitle = new JLabel("Brindamos las mejores ofertas en equipos de computo");
		lblSubTitle.setForeground(new Color(88, 11, 12));
		lblSubTitle.setBackground(new Color(88, 11, 12));
		lblSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubTitle.setBounds(71, 192, 338, 39);
		contentPane.add(lblSubTitle);
		
		JLabel lblNewLabel = new JLabel("V1.0");
		lblNewLabel.setForeground(new Color(88, 11, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(204, 254, 60, 17);
		contentPane.add(lblNewLabel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAyuda) {
			actionPerformedMntmAyuda(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmObsequios) {
			actionPerformedMntmObsequios(e);
		}
		if (e.getSource() == mntmPorcentajeDescuento) {
			actionPerformedMntmPorcentajeDescuento(e);
		}
		if (e.getSource() == mntmModificarLaptop) {
			actionPerformedMntmModificarLaptop(e);
		}
		if (e.getSource() == mntmConsultarLaptop) {
			actionPerformedMntmConsultarLaptop(e);
		}
		if (e.getSource() == mntmListadodeLaptop) {
			actionPerformedMntmListadodeLaptop(e);
		}
		if (e.getSource() == mnmntmSalir) {
			actionPerformedMnmntmSalir(e);
		}
	}
	
	protected void actionPerformedMnmntmSalir(ActionEvent e) {
		System.exit(0);
	}
	
	protected void actionPerformedMntmListadodeLaptop(ActionEvent e) {
		DialogoMantenimientoListar dml = new DialogoMantenimientoListar(); 
		dml.setLocationRelativeTo(this); 
		dml.setVisible(true);
	}
	
	protected void actionPerformedMntmConsultarLaptop(ActionEvent e) {
		DialogoMantenimientoConsultar dmc = new DialogoMantenimientoConsultar(); 
		dmc.setLocationRelativeTo(this); 
		dmc.setVisible(true);
	}
	
	protected void actionPerformedMntmModificarLaptop(ActionEvent e) {
		DialogoMantenimientoModificar dmm = new DialogoMantenimientoModificar(); 
		dmm.setLocationRelativeTo(this); 
		dmm.setVisible(true);
	}
	
	protected void actionPerformedMntmPorcentajeDescuento(ActionEvent e) {
		DialogoConfigurarDescuentos dcd = new DialogoConfigurarDescuentos(); 
		dcd.setLocationRelativeTo(this); 
		dcd.setVisible(true);
	}
	
	protected void actionPerformedMntmObsequios(ActionEvent e) {
		DialogoConfigurarObsequios dco = new DialogoConfigurarObsequios(); 
		dco.setLocationRelativeTo(this); 
		dco.setVisible(true);
	}
	
	protected void actionPerformedMntmVender(ActionEvent e) {
		DialogoVender dv = new DialogoVender(); 
		dv.setLocationRelativeTo(this); 
		dv.setVisible(true);
	}
	protected void actionPerformedMntmAyuda(ActionEvent e) {
		DialogoAyuda da = new DialogoAyuda(); 
		da.setLocationRelativeTo(this); 
		da.setVisible(true);
	}
}
