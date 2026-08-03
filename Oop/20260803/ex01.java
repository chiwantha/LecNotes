public static class ex01 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        String answer="";
        answer = (age >= 18) ? "You are an adult." : "You are a minor.";
        System.out.println(answer);
    }
}