package day11;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setSalary(40000);
		System.out.printf("員工薪資 $%,d\n", emp.getSalary());
		emp.job();
		
		
		Manager mgr = new Manager();
		mgr.setSalary(80000);
		System.out.printf("經理薪資 $%,d\n", mgr.getSalary());
		mgr.job();
		
		Employee[] employees = {emp, mgr};
		for(Employee employee : employees ) {
			employee.job();
		}
		
	}

}
