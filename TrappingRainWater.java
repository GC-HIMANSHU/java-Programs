public class TrappingRainWater {
    public static int rainwater(int height[]){
        int n = height.length;
        // left max boundary 
        int leftmax[] = new  int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //right max boundary
        int rigmax[] = new int[n];
        rigmax[n-1] = height[n-1];
        for(int i =n-2 ;i>=0;i--){
            rigmax[i] = Math.max(height[i], rigmax[i+1]);
        }

        int trappedwater = 0;
        // to calculate trapped water 
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftmax[i], rigmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

        rainwater(height);
    }
    
}
