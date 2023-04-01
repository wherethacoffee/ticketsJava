package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.ConsultasAlumno;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class FrmAgendaAdmin extends JFrame {

    public JPanel contentPane;
    public JTextField txtCurp;
    public JTextField txtNombre;
    public JTextField txtPaterno;
    public JTextField txtTelefono;
    public JTextField txtCorreo;
    public JTextField txtNivel;
    public JTextField txtMaterno;
    public JButton btnBuscar;
    public JButton btnModificar;
    public JButton btnGuardar;
    public JButton btnLimpiar;
    public JButton btnSalir;
    public JComboBox<String> cbMunicipio, cbAsunto, cbNivel;
    private JTextField txtStatus;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmAgendaAdmin frame = new FrmAgendaAdmin();
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
    public FrmAgendaAdmin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 619, 653);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 585, 585);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblCurp = new JLabel("Curp:");
        lblCurp.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCurp.setBounds(55, 10, 102, 24);
        panel.add(lblCurp);

        JLabel lblPaterno = new JLabel("Paterno:");
        lblPaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblPaterno.setBounds(55, 119, 102, 24);
        panel.add(lblPaterno);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNombre.setBounds(55, 64, 102, 24);
        panel.add(lblNombre);

        txtCurp = new JTextField();
        txtCurp.setBounds(167, 10, 313, 24);
        panel.add(txtCurp);
        txtCurp.setColumns(10);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnGuardar.setBounds(10, 510, 105, 32);
        panel.add(btnGuardar);

        btnSalir = new JButton("Regresar");
        btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSalir.setBounds(252, 510, 105, 32);
        panel.add(btnSalir);

        JLabel lblNivel = new JLabel("Nivel:");
        lblNivel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNivel.setBounds(56, 319, 102, 24);
        panel.add(lblNivel);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCorreo.setBounds(56, 264, 102, 24);
        panel.add(lblCorreo);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTelefono.setBounds(56, 210, 102, 24);
        panel.add(lblTelefono);

        JLabel lblMunicipio = new JLabel("Municipio:");
        lblMunicipio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMunicipio.setBounds(55, 418, 103, 24);
        panel.add(lblMunicipio);

        JLabel lblAsunto = new JLabel("Asunto:");
        lblAsunto.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblAsunto.setBounds(56, 372, 102, 24);
        panel.add(lblAsunto);

        txtNombre = new JTextField();
        txtNombre.setColumns(10);
        txtNombre.setBounds(167, 64, 313, 24);
        panel.add(txtNombre);

        txtPaterno = new JTextField();
        txtPaterno.setColumns(10);
        txtPaterno.setBounds(167, 119, 313, 24);
        panel.add(txtPaterno);

        txtTelefono = new JTextField();
        txtTelefono.setColumns(10);
        txtTelefono.setBounds(168, 210, 313, 24);
        panel.add(txtTelefono);

        txtCorreo = new JTextField();
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(168, 264, 313, 24);
        panel.add(txtCorreo);

        String[] cbNivel_opciones = { "Primaria", "Secundaria", "Preparatoria",
                "Licenciatura" };
        cbNivel = new JComboBox<>(cbNivel_opciones);
        cbNivel.setBounds(168, 319, 313, 24);
        panel.add(cbNivel);

        String[] cbAsunto_opciones = { "Entrega de papeleria", "Quejas", "Consultas academicas", "Beca estudiantil" };
        cbAsunto = new JComboBox<>(cbAsunto_opciones);
        cbAsunto.setBounds(168, 372, 313, 24);
        panel.add(cbAsunto);

        ConsultasAlumno cons = new ConsultasAlumno();
        cbMunicipio = new JComboBox<>(cons.cbMunicipio_fill().toArray(new String[0]));
        cbMunicipio.setBounds(168, 418, 313, 25);
        panel.add(cbMunicipio);

        btnModificar = new JButton("Modificar");
        btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnModificar.setBounds(125, 510, 102, 32);
        panel.add(btnModificar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnBuscar.setBounds(372, 510, 92, 32);
        panel.add(btnBuscar);

        JLabel lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMaterno.setBounds(55, 164, 102, 24);
        panel.add(lblMaterno);

        txtMaterno = new JTextField();
        txtMaterno.setColumns(10);
        txtMaterno.setBounds(167, 164, 313, 24);
        panel.add(txtMaterno);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnLimpiar.setBounds(483, 510, 92, 32);
        panel.add(btnLimpiar);

        JLabel lblStatus = new JLabel("Status:");
        lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblStatus.setBounds(55, 462, 102, 24);
        panel.add(lblStatus);

        txtStatus = new JTextField();
        txtStatus.setColumns(10);
        txtStatus.setBounds(167, 462, 313, 24);
        panel.add(txtStatus);
    }
}
