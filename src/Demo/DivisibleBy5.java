package Demo;

public class DivisibleBy5 {

    public static void main(String[] args) {
        int arr[]={12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i=0; i < arr.length; i++) {
            if (arr[i] % 5 ==0) {
                if (arr[i] > 150) {
                    break;
                }
            System.out.println("The divisible numbers are: " + arr[i]);
            }
        }
    }
}
