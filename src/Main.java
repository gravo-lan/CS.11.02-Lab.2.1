public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public int add(int a, int b) {
        return a + b;
    }
    
    // 2. add
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public String triple(String name) {
        return name.repeat(3);
    }

    // 6. half
    public double half(double value) {
        return value / 2;
    }

    // 7. roundPositiveValueToNearestInteger
    public int roundPositiveValueToNearestInteger(double value) {
        return (int) Math.round(value);
    }

    // 8. roundNegativeValueToNearestInteger
    public int roundNegativeValueToNearestInteger(double value) {
        return (int) Math.round(value);
    }

}
