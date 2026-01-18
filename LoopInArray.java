public class LoopInArray {
    public static void updation(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
            System.out.println("marks after updation " +marks[i]);
        }
            System.out.println();

    }
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5,6,7};
        updation(marks);

        
    }
    
}
