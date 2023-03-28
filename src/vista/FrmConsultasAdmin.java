package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmConsultasAdmin extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmConsultasAdmin frame = new FrmConsultasAdmin();
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
    public FrmConsultasAdmin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 535, 304);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(25, 23, 485, 234);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblUsuario.setBounds(25, 85, 78, 32);
        panel.add(lblUsuario);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblContrasena.setBounds(25, 127, 97, 32);
        panel.add(lblContrasena);

        JLabel lblId = new JLabel("ID:");
        lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblId.setBounds(26, 43, 78, 32);
        panel.add(lblId);

        textField = new JTextField();
        textField.setBounds(155, 43, 183, 28);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(155, 85, 183, 28);
        panel.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(155, 127, 183, 28);
        panel.add(textField_2);

        JButton btnNewButton = new JButton("Buscar");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.setBounds(363, 127, 97, 32);
        panel.add(btnNewButton);

        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnActualizar.setBounds(155, 180, 123, 32);
        panel.add(btnActualizar);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAgregar.setBounds(45, 180, 97, 32);
        panel.add(btnAgregar);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEliminar.setBounds(288, 180, 97, 32);
        panel.add(btnEliminar);
    }
}
