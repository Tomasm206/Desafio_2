package com.bicicletas.app;

import com.bicicletas.dominio.*;

public class main {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        Directo juan = new Directo("Juan", 4_840_000);
        Vendedor julian = new Vendedor("Julián", 2_050_000, 45_510_000);
        Vendedor claudia = new Vendedor("Claudia", 1_380_000, 35_989_000);
        Freelance johanna = new Freelance("Johanna", 71_000, 89);
        Directo david = new Directo("David", 3_975_000);
        Freelance gustavo = new Freelance("Gustavo", 42_500, 65);
        Promotor pedro = new Promotor("Pedro", 2000, 200,77);

        nomina.getEmpleados().add(juan);
        nomina.getEmpleados().add(julian);
        nomina.getEmpleados().add(claudia);
        nomina.getEmpleados().add(johanna);
        nomina.getEmpleados().add(david);
        nomina.getEmpleados().add(gustavo);
        nomina.getEmpleados().add(pedro);

        System.out.println("********************************************************");
        nomina.calcularNomina();
        System.out.println("********************************************************\n");
        System.out.println("*********************");
        nomina.listarDirectos();
        System.out.println("*********************");
        nomina.listarFreelancers();
        System.out.println("*********************");
        nomina.listarPromotores();
        System.out.println("*********************");
    }
}
