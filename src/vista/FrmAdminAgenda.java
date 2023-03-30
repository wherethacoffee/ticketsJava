package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;

public class FrmAdminAgenda extends JFrame {

    public JPanel contentPane;
    public JTextField txtCurp;
    public JTextField txtNombre;
    public JTextField txtPaterno;
    public JTextField txtTelefono;
    public JTextField txtCorreo;
    public JTextField txtNivel;
    public JTextField txtMaterno;
    public JButton btnEliminar, btnBuscar, btnGuardar, btnModificar, btnLimpiar, btnSalir;
    public JComboBox cbMunicipio, cbAsunto;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmAdminAgenda frame = new FrmAdminAgenda();
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
    public FrmAdminAgenda() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 619, 585);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 585, 528);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblCurp = new JLabel("Curp:");
        lblCurp.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCurp.setBounds(24, 11, 102, 24);
        panel.add(lblCurp);

        JLabel lblPaterno = new JLabel("Paterno:");
        lblPaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblPaterno.setBounds(24, 120, 102, 24);
        panel.add(lblPaterno);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNombre.setBounds(24, 65, 102, 24);
        panel.add(lblNombre);

        txtCurp = new JTextField();
        txtCurp.setBounds(136, 11, 313, 24);
        panel.add(txtCurp);
        txtCurp.setColumns(10);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnGuardar.setBounds(26, 472, 100, 32);
        panel.add(btnGuardar);

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSalir.setBounds(483, 415, 92, 32);
        panel.add(btnSalir);

        JLabel lblNivel = new JLabel("Nivel:");
        lblNivel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNivel.setBounds(25, 320, 102, 24);
        panel.add(lblNivel);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCorreo.setBounds(25, 265, 102, 24);
        panel.add(lblCorreo);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTelefono.setBounds(25, 211, 102, 24);
        panel.add(lblTelefono);

        JLabel lblMunicipio = new JLabel("Municipio:");
        lblMunicipio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMunicipio.setBounds(24, 419, 103, 24);
        panel.add(lblMunicipio);

        JLabel lblAsunto = new JLabel("Asunto:");
        lblAsunto.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblAsunto.setBounds(25, 373, 102, 24);
        panel.add(lblAsunto);

        txtNombre = new JTextField();
        txtNombre.setColumns(10);
        txtNombre.setBounds(136, 65, 313, 24);
        panel.add(txtNombre);

        txtPaterno = new JTextField();
        txtPaterno.setColumns(10);
        txtPaterno.setBounds(136, 120, 313, 24);
        panel.add(txtPaterno);

        txtTelefono = new JTextField();
        txtTelefono.setColumns(10);
        txtTelefono.setBounds(137, 211, 313, 24);
        panel.add(txtTelefono);

        txtCorreo = new JTextField();
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(137, 265, 313, 24);
        panel.add(txtCorreo);

        txtNivel = new JTextField();
        txtNivel.setColumns(10);
        txtNivel.setBounds(137, 320, 313, 24);
        panel.add(txtNivel);

        cbAsunto = new JComboBox();
        cbAsunto.setBounds(137, 373, 313, 24);
        panel.add(cbAsunto);

        cbMunicipio = new JComboBox();
        cbMunicipio.setBounds(137, 419, 313, 25);
        panel.add(cbMunicipio);

        btnModificar = new JButton("Modificar");
        btnModificar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnModificar.setBounds(136, 472, 112, 32);
        panel.add(btnModificar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnBuscar.setBounds(370, 472, 92, 32);
        panel.add(btnBuscar);

        JLabel lblMaterno = new JLabel("Materno:");
        lblMaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMaterno.setBounds(24, 165, 102, 24);
        panel.add(lblMaterno);

        txtMaterno = new JTextField();
        txtMaterno.setColumns(10);
        txtMaterno.setBounds(136, 165, 313, 24);
        panel.add(txtMaterno);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnLimpiar.setBounds(472, 472, 92, 32);
        panel.add(btnLimpiar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEliminar.setBounds(258, 472, 102, 32);
        panel.add(btnEliminar);
    }
}
