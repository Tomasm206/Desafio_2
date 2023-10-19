package com.bicicletas.dominio;

public class Directo extends Empleado{
    protected long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long calcularSalud(){
        return (long)(salario * 0.051);
    }
    public long calcularPension(){
        return (long)(salario * 0.065);
    }
    public long calcularAporte(){
        return calcularSalud() + calcularPension();
    }

    @Override
    public long calcularSalario() {
        return (long)(salario - calcularAporte());
    }
}
