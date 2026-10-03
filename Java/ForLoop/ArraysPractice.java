
import java.util.ArrayList;
import java.util.List;



public class ArraysPractice {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        int sum=0;

        for(int val:arr){
            sum+=val;
        } 

        System.out.println("Sum of Arr:"+sum);

        List<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
   

    
}
