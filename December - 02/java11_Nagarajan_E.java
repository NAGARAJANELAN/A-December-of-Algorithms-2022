
import java.util.Scanner;

public class java11_Nagarajan_E{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        System.out.println(str.substring(n - 4, n - 2) + str.substring(0, n - 4));

    }
}
