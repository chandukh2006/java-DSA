import java.util.*;
public class Main{
    public static void main(String[] args) {
        String str = "hello iam chandu";
        System.out.println(capi(str));

    }
    public static String capi(String str){
        StringBuilder sb = new StringBuilder();
         sb.append(Character.toUpperCase(str.charAt(0)));
          for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                   sb.append(' '); 
                     i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
              
            }
            else {
                sb.append(str.charAt(i));
            }
          }
          return sb.toString();
    }
}
