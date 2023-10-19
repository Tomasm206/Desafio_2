package com.bicicletas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    protected List<Empleado> empleados;
    public Nomina() { empleados = new ArrayList<>();}
    public void calcularNomina(){
        for (Empleado empleado : empleados){
            if (empleado instanceof Vendedor){
                long salario = empleado.calcularSalario();
                System.out.println("El salario de " + empleado.nombre + " es: $"
                        + salario+ " (Valor ganado por comisión = $"+((Vendedor) empleado).calcularComision()+" )");
            }else {
                long salario = empleado.calcularSalario();
                System.out.println("El salario de " + empleado.nombre + " es: $" + salario);
            }
        }
    }
    public void listarDirectos() {
        System.out.println("Empleados directos:");
        empleados.stream()
                .filter(empleado -> empleado instanceof Directo)
                .forEach(empleado -> System.out.println(empleado.nombre));
    }
    public void listarFreelancers() {
        System.out.println("Empleados freelance:");
        empleados.stream()
                .filter(empleado -> empleado instanceof Freelance)
                .forEach(empleado -> System.out.println(empleado.nombre));
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
