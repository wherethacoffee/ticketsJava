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
    public JButton btnModificar, btnBuscar, btnGuardar, btnSalir;

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
        setBounds(100, 100, 545, 585);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 509, 528);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblCurp = new JLabel("Curp:");
        lblCurp.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCurp.setBounds(28, 10, 102, 24);
        panel.add(lblCurp);

        JLabel lblPaterno = new JLabel("Paterno:");
        lblPaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblPaterno.setBounds(28, 119, 102, 24);
        panel.add(lblPaterno);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNombre.setBounds(28, 64, 102, 24);
        panel.add(lblNombre);

        txtCurp = new JTextField();
        txtCurp.setBounds(140, 10, 313, 24);
        panel.add(txtCurp);
        txtCurp.setColumns(10);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnGuardar.setBounds(21, 470, 92, 32);
        panel.add(btnGuardar);

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSalir.setBounds(263, 470, 92, 32);
        panel.add(btnSalir);

        JLabel lblNivel = new JLabel("Nivel:");
        lblNivel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNivel.setBounds(29, 319, 102, 24);
        panel.add(lblNivel);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCorreo.setBounds(29, 264, 102, 24);
        panel.add(lblCorreo);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTelefono.setBounds(29, 210, 102, 24);
        panel.add(lblTelefono);

        JLabel lblMunicipio = new JLabel("id Municipio:");
        lblMunicipio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMunicipio.setBounds(28, 418, 103, 24);
        panel.add(lblMunicipio);

        JLabel lblAsunto = new JLabel("Asunto:");
        lblAsunto.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblAsunto.setBounds(29, 372, 102, 24);
        panel.add(lblAsunto);

        txtNombre = new JTextField();
        txtNombre.setColumns(10);
        txtNombre.setBounds(140, 64, 313, 24);
        panel.add(txtNombre);

        txtPaterno = new JTextField();
        txtPaterno.setColumns(10);
        txtPaterno.setBounds(140, 119, 313, 24);
        panel.add(txtPaterno);

        txtTelefono = new JTextField();
        txtTelefono.setColumns(10);
        txtTelefono.setBounds(141, 210, 313, 24);
        panel.add(txtTelefono);

        txtCorreo = new JTextField();
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(141, 264, 313, 24);
        panel.add(txtCorreo);

        txtNivel = new JTextField();
        txtNivel.setColumns(10);
        txtNivel.setBounds(141, 319, 313, 24);
        panel.add(txtNivel);

        txtAsunto = new JTextField();
        txtAsunto.setColumns(10);
        txtAsunto.setBounds(141, 372, 313, 24);
        panel.add(txtAsunto);

        txtMunicipio = new JTextField();
        txtMunicipio.setBounds(141, 418, 313, 25);
        panel.add(txtMunicipio);

        btnModificar = new JButton("Modificar");
        btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnModificar.setBounds(136, 470, 102, 32);
        panel.add(btnModificar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnBuscar.setBounds(383, 470, 92, 32);
        panel.add(btnBuscar);

        JLabel lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMaterno.setBounds(28, 164, 102, 24);
        panel.add(lblMaterno);

        txtMaterno = new JTextField();
        txtMaterno.setColumns(10);
        txtMaterno.setBounds(140, 164, 313, 24);
        panel.add(txtMaterno);
    }

}
