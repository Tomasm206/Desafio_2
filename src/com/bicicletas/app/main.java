package com.bicicletas.app;

import com.bicicletas.dominio.Nomina;

public class main {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        nomina.calcularNomina();
        nomina.listarDirectos();
        nomina.listarFreelancers();
    }
}
