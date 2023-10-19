import java.util.Scanner;

class InvalidParametersException extends Exception {
    public InvalidParametersException(String message) {
        super(message);
    }
}

public class FluxControl {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Type the first parameter");
            int firstParameter = terminal.nextInt();
            System.out.println("Type the second parameter");
            int secondParameter = terminal.nextInt();

            try {
                count(firstParameter, secondParameter);
            } catch (InvalidParametersException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        if (firstParameter >= secondParameter) {
            throw new InvalidParametersException("The second parameter must be higher than the first.");
        }

        for (int i = firstParameter; i < secondParameter; i++) {
            System.out.println("Printing number" + i);
        }
    }
}