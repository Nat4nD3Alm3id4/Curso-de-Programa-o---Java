
import java.util.Scanner;

public class Atividade {

public static void main(String[] args) {
    Scanner imput= new Scanner(System.in);
    double base = 0;
    double altura = 0;
    double area = 0;
    double perimetro = 0;

    System.out.println("Por favor escreva o número da base do seu retângulo ");
    base = imput.nextDouble();

    System.out.println("Por favor escreva o número da altura do seu retângulo ");
    altura = imput.nextDouble();

    area = base*altura;

    System.out.println("O resultado da área do seu retangulo é ");
    perimetro = 2*(base + altura);
    System.out.println("A área do seu retângulo é " + area + " e o perimetro do seu retângulo é " + perimetro);
}
}
