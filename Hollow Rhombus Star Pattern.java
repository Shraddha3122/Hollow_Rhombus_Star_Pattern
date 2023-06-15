import java.util.Scanner;
public class HRhombusstar
{
    
 
    public static void main(String[] args)
    {
             
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
              System.out.print("Enter Symbol : ");
	
              char c = sc.next().charAt(0);
               int i=1,j=1; 
           
            	
              do 
               {
                    j=1;
                    
                      do
                        {
                               System.out.print(" ");
                        } while(j++<=n-i);
		     if(i==1 || i==n)
             		        {
             		           j=1;
             		           do
            		            {
     	                                 System.out.print(c);
     		                         
    		             }while(++j <=n);
                
   		        }
                  	    else
	    	    {
                         	        j=1;
                                           do
                            		{
                                               if(j==1 || j==n)
                               	     System.out.print(c);
                              	else
                                                 System.out.print(" ");
			 
                                            }while(++j<=n);
                     }
                            System.out.println();
                          ++i;
                       
               }  while(i<=n);           
 
         
                
    }
}