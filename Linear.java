public class Linear{
    public static void main(String[] args){
        int[] arr={10,20,50,60,55};
        int target=60;
        int answer=linearsearch(arr,target);
        System.out.println(answer);

    }
static int linearsearch(int [] arr,int target){
if(arr.length==0){
    return 0;
}
for(int i=0;i<arr.length;i++){
    int element=arr[i];
    if(element==target){
        return i;
    }
}
return -1;
}
}