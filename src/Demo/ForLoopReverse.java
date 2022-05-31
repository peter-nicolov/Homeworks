package Demo;

public class ForLoopReverse {

        public static void main(String[] args){

            int arr[]={10, 20, 30, 40, 50};

            for(int i=4; i < arr.length; i--){
                if (i<0){
                    break;
                }
                System.out.println(arr[i]);
            }
        }
}