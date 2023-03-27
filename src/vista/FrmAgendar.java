package vista;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Modelo.Conexion;

public class FrmAgendar extends JFrame implements ActionListener {
    private JLabel lblNombre;
    private JLabel lblApePaterno;
    private JLabel lblApeMaterno;
    private JTextField txtNombre;
    private JTextField txtApePaterno;
    private JTextField txtApeMaterno;
    private JButton btnGuardar;
    private JButton btnCancelar;
    
    public FrmAgendar() {
        super("Agendar Cita");
        
        // Crear componentes
        lblNombre = new JLabel("Nombre:");
        lblApePaterno = new JLabel("Apellido Paterno:");
        lblApeMaterno = new JLabel("Apellido Materno:");
        txtNombre = new JTextField();
        txtNombre.setPreferredSize(new Dimension(150,20));
        txtApePaterno = new JTextField();
        txtApePaterno.setPreferredSize(new Dimension(150,20));
        txtApeMaterno = new JTextField();
        txtApeMaterno.setPreferredSize(new Dimension(150,20));
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        
        // Agregar listeners a botones
        btnGuardar.addActionListener(this);
        btnCancelar.addActionListener(this);
        
        // Crear panel y agregar componentes
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 80, 5, 5);
        panel.add(lblNombre, c);
        c.gridx++;
        panel.add(txtNombre, c);
        c.gridx = 0;
        c.gridy++;
        panel.add(lblApePaterno, c);
        c.gridx++;
        panel.add(txtApePaterno, c);
        c.gridx = 0;
        c.gridy++;
        panel.add(lblApeMaterno, c);
        c.gridx++;
        panel.add(txtApeMaterno, c);
        c.gridx = 0;
        c.gridy++;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        panel.add(btnGuardar, c);
        c.gridx++;
        panel.add(btnCancelar, c);
        
        // Agregar panel al JFrame
        add(panel);
        
        // Configurar JFrame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(300, 200));
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            // Obtener datos de los campos de texto
            String nombre = txtNombre.getText().trim();
            String apePaterno = txtApePaterno.getText().trim();
            String apeMaterno = txtApeMaterno.getText().trim();
            
            // Validar que los campos no estén vacíos
            if (nombre.isEmpty() || apePaterno.isEmpty() || apeMaterno.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese todos los campos.");
                return;
            }
            
          // Insertar datos en la base de datos
try {
    Connection conexion = Conexion.obtenerConexion();
    String query = "INSERT INTO cita (nombre, Paterno, materno) VALUES (?, ?, ?)";
    PreparedStatement ps = conexion.prepareStatement(query);
    ps.setString(1, nombre);
    ps.setString(2, apePaterno);
    ps.setString(3, apeMaterno);
    ps.executeUpdate();
    JOptionPane.showMessageDialog(null, "Cita agendada correctamente.");
    conexion.close();
} catch (SQLException ex) {
    System.out.println(ex.getMessage());
    JOptionPane.showMessageDialog(null, "Error al agendar cita.");
}
        }

    }
}