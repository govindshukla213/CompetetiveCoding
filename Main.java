import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  public class Main {
      public static void main(String[] args) throws IOException
       {
     
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
          
    int n= Integer.parseInt(br.readLine());
         String s[]= new String[n];
        for( int i=0;i<n;i++)
        {
            s[i]= br.readLine(); 
        }
        for( int i=0;i<n;i++)
        {
           if(s[i].length()>10)
           {
               System.out.printf("%c%d%c\n",s[i].charAt(0),s[i].length()-2,s[i].charAt(s[i].length()-1));

           }
           else{
               System.out.println(s[i]);
           }
           
        }

    }   
  }
  
  
  


  
