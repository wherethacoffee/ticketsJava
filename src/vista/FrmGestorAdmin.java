package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmGestorAdmin extends JFrame {

    public JPanel contentPane;
    public JTextField textField;
    public JTextField textField_1;
    public JTextField textField_2;
    public JButton btnAgregar, btnEliminar, btnActualizar, btnBuscar, btnLimpiar;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmGestorAdmin frame = new FrmGestorAdmin();
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
    public FrmGestorAdmin() {
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

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblUsuario.setBounds(26, 97, 78, 32);
        panel.add(lblUsuario);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblContrasena.setBounds(26, 139, 97, 32);
        panel.add(lblContrasena);

        JLabel lblId = new JLabel("ID:");
        lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblId.setBounds(27, 55, 78, 32);
        panel.add(lblId);

        textField = new JTextField();
        textField.setBounds(156, 55, 183, 28);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(156, 97, 183, 28);
        panel.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(156, 139, 183, 28);
        panel.add(textField_2);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnBuscar.setBounds(378, 192, 97, 32);
        panel.add(btnBuscar);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnActualizar.setBounds(129, 192, 123, 32);
        panel.add(btnActualizar);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAgregar.setBounds(10, 192, 97, 32);
        panel.add(btnAgregar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEliminar.setBounds(262, 192, 97, 32);
        panel.add(btnEliminar);

        btnLimpiar = new JButton("limpiar");
        btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnLimpiar.setBounds(378, 139, 97, 32);
        panel.add(btnLimpiar);

        JLabel lblGestorAdmin = new JLabel("Gestor de Administradores");
        lblGestorAdmin.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblGestorAdmin.setBounds(62, 10, 297, 35);
        panel.add(lblGestorAdmin);
    }
}
