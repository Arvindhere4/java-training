package Practice;

public class VictoryIsMine {
    public static void printPattern(String pattern) {
        for (int i = 1; i <= 22; i++) {
            System.out.print(pattern);
        }

    }

    public static void main(String[] args) {
        printPattern("/");
        System.out.println("\n|| Victory Is Mine! ||");
        printPattern("\\");
        System.out.println("\n|| Victory Is Mine! ||");
        printPattern("\\");
        System.out.println("\n|| Victory Is Mine! ||");
        printPattern("\\");
        System.out.println("\n|| Victory Is Mine! ||");
        printPattern("\\");
        System.out.println("\n|| Victory Is Mine! ||");
        printPattern("\\");
    }
}
