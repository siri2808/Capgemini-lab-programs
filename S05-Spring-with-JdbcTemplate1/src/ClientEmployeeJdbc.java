//ClientEmployeeJdbc.java
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientEmployeeJdbc {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_Jdbc.xml");
		EmployeeDao eDao = (EmployeeDao)context.getBean("empDaoImpl");
		
		Employee e = new Employee();
		e.setEno(1081);
		e.setEname("Raj");
		e.setDesig("Director");
		e.setSal(10000.0);
		
		eDao.save(e);
		System.out.println("Record inserted successfully...");
	}
}
