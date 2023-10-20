package com.bicicletas.dominio;

public class Promotor extends Empleado{
    public static final int COMPRA_CON_VOLANTE = 12000;
    protected int volantesRepartidos;
    protected long valorVolantes;
    protected int comprasVolantes;

    public Promotor(String nombre, int volantesRepartidos, long valorVolantes, int comprasVolantes) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolantes = valorVolantes;
        this.comprasVolantes = comprasVolantes;
    }

    @Override
    public long calcularSalario() {
        return (volantesRepartidos * valorVolantes) + ((long)comprasVolantes*COMPRA_CON_VOLANTE);
    }
}
