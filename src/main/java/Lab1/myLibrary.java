package Lab1;

public class myLibrary {
    public static int Power (int Base, int Exponent) {
        return (int) Math.pow((double) Base,(double) Exponent);
    }
    public static int factorial (int n) {
        if (n == 1 | n == 0) {
            return  1;
        }
        return n * factorial(n-1);
    }
}
