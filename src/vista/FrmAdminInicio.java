package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class FrmAdminInicio extends JFrame {

    public JPanel contentPane;
    public JButton btnAgenda, btnMunicipios, btnAdmin;
    public JButton btnSalir, btnGrafica1, btnGrafica2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmAdminInicio frame = new FrmAdminInicio();
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
    public FrmAdminInicio() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 571, 314);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 542, 262);

        JScrollPane scrollPane = new JScrollPane();
        contentPane.setLayout(null);
        panel.setLayout(null);
        contentPane.add(panel);

        btnMunicipios = new JButton("MUNICIPIOS");
        btnMunicipios.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnMunicipios.setBounds(99, 46, 133, 39);
        panel.add(btnMunicipios);

        btnAdmin = new JButton("ADMINS");
        btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAdmin.setBounds(299, 46, 133, 39);
        panel.add(btnAdmin);

        btnAgenda = new JButton("AGENDA");
        btnAgenda.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAgenda.setBounds(99, 122, 133, 39);
        panel.add(btnAgenda);

        btnSalir = new JButton("SALIR");
        btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSalir.setBounds(299, 122, 133, 39);
        panel.add(btnSalir);

        btnGrafica1 = new JButton("GRAFICA  STATUS");
        btnGrafica1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnGrafica1.setBounds(27, 199, 205, 39);
        panel.add(btnGrafica1);

        btnGrafica2 = new JButton("GRAFICA MUNICIPIO");
        btnGrafica2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnGrafica2.setBounds(299, 199, 205, 39);
        panel.add(btnGrafica2);
    }

    public JButton getBtnAdmin() {
        return btnAdmin;
    }

    public JButton getBtnAgenda() {
        return btnAgenda;
    }

    public JButton getBtnMunicipios() {
        return btnMunicipios;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnGrafica1() {
        return btnGrafica1;
    }

    public JButton getBtnGrafica2() {
        return btnGrafica2;
    }

}
