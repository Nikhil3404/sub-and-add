/**
 * <p> Title: calculator. </p>
 
 * <p> Copyright: Nikhil Â© 2017 </p>
 
 * @author Nikhil
 * @version 4.00	2018-03-06 calculator is made to add and subtract error terms 
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class classactivity {
	public static void main(String[] args)
	
	 
	{
		double x,y,z,k,l,m,a,b;
		
		 Scanner nikhil = new Scanner(System.in);
		 DecimalFormat change = new DecimalFormat();
	     // addition 
		 System.out.println("Enter First Number: "); // here you can enter any value
	        x = nikhil.nextDouble();               // double helps to compute both integer and decimal values
	        
	        System.out.println("Enter Second Number: "); // here you can enter any value
	        y = nikhil.nextDouble();                       // double helps to compute both integer and decimal values
	   
	       System.out.println("Enter 1st error value: "); // here you can enter any value
	       k = nikhil.nextDouble();            // double helps to compute both integer and decimal values
	       System.out.println("Enter 2nd error value: "); // here you can enter any value
	       l = nikhil.nextDouble();                 // double helps to compute both integer and decimal values
	       z = x + y ;
	       System.out.println("Sum of these numbers: "+ z);  // here it shows the   addition of those upper values
	       System.out.println("Sum of these numbers: "+ change.format(z));   // here it shows the  roundoff addition of those upper values
	      m= k+l;
	      System.out.println("Sum of these numbers: "+ m);  // here it shows the   addition of those upper values
	       System.out.println("Sum of these error values: "+ change.format(m));  // here it shows the  roundoff addition of those upper values
	       System.out.println("Diff of the value is" +z +"±"+ m);// here it shows the   addition of both measured and error values
	       System.out.println("Sum of the value is" +change.format(z) + "±" +change.format(m));// here it shows the  roundoff addition of both measured and error values
	     
	       // subtraction
	       a = x - y ;
	       System.out.println("Diff of these numbers: "+ a);  // here it shows the   subtraction of those upper values
	       System.out.println("Diff of these numbers: "+ change.format(a));   // here it shows the roundoff subtraction value of those upper values
	       
	      b= k+l;
	      System.out.println("Diff of these numbers: "+ z);  // here it shows the   subtraction of those upper values
	       System.out.println("Diff of these error values: "+ change.format(b));  // here it shows the roundoff subtraction value of those upper values
	       System.out.println("Diff of the value is" +a +"±"+ b);// here it shows the   subtraction of both measured and error values
	       System.out.println("Diff of the value is" +change.format(a) + "±" +change.format(b));// here it shows the  roundoff subtraction of both measured and error values
	      
	      
	      
	      
	       nikhil.close();
	}
}
