package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ConsultasMunicipio;
import Modelo.Municipio;
import vista.FrmGestorMunicipio;

public class CtrlMunicipioAgenda implements ActionListener {
    private final Municipio modelo;
    private final ConsultasMunicipio consultas;
    private final FrmGestorMunicipio vista;

    public CtrlMunicipioAgenda(Municipio modelo, ConsultasMunicipio consultas, FrmGestorMunicipio vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


}
