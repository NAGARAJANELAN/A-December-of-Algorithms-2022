import java.util.ArrayList;
import java.util.Scanner;

public class java11_Nagarajan_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        var ob = new Day1();
        var strArr = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            strArr.add(sc.next());
        }
        ob.getString(strArr);
    }

    public void getString(ArrayList<String> sarr) {

        for (int i = 0; i < sarr.size(); i++) {
            String res = "";
            String[] str = sarr.get(i).split(",");
            for (int j = 0; j < str.length; j++)
                res += (char) Integer.parseInt(str[j], 16);
            System.out.println(res);
        }

    }
}
