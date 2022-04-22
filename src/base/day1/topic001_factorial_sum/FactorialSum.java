package base.day1.topic001_factorial_sum;

/**
 * @author 郭家赫
 */
public class FactorialSum {


    public static long factorial(int n){
        long fac=1;
        for (int i = 1; i <= n; i++) {
            fac*=i;
        }
        return fac;
    }

    public static long calculate(int n){
        long sum =0;
        for (int i = 1; i <=n; i++) {
            sum+=factorial(i);
        }
        return sum;

    }

    public static long calculate1(int n){
        long sum=0;
        long fac=1;
        for (int i = 1; i <=n; i++) {
            fac*=i;
            sum+=fac;
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(calculate(10));
        System.out.println(calculate1(10));
    }
}
