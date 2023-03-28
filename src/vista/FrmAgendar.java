package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmAgendar extends JFrame {

    public JPanel contentPane;
    public JTextField txtCurp;
    public JTextField txtNombre;
    public JTextField txtPaterno;
    public JTextField txtTelefono;
    public JTextField txtCorreo;
    public JTextField txtNivel;
    public JTextField txtAsunto;
    public JTextField txtTitular;
    public JTextField txtMunicipio;
    public JTextField txtMaterno;
    public JButton btnModificar, btnBuscar;
    public javax.swing.JButton btnGuardar;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmAgendar frame = new FrmAgendar();
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
    public FrmAgendar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 545, 657);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 509, 600);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblCurp = new JLabel("Curp:");
        lblCurp.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCurp.setBounds(30, 73, 102, 24);
        panel.add(lblCurp);

        JLabel lblPaterno = new JLabel("Paterno:");
        lblPaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblPaterno.setBounds(30, 182, 102, 24);
        panel.add(lblPaterno);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNombre.setBounds(30, 127, 102, 24);
        panel.add(lblNombre);

        txtCurp = new JTextField();
        txtCurp.setBounds(142, 73, 313, 24);
        panel.add(txtCurp);
        txtCurp.setColumns(10);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnGuardar.setBounds(23, 533, 92, 32);
        panel.add(btnGuardar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSalir.setBounds(265, 533, 92, 32);
        panel.add(btnSalir);

        JLabel lblNivel = new JLabel("Nivel:");
        lblNivel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNivel.setBounds(31, 382, 102, 24);
        panel.add(lblNivel);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCorreo.setBounds(31, 327, 102, 24);
        panel.add(lblCorreo);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTelefono.setBounds(31, 273, 102, 24);
        panel.add(lblTelefono);

        JLabel lblMunicipio = new JLabel("Municipio:");
        lblMunicipio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMunicipio.setBounds(30, 481, 103, 24);
        panel.add(lblMunicipio);

        JLabel lblAsunto = new JLabel("Asunto:");
        lblAsunto.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblAsunto.setBounds(31, 435, 102, 24);
        panel.add(lblAsunto);

        txtNombre = new JTextField();
        txtNombre.setColumns(10);
        txtNombre.setBounds(142, 127, 313, 24);
        panel.add(txtNombre);

        txtPaterno = new JTextField();
        txtPaterno.setColumns(10);
        txtPaterno.setBounds(142, 182, 313, 24);
        panel.add(txtPaterno);

        txtTelefono = new JTextField();
        txtTelefono.setColumns(10);
        txtTelefono.setBounds(143, 273, 313, 24);
        panel.add(txtTelefono);

        txtCorreo = new JTextField();
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(143, 327, 313, 24);
        panel.add(txtCorreo);

        txtNivel = new JTextField();
        txtNivel.setColumns(10);
        txtNivel.setBounds(143, 382, 313, 24);
        panel.add(txtNivel);

        txtAsunto = new JTextField();
        txtAsunto.setColumns(10);
        txtAsunto.setBounds(143, 435, 313, 24);
        panel.add(txtAsunto);

        JLabel lblTitular = new JLabel("Titular:");
        lblTitular.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTitular.setBounds(30, 31, 102, 24);
        panel.add(lblTitular);

        txtTitular = new JTextField();
        txtTitular.setColumns(10);
        txtTitular.setBounds(142, 31, 313, 24);
        panel.add(txtTitular);

        txtMunicipio = new JTextField();
        txtMunicipio.setBounds(143, 481, 313, 25);
        panel.add(txtMunicipio);

        JButton btnModificar = new JButton("Modificar");
        btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnModificar.setBounds(138, 533, 102, 32);
        panel.add(btnModificar);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnBuscar.setBounds(385, 533, 92, 32);
        panel.add(btnBuscar);

        JLabel lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMaterno.setBounds(30, 227, 102, 24);
        panel.add(lblMaterno);

        txtMaterno = new JTextField();
        txtMaterno.setColumns(10);
        txtMaterno.setBounds(142, 227, 313, 24);
        panel.add(txtMaterno);
    }

}
