package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class FrmComprobante extends JFrame {

    public JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmComprobante frame = new FrmComprobante();
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
    public FrmComprobante() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 460);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 450, 460);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblComprobante = new JLabel("Comprobante");
        lblComprobante.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblComprobante.setBounds(110, 30, 250, 30);
        panel.add(lblComprobante);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNombre.setBounds(35, 120, 102, 24);
        panel.add(lblNombre);

        JLabel lblNombreVacio = new JLabel("");
        lblNombreVacio.setFont(new Font("Times New Roman", Font.PLAIN, 19));
        lblNombreVacio.setBounds(115, 120, 250, 24);
        panel.add(lblNombreVacio);

        JLabel lblAsunto = new JLabel("Asunto:");
        lblAsunto.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblAsunto.setBounds(42, 200, 102, 24);
        panel.add(lblAsunto);

        JLabel lblAsuntoVacio = new JLabel("");
        lblAsuntoVacio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblAsuntoVacio.setBounds(115, 200, 300, 24);
        panel.add(lblAsuntoVacio);

        JLabel lblTurno = new JLabel("Tu turno es:");
        lblTurno.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblTurno.setBounds(15, 280, 140, 24);
        panel.add(lblTurno);

        JLabel lblTurnoVacio = new JLabel("");
        lblTurnoVacio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblTurnoVacio.setBounds(150, 280, 180, 24);
        panel.add(lblTurnoVacio);

    }

}
