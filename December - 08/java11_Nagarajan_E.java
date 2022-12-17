import java.util.Scanner;

public class java11_Nagarajan_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(i=0;i<str.length()-1;i+=2){
           sb.append(str.charAt(i+1));
           sb.append(str.charAt(i));

        }
        if(str.length()%2!=0) sb.append(str.charAt(str.length()-1));
        System.out.println(sb);
        sc.close();
        }
}
