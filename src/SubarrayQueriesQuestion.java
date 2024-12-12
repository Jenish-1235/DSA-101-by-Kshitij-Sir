import java.util.Scanner;

public class SubarrayQueriesQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int Q = sc.nextInt();
        for(int q = 0; q < Q; q++){

            int sum = 0;
            int s = sc.nextInt();
            int e = sc.nextInt();

            for(int i = s; i<=e; i++){
                sum+=arr[i];
            }
            System.out.println(sum);
        }



    }
}
