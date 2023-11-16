import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double side;
        double area;
        double perimeter;

        System.out.println("////////////////////////////////////////////////");

        System.out.println("ingrese la medida de un lado del cuadrado en cm");
        side = lector.nextDouble();

        area = (side*side);
        perimeter = (side+side+side+side);

        System.out.println("////////////////////////////////////////////////");

        System.out.println("el area del cuadrado es:"+" "+area+" "+"cm^2");
        System.out.println("el perimeter del cuadrado es:"+" "+perimeter+" "+"cm");

    }
}
