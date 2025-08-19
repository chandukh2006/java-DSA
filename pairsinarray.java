public class Main {

    public static void main(String[] args) {
        int arr []= {2,4,6,8,10};
        pairs(arr);
        }
    public static void pairs(int[] arr) {
        int tp = 0 ; 
        for(int i=0;i<arr.length;i++){
            int cur = arr[i];
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+cur+","+arr[j]+")");
            tp++;
        
        }
           
      
        System.out.println();
    }
      System.out.print("total no of pairs = "+tp);
        
    
    }
}
