package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInicio extends JFrame {

    private JPanel pnlInicio;
    private JLabel lblTitulo, lblLogo;
    private JButton btnAdmin, btnAgendarCita;

    public FrmInicio() {
        super("Inicio");

        setLayout(new BorderLayout());
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlInicio = new JPanel(new GridBagLayout());
        pnlInicio.setBackground(Color.WHITE);

        lblTitulo = new JLabel("Bienvenido al Sistema de Tramites");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));

        lblLogo = new JLabel();
        ImageIcon img = new ImageIcon("Imagenes/logo.png");
        lblLogo.setIcon(img);

        btnAdmin = new JButton("Administrador");
        btnAgendarCita = new JButton("Agendar Cita");

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(10, 10, 50, 10);
        pnlInicio.add(lblTitulo, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(10, 10, 10, 10);
        pnlInicio.add(lblLogo, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(10, 10, 10, 5);
        pnlInicio.add(btnAdmin, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.insets = new Insets(10, 5, 10, 10);
        pnlInicio.add(btnAgendarCita, constraints);

        add(pnlInicio, BorderLayout.CENTER);

        // Agregar ActionListener para el botón btnAdmin
        btnAdmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear instancia de FrmLoginAdmin
                FrmLoginAdmin loginAdmin = new FrmLoginAdmin();
                // Cerrar la instancia actual de FrmInicio
                dispose();
            }
        });
    }

    public JButton getBtnAdmin() {
        return btnAdmin;
    }

    public JButton getBtnAgendarCita() {
        return btnAgendarCita;
    }
}
