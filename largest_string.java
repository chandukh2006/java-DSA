import java.util.* ;
public class Main{
    public static  void main(String[] args) {
     String [] fruits = {"apple", "banana", "cherry", "date"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println("The largest fruit name is: " + largest);
    }
}
