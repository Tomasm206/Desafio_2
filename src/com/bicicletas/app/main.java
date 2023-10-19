package com.bicicletas.app;

import com.bicicletas.dominio.Directo;
import com.bicicletas.dominio.Freelance;
import com.bicicletas.dominio.Nomina;
import com.bicicletas.dominio.Vendedor;

public class main {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        Directo juan = new Directo("Juan", 4_840_000);
        Vendedor julian = new Vendedor("Julián", 2_050_000, 45_510_000);
        Vendedor claudia = new Vendedor("Claudia", 1_380_000, 35_989_000);
        Freelance johanna = new Freelance("Johanna", 71_000, 89);
        Directo david = new Directo("David", 3_975_000);
        Freelance gustavo = new Freelance("Gustavo", 42_500, 65);

        nomina.getEmpleados().add(juan);
        nomina.getEmpleados().add(julian);
        nomina.getEmpleados().add(claudia);
        nomina.getEmpleados().add(johanna);
        nomina.getEmpleados().add(david);
        nomina.getEmpleados().add(gustavo);

        nomina.calcularNomina();
        nomina.listarDirectos();
        nomina.listarFreelancers();
    }
}
