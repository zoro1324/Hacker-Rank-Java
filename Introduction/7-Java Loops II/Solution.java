import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            int k=1;
            for (int j=1;j<=n;j++) {
                sum+=k*b;
                System.out.printf("%d ",sum);
                k*=2;
            }
            sum = 0;
            System.out.println("");
        }
        in.close();
    }
}