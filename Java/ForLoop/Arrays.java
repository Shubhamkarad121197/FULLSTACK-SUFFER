

public class Arrays {
        public static void main(String args[]){
            int numbers[]={12,34,56,78,98,67};

            //Access Arrays Values
            System.out.println(numbers[2]);
            System.out.println(numbers[4]);

            //Traverse Array With Normal Forloop
            System.out.println("=======Normal Forloop========");
            for(int i=0;i<numbers.length;i++){
                System.out.println(numbers[i]);

            }

             //Traverse Array With Normal Forloop
            System.out.println("=======Enhance Forloop========");

            for(int value:numbers){
                System.out.println(value);
            }

        }
}
