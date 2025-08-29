public class MyCalc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java MyCalc <num1> <num2>");
            System.exit(1);
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int sum = a + b;
            System.out.println("Inputs: " + a + " and " + b);
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments must be integers.");
            System.exit(2);
        }
    }
}
