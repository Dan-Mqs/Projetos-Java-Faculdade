package PacoteCilindro;

import java.util.Scanner;

public class TestaForma {
    public static void main(String[] args) {
        double raio;
        double altura;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        raio = input.nextDouble();
        System.out.println("Digite a altura do cilindro: ");
        altura = input.nextDouble();

        Circulo baseCilindro = new Circulo(raio);
        Cilindro formaCilindro = new Cilindro(baseCilindro, altura);

        System.out.printf("A área total do cilindro é: %.2f \n", formaCilindro.calcArea());
        System.out.printf("O volume do cilindro é: %.2f \n", formaCilindro.calcVolume());

    }
}
