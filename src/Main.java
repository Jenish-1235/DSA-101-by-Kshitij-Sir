import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int finSum = 0;
        for(int i = 0; i <= arr.length; i++){
            int sumArray = 0;
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j ; k++){
                    sum += arr[k];
                }
                sumArray+=sum;
            }
            finSum+=sumArray;
        }
        System.out.println(finSum);


        int mySum = 0;
        for(int i = 0 ; i < n; i++){
            mySum+= arr[i] * (n - i) * (i+1);
        }
        System.out.println(mySum);
    }
}