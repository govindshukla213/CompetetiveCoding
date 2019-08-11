import java.io.*;
import java.lang.Math;
public class Main3
{
    
    public static void main(String[]args) throws IOException 
    {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int max=100001;
           int n=Integer.parseInt(br.readLine());
           int a[]=new int[n];
            long freq[]=new long[max];
            long  dp[]=new  long[max];
           String s[]=br.readLine().split("\\s");
            for(int i=0;i<n;i++)
            { 
               a[i]=Integer.parseInt(s[i]);
               freq[a[i]]+=a[i];
            }
            dp[0]=0;
            dp[1]=freq[1];
            long res=0;
            for(int i=2;i<max;i++)
            {
                dp[i]=Math.max(dp[i-1],dp[i-2]+freq[i]);
                res = Math.max(res,dp[i]);
            }

            System.out.println(res);
             
    }
}
