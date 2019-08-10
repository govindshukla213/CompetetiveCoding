import java.util.Scanner;

public class Main3
{
    static int maxcount(int n ,int a[])
    {  
          int c=0,dx,max=0;
        
        for(int i=0;i<n-1;i++)
        { 
            dx=a[i+1]-a[i];
              if(dx>=0)
              {
                  c++;
              }
              else
              { 
                 if(c>max)
                 {
                     max=c;
                 }
                  c=0;
              }
        
            
        }
        if(c>max)
        {
            max=c;
        }
        return(max+1);

    }
       
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
           int n=sc.nextInt();
           int a[]=new int[n];
            for(int i=0;i<n;i++)
            { 
               a[i]=sc.nextInt();
            }

            System.out.println(maxcount(n,a));
        


        
    }
}
