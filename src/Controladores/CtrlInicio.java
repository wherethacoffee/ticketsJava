package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmInicio;
import vista.FrmLoginAdmin;
import vista.FrmAgendar;

public class CtrlInicio implements ActionListener {
    
    private final FrmInicio vista;
    private FrmAgendar frmAgendar;

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
        

        vista.getBtnAgendarCita().addActionListener(new ActionListener() {
            

            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de FrmAgendar
                frmAgendar = new FrmAgendar();
                // Hacer visible la ventana
                frmAgendar.setVisible(true);
            }
        });
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
