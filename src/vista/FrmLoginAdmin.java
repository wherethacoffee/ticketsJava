package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmLoginAdmin extends JFrame {

        public JPanel contentPane;
        public JTextField txtUsuario;
        public JTextField txtContrasena;
        public JButton btnIngresar, btnSalir;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        FrmLoginAdmin frame = new FrmLoginAdmin();
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
        public FrmLoginAdmin() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 426, 305);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                setContentPane(contentPane);
                contentPane.setLayout(null);

                JPanel panel = new JPanel();
                panel.setBounds(10, 10, 397, 248);
                contentPane.add(panel);
                panel.setLayout(null);

                JLabel lblUsuario = new JLabel("Usuario:");
                lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
                lblUsuario.setBounds(25, 47, 75, 29);
                panel.add(lblUsuario);

                JLabel lblContrasena = new JLabel("Contraseña:");
                lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 15));
                lblContrasena.setBounds(25, 104, 108, 29);
                panel.add(lblContrasena);

                txtUsuario = new JTextField();
                txtUsuario.setBounds(130, 47, 212, 26);
                panel.add(txtUsuario);
                txtUsuario.setColumns(10);

                txtContrasena = new JTextField();
                txtContrasena.setColumns(10);
                txtContrasena.setBounds(130, 104, 212, 26);
                panel.add(txtContrasena);

                btnIngresar = new JButton("Ingresar");
                btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 15));
                btnIngresar.setBounds(54, 165, 108, 29);
                panel.add(btnIngresar);

                btnSalir = new JButton("Salir");
                btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
                btnSalir.setBounds(214, 165, 95, 29);
                panel.add(btnSalir);

                JLabel lblIniciarSesion = new JLabel("Iniciar Sesion");
                lblIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 15));
                lblIniciarSesion.setBounds(138, 8, 108, 29);
                panel.add(lblIniciarSesion);
        }
}
