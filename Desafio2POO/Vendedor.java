package Desafio2POO;

public class Vendedor extends Directo{

    public long ventasDelMes;
    public long comision = 0;

    public Vendedor(String nombre, long salario,long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes =ventasDelMes;
    }

    public long calcularComision(){

        if (salario < 1000000){

            comision += ventasDelMes * 0.04;
        }else {

            comision += ventasDelMes * 0.035;
        }

        return comision;
    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + calcularComision();
    }
}
