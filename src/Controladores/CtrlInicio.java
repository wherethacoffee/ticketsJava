package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmInicio;
import vista.FrmLoginAdmin;

public class CtrlInicio implements ActionListener {
    
    private final FrmInicio vista;
    

    // ------- Controlador de la vista LoginAdmin -------
    public CtrlInicio() {
        vista = new FrmInicio();
        vista.getBtnAdmin().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de FrmLoginAdmin
                FrmLoginAdmin frmLoginAdmin = new FrmLoginAdmin();
                // Hacer visible la ventana
                frmLoginAdmin.setVisible(true);
            }
        });
        vista.getBtnAgendarCita().addActionListener(this);
    }
    
    // ------- Controlador de la vista Agendar Cita --------

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.getBtnAgendarCita()) {
            // Lógica para abrir ventana de agendar cita
        }
    }
    
    public void iniciar() {
        vista.setVisible(true);
    }
}
