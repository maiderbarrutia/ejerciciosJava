package interfazGraficaUsuario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class Cartelera extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frameCartelera;
	 private JLabel labelImagen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cartelera frame = new Cartelera();
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
	public Cartelera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 400);
		frameCartelera = new JPanel();
		frameCartelera.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(frameCartelera);
		frameCartelera.setLayout(null);
		
		JLabel labelPregunta = new JLabel("¿Que te apetece ver hoy?");
		labelPregunta.setBounds(37, 143, 265, 26);
		labelPregunta.setForeground(new Color(0, 0, 255));
		labelPregunta.setFont(new Font("Arial", Font.BOLD, 22));
		frameCartelera.add(labelPregunta);
		
		JRadioButton rdbtnRomantica = new JRadioButton("Romántica");
		rdbtnRomantica.setFont(new Font("Consolas", Font.ITALIC, 21));
		rdbtnRomantica.setBounds(364, 40, 133, 33);
		frameCartelera.add(rdbtnRomantica);
		
		JRadioButton rdbtnTerror = new JRadioButton("Terror");
		rdbtnTerror.setFont(new Font("Consolas", Font.ITALIC, 21));
		rdbtnTerror.setBounds(364, 106, 97, 33);
		frameCartelera.add(rdbtnTerror);
		
		JRadioButton rdbtnMisterio = new JRadioButton("Misterio");
		rdbtnMisterio.setFont(new Font("Consolas", Font.ITALIC, 21));
		rdbtnMisterio.setBounds(364, 172, 121, 33);
		frameCartelera.add(rdbtnMisterio);
		
		JRadioButton rdbtnComedia = new JRadioButton("Comedia");
		rdbtnComedia.setFont(new Font("Consolas", Font.ITALIC, 21));
		rdbtnComedia.setBounds(364, 238, 109, 33);
		frameCartelera.add(rdbtnComedia);
		
		JRadioButton rdbtnAccion = new JRadioButton("Acción");
		rdbtnAccion.setFont(new Font("Consolas", Font.ITALIC, 21));
		rdbtnAccion.setBounds(364, 304, 97, 33);
		frameCartelera.add(rdbtnAccion);
		
		ButtonGroup bgGeneroPelis = new ButtonGroup();
		bgGeneroPelis.add(rdbtnRomantica);
		bgGeneroPelis.add(rdbtnTerror);
		bgGeneroPelis.add(rdbtnMisterio);
		bgGeneroPelis.add(rdbtnComedia);
		bgGeneroPelis.add(rdbtnAccion);
		
		JLabel labelImagen = new JLabel("");
		labelImagen.setBounds(628, 40, 237, 297);
		frameCartelera.add(labelImagen);
		
		//Forma 1 para hacerlo:
//		rdbtnAccion.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ImageIcon imagen = new ImageIcon("images/accion.jpg");
//				labelImagen.setIcon(imagen);
//			}
//		});
		
		//Forma 2
		
//		ActionListener actionListener = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(e.getSource() == rdbtnRomantica) {
//					ImageIcon imagen = new ImageIcon("images/romantica.jpg");
//					labelImagen.setIcon(imagen);
//				}
//				else if(e.getSource() == rdbtnTerror) {
//					ImageIcon imagen = new ImageIcon("images/terror.jpg");
//					labelImagen.setIcon(imagen);
//				}
//				else if(e.getSource() == rdbtnMisterio) {
//					ImageIcon imagen = new ImageIcon("images/misterio.jpg");
//					labelImagen.setIcon(imagen);
//				}
//				else if(e.getSource() == rdbtnComedia) {
//					ImageIcon imagen = new ImageIcon("images/comedia.jpg");
//					labelImagen.setIcon(imagen);
//				}
//				else if(e.getSource() == rdbtnAccion) {
//					ImageIcon imagen = new ImageIcon("images/accion.jpg");
//					labelImagen.setIcon(imagen);
//				}
//				
//			}
//		};
//		
//		rdbtnRomantica.addActionListener(actionListener);
//		rdbtnTerror.addActionListener(actionListener);
//		rdbtnMisterio.addActionListener(actionListener);
//		rdbtnComedia.addActionListener(actionListener);
//		rdbtnAccion.addActionListener(actionListener);
		
		
		//Opcion 3:
		// Asociar ActionListener a cada botón
        rdbtnRomantica.addActionListener(e -> cargarImagen(labelImagen, "romantica"));
        rdbtnTerror.addActionListener(e -> cargarImagen(labelImagen, "terror"));
        rdbtnMisterio.addActionListener(e -> cargarImagen(labelImagen, "misterio"));
        rdbtnComedia.addActionListener(e -> cargarImagen(labelImagen, "comedia"));
        rdbtnAccion.addActionListener(e -> cargarImagen(labelImagen, "accion"));
	}
	
	private void cargarImagen(JLabel labelImagen, String genero) {
        ImageIcon imagen = new ImageIcon("images/" + genero + ".jpg");
        labelImagen.setIcon(imagen);
    }
	
}
