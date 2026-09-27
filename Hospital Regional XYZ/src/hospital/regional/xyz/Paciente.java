/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.regional.xyz;

import java.time.LocalDate;

/**
 *
 * @author UCF20418
 */
public class Paciente {
    private String tipo_documento;
    private String nro_documento;
    private String nombre;
    private String paterno;
    private String materno;
    private LocalDate fecha_nacimiento;
    private String tipoSangre;
    private String alergias;
    private String telefono;
    private String correo;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
         if(this.telefono.equalsIgnoreCase("DNI")){
            if(nro_documento.length()==9){
                this.nro_documento = nro_documento;
            }else{
                System.out.println("El numero de DNI debe de tener 8 digitos");
            }
         }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        if(tipo_documento.equalsIgnoreCase("DNI") || tipo_documento.equalsIgnoreCase("C. E")){
        this.tipo_documento = tipo_documento;
        }
        else{     
            System.out.println("El tipo de documento debe de ser DNI o Carnet de Extranjeria");
        }
    }
    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        if(this.tipo_documento ==null){
            System.out.println("Primero debe de escoger el tipo de documento ");
            return;
        }
        if(this.tipo_documento.equalsIgnoreCase("DNI")){
            if(nro_documento.length()==8){
                this.nro_documento = nro_documento;
            }else{
                System.out.println("El numero de DNI debe de tener 8 digitos");
            }
        }else if(this.tipo_documento.equalsIgnoreCase("C. E"))
            if(nro_documento.length() == 10){            
                this.nro_documento = nro_documento;
            }else{
                System.out.println("El numero de C. E debe de tener 10 digitos");
            }     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    
    
      public void verDatos(){
        System.out.println("Persona TipoDoc: " + this.tipo_documento 
                + " NroDoc: " + this.nro_documento 
                + " Nombre: " + this.nombre + " Apellido paterno: " 
                + this.paterno + " Apellido materno: " + this.materno 
                + " Fecha de nacimiento: " + this.fecha_nacimiento);
    }
}
