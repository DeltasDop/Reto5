 package modeloVO;

import java.io.Serializable;

public class modeloVO implements Serializable{
    //Atributos
    private String Nombres; 
    private String Apellidos; 
    private String Nacimiento; 
    private String CorreoInst;
    private String CorreoPers;
    private long Celular; 
    private long Fijo; 
    private String Carrera;
    
    //Constructor vacío para añadir registros. 
    public modeloVO(){
    }
    
    //Constructor de la clase. 
    public modeloVO(String Nombres, String Apellidos, String Nacimiento, String CorreoInst, String CorreoPers, long Celular, long Fijo, String Carrera) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Nacimiento = Nacimiento;
        this.CorreoInst = CorreoInst;
        this.CorreoPers = CorreoPers;
        this.Celular = Celular;
        this.Fijo = Fijo;
        this.Carrera = Carrera;
    }
    
    //Setter y Getter.

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getCorreoInst() {
        return CorreoInst;
    }

    public void setCorreoInst(String CorreoInst) {
        this.CorreoInst = CorreoInst;
    }

    public String getCorreoPers() {
        return CorreoPers;
    }

    public void setCorreoPers(String CorreoPers) {
        this.CorreoPers = CorreoPers;
    }

    public long getCelular() {
        return Celular;
    }

    public void setCelular(long Celular) {
        this.Celular = Celular;
    }

    public long getFijo() {
        return Fijo;
    }

    public void setFijo(long Fijo) {
        this.Fijo = Fijo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    /*@Override
    public String toString(){
        return this.getNombres() + " " + this.getApellidos() + " " + this.getNacimiento() + " " + this.getCorreoInst() + " " + this.getCorreoPers() + " " + this.getCelular() + " " + this.getFijo() + " " + this.getCarrera();
    }*/
}
