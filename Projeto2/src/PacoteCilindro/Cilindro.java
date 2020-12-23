package PacoteCilindro;

public class Cilindro {
    Circulo base;
    double altura;

    public Cilindro(Circulo base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcVolume() {
        return base.calcArea() * this.altura;
    }

    public double calcArea() {
        return (2 * Math.PI * base.raio * this.altura) + (2 * base.calcArea());
    }

}
