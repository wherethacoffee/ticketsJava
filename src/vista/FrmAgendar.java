package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class FrmAgendar extends JFrame {

    private JPanel contentPane;
    private JTextField txtCurp;
    private JTextField txtNombre;
    private JTextField txtPaterno;
    private JTextField txtTelefono;
    private JTextField txtCorreo;
    private JTextField txtNivel;
    private JTextField txtAsunto;
    private JTextField txtTitular;

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
        setBounds(100, 100, 545, 606);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 509, 551);
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
        btnGuardar.setBounds(22, 495, 92, 32);
        panel.add(btnGuardar);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSalir.setBounds(264, 495, 92, 32);
        panel.add(btnSalir);

        JLabel lblNivel = new JLabel("Nivel:");
        lblNivel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNivel.setBounds(30, 341, 102, 24);
        panel.add(lblNivel);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCorreo.setBounds(30, 286, 102, 24);
        panel.add(lblCorreo);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTelefono.setBounds(30, 232, 102, 24);
        panel.add(lblTelefono);

        JLabel lblMunicipio = new JLabel("Municipio:");
        lblMunicipio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMunicipio.setBounds(29, 440, 103, 24);
        panel.add(lblMunicipio);

        JLabel lblAsunto = new JLabel("Asunto:");
        lblAsunto.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblAsunto.setBounds(30, 394, 102, 24);
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
        txtTelefono.setBounds(142, 232, 313, 24);
        panel.add(txtTelefono);

        txtCorreo = new JTextField();
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(142, 286, 313, 24);
        panel.add(txtCorreo);

        txtNivel = new JTextField();
        txtNivel.setColumns(10);
        txtNivel.setBounds(142, 341, 313, 24);
        panel.add(txtNivel);

        txtAsunto = new JTextField();
        txtAsunto.setColumns(10);
        txtAsunto.setBounds(142, 394, 313, 24);
        panel.add(txtAsunto);

        JLabel lblTitular = new JLabel("Titular:");
        lblTitular.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTitular.setBounds(30, 31, 102, 24);
        panel.add(lblTitular);

        txtTitular = new JTextField();
        txtTitular.setColumns(10);
        txtTitular.setBounds(142, 31, 313, 24);
        panel.add(txtTitular);

        JComboBox cbMunicipio = new JComboBox();
        cbMunicipio.setBounds(142, 440, 313, 25);
        panel.add(cbMunicipio);

        JButton btnModificar = new JButton("Modificar");
        btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnModificar.setBounds(137, 495, 102, 32);
        panel.add(btnModificar);

        JButton btnBuscar = new JButton("Salir");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnBuscar.setBounds(384, 495, 92, 32);
        panel.add(btnBuscar);
    }
}
