package pppp;

public class Quadrado implements IcalcGeometria{
    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double lado;

    @Override
    public double calcArea() {
        return (this.lado * this lado);
    }

    @Override
    public double calcPerimetro() {
        return 0;
    }
}
