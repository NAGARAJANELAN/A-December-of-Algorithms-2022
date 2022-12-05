
import java.util.Scanner;
public class java11_Nagarajan_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char arr[][] = new char[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.next().charAt(0);
            }
            
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == '#')
                    continue;
                Integer count = 0;
                if (i - 1 >= 0 && arr[i - 1][j] == '#')
                    count++;
                if (j - 1 >= 0 && arr[i][j - 1] == '#')
                    count++;
                if (i + 1 < arr.length && arr[i + 1][j] == '#')
                    count++;
                if (j + 1 < arr.length && arr[i][j + 1] == '#')
                    count++;

                if (j + 1 < arr.length && i + 1 < arr.length && arr[i + 1][j + 1] == '#')
                    count++;
                if (j - 1 >= 0 && i - 1 >= 0 && arr[i - 1][j - 1] == '#')
                    count++;
                if (j + 1 < arr.length && i - 1 >= 0 && arr[i - 1][j + 1] == '#')
                    count++;
                if (i + 1 < arr.length && j - 1 >= 0 && arr[j - 1][i + 1] == '#')
                    count++;

                arr[i][j] = Integer.toString(count).charAt(0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
