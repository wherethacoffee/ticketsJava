package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmAdminAgenda extends JFrame {

    public JPanel contentPane;
    public JTextField txtTurno;
    public JTextField txtCurp;
    public JTextField txtID;
    public JTextField txtStatus;
    public JButton btnGuardar, btnSalir, btnEliminar, btnModificar, btnBuscar;

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
        setBounds(100, 100, 610, 432);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 561, 375);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("No. de Turno:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(27, 70, 131, 44);
        panel.add(lblNewLabel);

        JLabel lblCurp = new JLabel("CURP:");
        lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCurp.setBounds(27, 112, 131, 44);
        panel.add(lblCurp);

        JLabel lblIdMunicipio = new JLabel("ID Municipio:");
        lblIdMunicipio.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblIdMunicipio.setBounds(27, 154, 131, 44);
        panel.add(lblIdMunicipio);

        JLabel lblStatus = new JLabel("Status:");
        lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblStatus.setBounds(27, 208, 131, 44);
        panel.add(lblStatus);

        txtTurno = new JTextField();
        txtTurno.setBounds(164, 70, 226, 30);
        panel.add(txtTurno);
        txtTurno.setColumns(10);

        txtCurp = new JTextField();
        txtCurp.setColumns(10);
        txtCurp.setBounds(164, 112, 226, 30);
        panel.add(txtCurp);

        txtID = new JTextField();
        txtID.setColumns(10);
        txtID.setBounds(164, 166, 226, 30);
        panel.add(txtID);

        txtStatus = new JTextField();
        txtStatus.setColumns(10);
        txtStatus.setBounds(164, 220, 226, 30);
        panel.add(txtStatus);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnGuardar.setBounds(27, 282, 111, 36);
        panel.add(btnGuardar);

        btnModificar = new JButton("Modificar");
        btnModificar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnModificar.setBounds(158, 282, 111, 36);
        panel.add(btnModificar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEliminar.setBounds(290, 282, 111, 36);
        panel.add(btnEliminar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnBuscar.setBounds(411, 282, 111, 36);
        panel.add(btnBuscar);

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSalir.setBounds(411, 220, 111, 36);
        panel.add(btnSalir);

        JLabel lblAgendaAdmin = new JLabel("Agenda Admin");
        lblAgendaAdmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAgendaAdmin.setBounds(175, 16, 173, 44);
        panel.add(lblAgendaAdmin);
    }

}
