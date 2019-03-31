import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  public class Main {
      public static void main(String[] args) throws IOException
       {
     
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          
          int n= Integer.parseInt(br.readLine());
          int a[][] = new int[n][3]; 
          String str[];
         
          for(int i=0;i<n;i++)
          {
              str=br.readLine().split("\\s");
                for(int j=0;j<3;j++)
            {
                    a[i][j]= Integer.parseInt(str[j]);
            }
          }
          int c=0,sol;
             sol=0;
                

           for(int i=0;i<n;i++)
          {
              c=0;
                for(int j=0;j<3;j++)
              {
                  if(a[i][j]==1)
                    c++;

                   if(c==2)
                   {
                        sol++;
                       break;
                   }    
              }
           }
           System.out.println(sol);

    }   
  
}
  
  


  
