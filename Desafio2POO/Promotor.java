package Desafio2POO;

public class Promotor extends Empleado{

    public int volantesRepartidos;
    public long valorVolante;
    public int comprasVolante;

    public Promotor(String nombre,int volantesRepartidos,long valorVolante,int comprasVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolante = comprasVolante;
    }

    @Override
    public long calcularSalario() {

        return ((volantesRepartidos * valorVolante) + (15000 * comprasVolante));
    }
}
