package pppp;

public class Circulo implements IcalcGeometria {
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    private double raio;

    @Override
    public double calcArea() {
        return this raio * this raio;

    }

    @Override
    public double calcPerimetro() {
        return this raio * this raio;
    }
}
