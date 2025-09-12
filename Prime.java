import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int n = input.nextInt();
        System.out.println(isprime(n));
        
    }
    public static boolean isprime(int n ){
        if(n<=1) return false;
         if (n % 2 == 0) {
            return false;
         }
        for(int i = 3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
