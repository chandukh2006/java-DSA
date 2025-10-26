class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
         
        int [][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = start[i];
            arr[i][1] = finish[i];
        }
        
        Arrays.sort(arr,Comparator.comparingInt(a ->a[1]));
        //atleast one activity can be completed
        int count = 1;
        
        //last selected activity
        int j = 0;
        for(int i = 1;i<n;i++){
            if(arr[i][0]>=arr[j][1]){
                count ++;
                j=i;
            }
        }
        return count;
    }
}
