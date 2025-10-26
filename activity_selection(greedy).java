class Solution {                                                                    //tc O(nlogn) and sc O(n)
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


///approach 2    same tc ans sc as above approach
import java.util.*;

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;

        // Create a list of activities as pairs [start, finish]
        ArrayList<int[]> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new int[]{start[i], finish[i]});
        }

        // Sort activities by finish time
        activities.sort(Comparator.comparingInt(a -> a[1]));

        // Select activities greedily
        int count = 1;                // first activity is always selected
        int lastFinish = activities.get(0)[1];  // finish time of last selected activity

        for (int i = 1; i < n; i++) {
            if (activities.get(i)[0] >= lastFinish) {  // check start >= last finish
                count++;
                lastFinish = activities.get(i)[1];
            }
        }

        return count;
    }
}

