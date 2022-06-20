import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        SquareCount squareCount = new SquareCount();
        System.out.println("Please enter two numbers greater then zero and the first number being less than the second");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("There are " + squareCount.countSquares(a, b) + " perfect squares in between your numbers");

    }
}

class SquareCount {
    int countSquares(int a, int b)
    {
        return (int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
    }
}
