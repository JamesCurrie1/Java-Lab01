public class TaylorSeries {
    private int numIterations;
    public TaylorSeries(){
    }
    // YOUR CODE GOES HERE
    public static int approximateExp(int x, int numIterations){
        factorial(numIterations);
        return 2;
    }
    public static double factorial (int n){
        if(n <= 1){
            return n;
        }else{
            return n*(factorial(n-1));
        }
    }
    public static double pow (int x, int n){
        if(n <= 1){
            return n;
        }else{
            return x*(pow(x, n-1));
        }
    }
}