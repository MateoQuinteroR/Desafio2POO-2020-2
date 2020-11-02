package Desafio2POO.App;

import Desafio2POO.*;

public class DesafioApp {

    public static void main(String[] args) {

        Directo Juan = new Directo("Juan",4840000);
        Vendedor Julian = new Vendedor("Julián", 2050000, 45510000);
        Vendedor Carolina = new Vendedor("Carolina", 980000, 35989000);
        Freelance Johanna = new Freelance("Johanna",71000,89);
        Directo David = new Directo("David",3975000);
        Promotor Pedro = new Promotor("Pedro",1200,300,62);
        Freelance Gustavo = new Freelance("Gustavo",42500,65);

        Nomina nomina = new Nomina();

        nomina.empleados.add(Juan);
        nomina.empleados.add(Julian);
        nomina.empleados.add(Carolina);
        nomina.empleados.add(Johanna);
        nomina.empleados.add(David);
        nomina.empleados.add(Pedro);
        nomina.empleados.add(Gustavo);


        nomina.calcularNomina(nomina.empleados);
        System.out.println("\n A continuación se listarán los directos\n");
        nomina.listarDirectos();
        System.out.println("\n A continuación se listarán los freelancers\n");
        nomina.listarFreelancers();
        System.out.println("\n A continuación se listarán los promotores\n");
        nomina.listarPromotores();



    }
}
