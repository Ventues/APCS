import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection
{
	public static void main(String args[]) 
	{
		Set<String> s1 = new HashSet<String>(); // Create s1
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");
		// s1 = {¡°Bill¡±, ¡°Larry¡±, ¡°Adolph¡±, ¡°Regina¡±, ¡°Susie¡±}
		// s2 = {¡°Larry¡±, ¡°Jack¡±, ¡°Alice¡±, ¡°June¡±, ¡°Benny¡±, ¡°Susie¡±}
		Set<String> s2 = new HashSet<String>(); // Create s2
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");

		// Build the intersection set
		// Modify s1 to be the intersection using the retainAll method
		if (!s1.retainAll(s2)) 
		{
			System.out.println("The retain method doesn't work successfully");
			return;
		}

		// Print the intersection set
		// Create iter1, an Iterator for s1
		Iterator<String> iter1 = s1.iterator();
		
		while(iter1.hasNext())
		{
			System.out.println(iter1.next());
		}

	}
}