import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pavan {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		Map<Integer,Employee>map=new HashMap<>();
		for(int i=1;i<=3;i++)
		{
			
			Employee e=new Employee();
			
			System.out.print("Enter employee id :");
			int id=scan.nextInt();
			
			System.out.print("Enter employee name:");
			String name=scan.next();
			System.out.print("Enter employee sal :");
			double sal=scan.nextDouble();
			e.setEid(id);
			e.setEname(name);
			e.setSal(sal);
			
			map.put(e.getEid(), e);
			System.out.println(e.getEid()+ ":employee stored");
			
			System.out.println(e.toString());
		}
	}
	// public Employee emp

}
