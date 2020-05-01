public class Power{

    public static double power(double base, double exponent) {
        if (exponent < 1){
            return 1;
        } else {
            // System.out.println(Math.pow(base, exponent));   
            return base * power(base, exponent -1) ;
        }
    }

}