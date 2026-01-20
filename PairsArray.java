public class PairsArray {
    public static void pair(int numbers[]){
         int tp = 0;
        for(int i=0;i<numbers.length;i++){
           
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("( " + curr + "," + numbers[j] + " )");
                tp++;
            }
            System.out.println();
         } 
         System.out.println("Total Pairs =" +tp);
       }
    
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,67,78,54,32};
        pair(numbers);
        
    }
}
