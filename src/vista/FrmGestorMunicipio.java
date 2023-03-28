package vista;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FrmGestorMunicipio extends JFrame {

    private JPanel contentPane;
    private JTextField txtIDMunicipio;
    private JTextField txtNombreMunicipio;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmGestorMunicipio frame = new FrmGestorMunicipio();
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
    public FrmGestorMunicipio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 535, 304);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 500, 257);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblMunicipio = new JLabel("Municipio:");
        lblMunicipio.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblMunicipio.setBounds(37, 115, 78, 32);
        panel.add(lblMunicipio);

        JLabel lblId = new JLabel("ID:");
        lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblId.setBounds(38, 73, 78, 32);
        panel.add(lblId);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnBuscar.setBounds(378, 192, 97, 32);
        panel.add(btnBuscar);

        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnActualizar.setBounds(129, 192, 123, 32);
        panel.add(btnActualizar);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAgregar.setBounds(10, 192, 97, 32);
        panel.add(btnAgregar);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEliminar.setBounds(262, 192, 97, 32);
        panel.add(btnEliminar);

        JButton btnLimpiar = new JButton("limpiar");
        btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnLimpiar.setBounds(378, 139, 97, 32);
        panel.add(btnLimpiar);

        JLabel lblGestorMunicipio = new JLabel("Gestor de Municipios");
        lblGestorMunicipio.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblGestorMunicipio.setBounds(62, 28, 297, 35);
        panel.add(lblGestorMunicipio);

        txtIDMunicipio = new JTextField();
        txtIDMunicipio.setBounds(144, 79, 202, 26);
        panel.add(txtIDMunicipio);
        txtIDMunicipio.setColumns(10);

        txtNombreMunicipio = new JTextField();
        txtNombreMunicipio.setColumns(10);
        txtNombreMunicipio.setBounds(144, 115, 202, 26);
        panel.add(txtNombreMunicipio);
    }
}
