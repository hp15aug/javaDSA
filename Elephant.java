import java.util.Scanner;

public class Elephant {

    public static int calculateMinSteps(int x) {
        return (int) Math.ceil((double) x / 5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xCoordinate = scanner.nextInt();

        int minSteps = calculateMinSteps(xCoordinate);
        System.out.println(minSteps);

        scanner.close();
    }
}
