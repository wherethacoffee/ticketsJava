package Modelo;

public class Alumno {
    private String curp;
    private String nombre;
    private String Paterno;
    private String materno;
    private String telefono;
    private String correo;
    private String nivel;
    private int asunto;
    private int municipio_idmunicipio;

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getAsunto() {
        return asunto;
    }

    public void setAsunto(int asunto) {
        this.asunto = asunto;
    }

    public int getMunicipio_idmunicipio() {
        return municipio_idmunicipio;
    }

    public void setMunicipio_idmunicipio(int municipio_idmunicipio) {
        this.municipio_idmunicipio = municipio_idmunicipio;
    }
}
