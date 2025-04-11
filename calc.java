import java.util.Scanner; //importing only scanner because it's needed
//Simple calculator

public class calc
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a, b, c = 0.0;

        System.out.print("Enter the first number \n");
        a = in.nextDouble();
        System.out.print("And enter second  \n");
        b = in.nextDouble();
        System.out.print("Choose the operation  " +
              "\n1.Addition" +
        		"\n2.Subtraction" +
        		"\n3.Multiplication" +
        		"\n4.Division" +
        		"\n5.Power" +
        		"\n#Please enter the number of operation \n");
        int operand = in.nextInt(); //using integer for less memory usage
       switch(operand){ //using switch statement for more compact syntax
		case 1: //addition
			c = a + b;  
        		System.out.println(a + " + " + b + " = " + c); 
			break;
		case 2: //subtraction
	        	c = a - b;  
        		System.out.println(a + " - " + b + " = " + c);
			break;
		case 3: //multiplication
			c = a * b;   
			System.out.println(a + " * " + b + " = " + c);
        		break;
		case 4: //division
        		c = a / b;  
			System.out.println(a + " / " + b + " = " + c);	
			break;
		case 5: //power
			System.out.println("Enhance A or B?" +
        				"\n1.A" +
        				"\n2.B");
       		 	int enhance = in.nextInt(); //using int for less memory usage 
        			if (enhance == 1) {
        				System.out.println(a*a); //creating our own pow to not include Math.* 
				}	
        			else {
        				System.out.println(b*b);
				}

	} 
    }
}
