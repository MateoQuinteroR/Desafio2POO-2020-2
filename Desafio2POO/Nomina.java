package Desafio2POO;

import java.util.ArrayList;
import java.util.List;

public class Nomina {

    public List<Empleado> empleados;

    public Nomina(){
        this.empleados = new ArrayList<>();

    }

    public void calcularNomina(List<Empleado> empleados){

        if (empleados.size() > 0){
            empleados.forEach(x ->{
                System.out.println("El salario de " + x.getNombre() + " es: "+ x.calcularSalario());
            });
        }else {
            System.out.println("El empleado no existe en la base de datos.");
        }
    }


    public void listarDirectos(){

        empleados.forEach(x ->{
            if (x instanceof Directo){
                System.out.println(x.getNombre() + " Es un/a empleado/a directo");
            }
        });

    }
    public void listarFreelancers(){

        empleados.forEach(x ->{
            if (x instanceof Freelance){
                System.out.println(x.getNombre() + " Es un/a Freelancer");
            }
        });

    }
    public void listarPromotores(){

        empleados.forEach(x ->{
            if (x instanceof Promotor){
                System.out.println(x.getNombre() + " Es un Promotor");
            }
        });

    }

}
