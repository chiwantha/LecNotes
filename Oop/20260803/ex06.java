public class ex06 {
    public static void main(String[] args) {
        ex06 obj = new ex06();
        int sum = obj.add(5, 10);
        System.out.println("Sum: " + sum);
    }
    int add(int a, int b) {
        return a + b;
    }
}