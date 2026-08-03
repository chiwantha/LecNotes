public class ex05 {
    int optGenarator() {
        int otp = (int)(Math.random() * 1000000);
        return otp;
    }
    public static void main(String[] args) {
        ex05 obj = new ex05();
        int otp = obj.optGenarator();
        System.out.println("OTP: " + otp);
    }
}

public class ex052 {
    static int optGenarator() {
        int otp = (int)(Math.random() * 1000000);
        return otp;
    }
    public static void main(String[] args) {
        int opt = opeGenarator();
        System.out.println("OTP: " + otp);
    }
}