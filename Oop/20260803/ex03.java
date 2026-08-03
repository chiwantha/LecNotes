public class ex03 {
    public static void main(String[] args) {
        Double answer = 3.15897456
        Double round = Math.round(answer);
        Double round2 = Math.round(answer * 100.0) / 100.0;
        Dounble round3 = Math.round(answer * 1000.0) / 1000.0;

        System.out.println("Original: " + answer);
        System.out.println("Rounded: " + round);
        System.out.println("Rounded to 2 decimal places: " + round2);
        System.out.println("Rounded to 3 decimal places: " + round3); 
    }
}