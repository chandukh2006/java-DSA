public class Linear{
    public static void main(String[] args){
        String name="chandu";
        char target='h';
    
        System.out.println(Linear(name, target));
       

    }
    static boolean Linear(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
