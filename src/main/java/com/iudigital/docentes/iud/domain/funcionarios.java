package com.iudigital.docentes.iud.domain;

import java.time.LocalDateTime;
/**
 *
 * @author Victor Guzman Castañeda
 */
public class funcionarios {
    private int id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String estado_civil;
    private String sexo;
    private String direccion;
    private String celular;
    private String fecha_nacimiento;
    private LocalDateTime fecha_creacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String cedular) {
        this.celular = cedular;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return  cedula + ", " + nombres + ", " + apellidos + ", " + estado_civil + ", " + sexo + ", " + direccion + ", " + celular + ", " + fecha_nacimiento + ", ";
    }
    
    
    
    
    
    
    
}
