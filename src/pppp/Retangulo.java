package pppp;

public class Retangulo implements IcalcGeometria {
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double base;
    private double altura;

    @Override
    public double calcArea() {
        return this base * this altura;
    }

    @Override
    public double calcPerimetro() {
        return this base * this altura;
    }
}
