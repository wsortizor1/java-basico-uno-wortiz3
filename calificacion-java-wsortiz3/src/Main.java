import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar rango de 1 -10");
        byte nota = scanner.nextByte();

        switch (nota) {
            case 1:
            case 2:
                System.out.println("Su calificación es: F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificación es: D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificación es: C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificación es: B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificación es: A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");
        }
    }
}