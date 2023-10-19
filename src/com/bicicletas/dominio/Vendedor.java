package com.bicicletas.dominio;

public class Vendedor extends Directo{
    protected long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision() {
        return salario > 1_500_000 ? (long)(salario * 0.035) : (long)(salario * 0.045); //Funciona como if/else
    }
}
