import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double lado;
        double area;
        double perimetro;

        System.out.println("ingrese la medida de un lado del cuadrado en cm");
        lado = lector.nextDouble();

        area = (lado*lado);
        perimetro = (lado+lado+lado+lado);

        System.out.println("el area del cuadrado es:"+" "+area+" "+"cm^2");
        System.out.println("el perimetro del cuadrado es:"+" "+perimetro+" "+"cm");

    }
}