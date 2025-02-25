
import java.util.HashMap;
import java.util.Iterator;

public class User {
	
	public static HashMap<Integer, Integer> dis(int n,
			HashMap<Integer, String> h1, HashMap<Integer, Integer> h2) 
		{

			HashMap<Integer, Integer> increaseSalaries = new HashMap<>();
        
			for (int id : h1.keySet()) {
				if (h1.get(id).equalsIgnoreCase("manager")) {
					increaseSalaries.put(id, h2.get(id) + 5000);
				}
			}
			
			return increaseSalaries;


	}

}
