import com.book.*;
import com.employee.*;
public class maiin {
	public static void main(String[] args) {
		
			Author a=new Author("Vinay sir", "dasasd@SD.zcx", 'm');
			Book b=new Book("wipro java", 2300, 1, a );
			System.out.println(b+"\n---------------------------------------");
			
			
			
			Employee e1=new Employee(6651,"Devansh","Srivas",10000);
			
			System.out.println(e1);
			System.out.println("salary after raise = "+e1.raiseSalary(5));
				
			
		
	}
	

}
