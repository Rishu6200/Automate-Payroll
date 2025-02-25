
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        HashMap<Integer, String> h1 = new HashMap<>();
        HashMap<Integer, Integer> h2 = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt(); 
            String designation = sc.next(); 
            int salary = sc.nextInt(); 
            
            h1.put(id, designation);
            h2.put(id, salary);
        }
        
        HashMap<Integer, Integer> increaseSalaries = User.dis(n, h1, h2);
        
        for (Integer id : increaseSalaries.keySet()) {
            System.out.println(id);
            System.out.println(increaseSalaries.get(id));
        }
        
        sc.close();
    }
}
