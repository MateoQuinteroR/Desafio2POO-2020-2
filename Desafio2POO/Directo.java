package Desafio2POO;

public class Directo extends Empleado{
    public long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {

        return salario - calcularSalud() - calcularPension();
    }

    public long calcularSalud(){

        return (long) (salario * 0.05);
    }

    public long calcularPension(){

        return (long) (salario * 0.065);
    }


}
