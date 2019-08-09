import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.IOException;
import java.util.ArrayList;

   
        
 

public class Main2
{  
    static String lcs(String x,String y,int i,int j,String table[][])
        {
            String result;
              if(table[i][j]!=null)
              {
                  return(table[i][j]);
              }
              if(i==x.length()||j==y.length())
              {
                  return"";
              }
              else if(x.charAt(i)==y.charAt(j))
              {
                  result=x.charAt(i)+lcs(x,y,i+1,j+1,table);
              }
              else
              {
                  String a=lcs(x,y,i+1,j,table);
                  String b=lcs(x,y,i,j+1,table);
                  result=a.length()>b.length()?a:b; 
              }
               table[i][j]=result;
               return(result);
        }
    public static void main(String args[])throws Exception
    {
    
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            
              String x,y,z;
              
              x=br.readLine();
              y=br.readLine();

              String q[][]=new String[x.length()+1][y.length()+1];
              for ( String r[] :q ) {
                           for (String k : r) {
                               k=null;
                           }
                
              }
              z=lcs(x,y,0,0,q);
              System.out.println(z);
       
       
       
        
    }
}
