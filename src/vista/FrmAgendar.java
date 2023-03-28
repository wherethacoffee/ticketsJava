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

    private JPanel contentPane;
    private JTextField txtCurp;
    private JTextField txtNombre;
    private JTextField txtPaterno;
    private JTextField txtTelefono;
    private JTextField txtCorreo;
    private JTextField txtNivel;
    private JTextField txtAsunto;
    private JTextField txtMunicipio;
    private JTextField txtEstatus;
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
        setBounds(100, 100, 453, 661);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 408, 604);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblCurp = new JLabel("Curp:");
        lblCurp.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCurp.setBounds(54, 73, 102, 24);
        panel.add(lblCurp);

        JLabel lblPaterno = new JLabel("Paterno:");
        lblPaterno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblPaterno.setBounds(54, 182, 102, 24);
        panel.add(lblPaterno);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNombre.setBounds(54, 127, 102, 24);
        panel.add(lblNombre);

        txtCurp = new JTextField();
        txtCurp.setBounds(166, 73, 197, 24);
        panel.add(txtCurp);
        txtCurp.setColumns(10);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnGuardar.setBounds(71, 550, 92, 32);
        panel.add(btnGuardar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnCancelar.setBounds(223, 550, 92, 32);
        panel.add(btnCancelar);

        JLabel lblNivel = new JLabel("Nivel:");
        lblNivel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblNivel.setBounds(54, 341, 102, 24);
        panel.add(lblNivel);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblCorreo.setBounds(54, 286, 102, 24);
        panel.add(lblCorreo);

        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTelefono.setBounds(54, 232, 102, 24);
        panel.add(lblTelefono);

        JLabel lblEstatus = new JLabel("Estatus:");
        lblEstatus.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblEstatus.setBounds(54, 495, 102, 24);
        panel.add(lblEstatus);

        JLabel lblMunicipio = new JLabel("Municipio:");
        lblMunicipio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblMunicipio.setBounds(53, 440, 103, 24);
        panel.add(lblMunicipio);

        JLabel lblAsunto = new JLabel("Asunto:");
        lblAsunto.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblAsunto.setBounds(54, 394, 102, 24);
        panel.add(lblAsunto);

        txtNombre = new JTextField();
        txtNombre.setColumns(10);
        txtNombre.setBounds(166, 127, 197, 24);
        panel.add(txtNombre);

        txtPaterno = new JTextField();
        txtPaterno.setColumns(10);
        txtPaterno.setBounds(166, 182, 197, 24);
        panel.add(txtPaterno);

        txtTelefono = new JTextField();
        txtTelefono.setColumns(10);
        txtTelefono.setBounds(166, 232, 197, 24);
        panel.add(txtTelefono);

        txtCorreo = new JTextField();
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(166, 286, 197, 24);
        panel.add(txtCorreo);

        txtNivel = new JTextField();
        txtNivel.setColumns(10);
        txtNivel.setBounds(166, 341, 197, 24);
        panel.add(txtNivel);

        txtAsunto = new JTextField();
        txtAsunto.setColumns(10);
        txtAsunto.setBounds(166, 394, 197, 24);
        panel.add(txtAsunto);

        txtMunicipio = new JTextField();
        txtMunicipio.setColumns(10);
        txtMunicipio.setBounds(166, 440, 197, 24);
        panel.add(txtMunicipio);

        txtEstatus = new JTextField();
        txtEstatus.setColumns(10);
        txtEstatus.setBounds(166, 495, 197, 24);
        panel.add(txtEstatus);

        JLabel lblTitular = new JLabel("Titular:");
        lblTitular.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        lblTitular.setBounds(54, 31, 102, 24);
        panel.add(lblTitular);

        txtTitular = new JTextField();
        txtTitular.setColumns(10);
        txtTitular.setBounds(166, 31, 197, 24);
        panel.add(txtTitular);
    }
}
