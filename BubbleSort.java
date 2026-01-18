public class BubbleSort {
    public static void bubble(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1-i;j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
            }
        }
    } 
}
public static void array(int numbers[]){
    for(int i=0;i<numbers.length;i++){
        System.out.print(" " + numbers[i]);
    }
    System.out.println();

}
    public static void main(String args[]){
        int numbers[] = {2,4,5,3,1};
        bubble(numbers);
        array(numbers);

    }
}
