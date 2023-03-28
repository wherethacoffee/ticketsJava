package Modelo;

public class Turno {
    private int nturno;
    private String curp;
    private int idmunicipio;
    private String status;

    public int getNturno(){
        return nturno;
    }

    public void setNturno(int nturno){
        this.nturno = nturno;
    }

    public String getCurp(){
        return curp;
    }

    public void setCurp(String curp){
        this.curp = curp;
    }

    public int getIdmunicipio(){
        return idmunicipio;
    }

    public void setIdmunicipio(int idmunicipio){
        this.idmunicipio = idmunicipio;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    
}
