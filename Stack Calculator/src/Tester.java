import java.util.*;
public class Tester 
{
    public static void main(String args[])
    {
    	Stack<Double> st = new Stack<Double>();
    	Scanner sc = new Scanner(System.in);
    	
    	for(;;)
    	{
    		System.out.print("Enter number, math operation(+,-,*, or /), or Q to quit: ");
    		String input = sc.next();
    		if(input.equals("Q"))
    			break;
    		if(input.equals("+") || input.equals("-") || input.equals("/")
    				|| input.equals("*"))
    		{
    			if(st.size() < 2)
    			{
    				System.out.println("The stack doesn't have enough numbers to do calculation yet. ");
    				continue;
    			}
    			if(input.equals("+"))
    			{
    				double first = st.pop();
    				double second = st.pop();
    				st.push(second + first);
    				continue;
    			}
    			if(input.equals("-"))
    			{
    				double first = st.pop();
    				double second = st.pop();
    				st.push(second - first);
    				continue;
    			}
    			if(input.equals("*"))
    			{
    				double first = st.pop();
    				double second = st.pop();
    				st.push(second * first);
    				continue;
    			}
    			if(input.equals("/"))
    			{
    				double first = st.pop();
    				double second = st.pop();
    				st.push(second / first);
    				continue;
    			}
    		}
    		try
    		{
    		    st.push(Double.parseDouble(input));
    		}
    		catch(Exception e)
    		{
    			System.out.println("The input is not valid. ");
    			continue;
    		}
    		
    	}
    	if(st.size() == 1)
           System.out.println("The answer is " + st.pop());
    	sc.close();
    }
}

