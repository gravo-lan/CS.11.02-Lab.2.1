public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String name) {
        return name.repeat(3);
    }

    // 6. half
    public static double half(double value) {
        return value / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) Math.round(value);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value) {
        return (int) Math.round(Math.abs(value)) * -1;
    }

}
