package com.bicicletas.dominio;

public abstract class Empleado extends Nomina {
    protected String nombre;
    public Empleado(String nombre) {
        super();
        this.nombre = nombre;
    }
    public abstract long calcularSalario();
}
