package questions;

public class Question6 {
    public static double power(double x, int n){
        if(n == 0) return 1;
        if(n>0){
            if(n % 2 == 0){
                return power(x,n/2) * power(x,n/2);
            }
            else{
                return x * power(x,n/2) *power(x,n/2);
            }
        }
        else{
            return 1/power(x,Math.abs(n));
        }
    }
}
