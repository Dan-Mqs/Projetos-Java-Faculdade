package PacoteCilindro;

public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcArea() {
        return (Math.pow(this.raio,2) * Math.PI);
    }
}
