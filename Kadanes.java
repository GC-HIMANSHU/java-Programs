public class Kadanes {
    public static void kadanes(int numbers[]){
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currsum += numbers[i];
            if(currsum < 0){
                currsum = 0;
            }
            max = Math.max(currsum, max);
        }
        System.out.println("max sum " + max);
    }

    public static void main(String args[]){
        int numbers [] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
    
}
