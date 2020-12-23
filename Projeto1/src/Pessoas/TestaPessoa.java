package Pessoas;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String[] args) {
        String inputNome;
        int inputIdade;
        double inputAltura;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        inputNome = input.nextLine();
        System.out.println("Digite a idade: ");
        inputIdade = input.nextInt();
        System.out.println("Digite a altura (em cm): ");
        inputAltura = input.nextDouble();

        Pessoa pessoa1 = new Pessoa(inputNome, inputIdade, inputAltura);

        System.out.println("--Exibição dos valores dos atributos do objeto--");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());

    }
}
