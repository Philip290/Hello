import java.util.function.Supplier;
public class Hello {
    public static void main(String[] args) {
        double a = -9.81, xt;
        int t = 10, vi = 0, xi = 0;
        xt = (0.5 * a * Math.pow(t, 2)) + (vi * t) + xi;
       System.out.println("The position of an object after falling for 10 seconds is " + xt + "m");
    }
}
