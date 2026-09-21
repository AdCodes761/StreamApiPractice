import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(

				new Employee(101, "Atharv", "Engineering", 85000, 26, "Pune"),
				new Employee(102, "Rahul", "Engineering", 120000, 31, "Mumbai"),
				new Employee(103, "Sneha", "HR", 70000, 28, "Pune"),
				new Employee(104, "Amit", "Engineering", 95000, 29, "Bangalore"),
				new Employee(105, "Priya", "Finance", 110000, 35, "Mumbai"),
				new Employee(106, "Rohan", "HR", 65000, 24, "Delhi"),
				new Employee(107, "Neha", "Finance", 90000, 30, "Pune"),
				new Employee(108, "Karan", "Engineering", 120000, 32, "Delhi"),
				new Employee(109, "Pooja", "Marketing", 75000, 27, "Mumbai"),
				new Employee(110, "Vikas", "Marketing", 85000, 33, "Pune"));
//		Q1
//		Print employees whose salary is greater than 90000.
//		List<Employee>list1=employees.stream().filter(e -> e.getSalary()>90000).collect(Collectors.toList());
//		System.out.println(list1);
//		Q2
//		Print names of all employees.
//		List<String>list2=employees.stream().map(e -> e.getName()).collect(Collectors.toList());
//		System.out.println(list2);
//		Q3
//		Print employees who belong to "Engineering"
//		List<Employee> list3 = employees.stream().filter(e -> "Engineering".equals(e.getDepartment()))
//				.collect(Collectors.toList());
//		System.out.println(list3);
//		Q4
//		Print employees whose age is greater than or equal to 30.
//		List<String> list4 = employees.stream().filter(e -> e.getAge() >= 30).map(e -> e.getName())
//				.collect(Collectors.toList());
//		System.out.println(list4);
//		Q5
//		Print the names of employees who live in Pune.
//		List<String> list5 = employees.stream().filter(e -> "Pune".equals(e.getCity())).map(e -> e.getName())
//				.collect(Collectors.toList());
//		System.out.println(list5);
//		Q6
//		Get all unique departments.
//		List<String> list6 = employees.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
//		System.out.println(list6);
//		Q7
//		Get all unique cities and sort them alphabetically.
//		List<String>list7=employees.stream().map(e -> e.getCity()).distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//		System.out.println(list7);
//		Q8
//		Sort employees by salary in ascending order.
		// employees.sort(Comparator.comparingInt(e ->
		// e.getSalary()));System.out.println(employees);
		// or
//		List<Employee>list8=employees.stream().sorted(Comparator.comparingInt(e -> e.getSalary())).collect(Collectors.toList());
//		System.out.println(list8);
//		Q9
//		Sort employees by salary in descending order.
//		List<Employee>list9=employees.stream().sorted(Comparator.comparingInt((Employee e) -> e.getSalary()).reversed()).collect(Collectors.toList());
//		System.out.println(list9);
//		Q10
//		Sort employees by:
//		Salary descending
//		If salary is same → name ascending
//		List<Employee> list10 = employees.stream().sorted(Comparator.comparingInt((Employee e) -> e.getSalary())
//				.reversed().thenComparing((Employee e) -> e.getName())).collect(Collectors.toList());
//		System.out.println(list10);
//		Q11
//		Find the employee with the highest salary.
//		Optional<Employee> e1=employees.stream().max(Comparator.comparingInt((Employee e) -> e.getSalary()));
//		System.out.println(e1.orElse(null));
//		Q12
//		Find the employee with the lowest salary.
//		Employee e1 = employees.stream().min(Comparator.comparingInt(e -> e.getSalary())).orElse(null);
//		System.out.println(e1);
//		Q13
//		Calculate total salary of all employees.
//		int totalSalary=employees.stream().mapToInt(e -> e.getSalary()).sum(); 
//		System.out.println(totalSalary);
//		Q14
//		Calculate the average salary.
//		double avgSalary=employees.stream().mapToInt(e -> e.getSalary()).average().orElse(0);
//		System.out.println(avgSalary);
//		Q15
//		Count how many employees have salary greater than 90000.
//		long count=employees.stream().filter(e -> e.getSalary()>90000).count();
//		System.out.println(count);
//		Q16
//		Group employees by department.
//		Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));
//		System.out.println(map);
//		Q17
//		Count employees in each department.
//		Map<String,Long>map=employees.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.counting()));
//System.out.println(map);	
//		Q18
//		Find the average salary of each department.
//Map<String,Double>map=employees.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.averagingInt(e -> e.getSalary())));
//	System.out.println(map);
//	Q19
//	Find the highest-paid employee in each department.
//		Map<Object, Optional<Employee>>map=employees.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary()))));
//		Q20
//		Find the total salary paid by each department.
//	Map<String,Integer>map=	employees.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.summingInt(e -> e.getSalary())));
//	System.out.println(map);
//		Q21
//		Find the second-highest salary.
//		Integer secondHighestSal=employees.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
//		System.out.println(sal);
//		Q22
//		Find the employee having the second-highest distinct salary.
//		Employee e1=employees.stream().filter(e -> e.getSalary()==secondHighestSal).limit(1).findFirst().orElse(null);
//	System.out.println(e1);
//		Q23
//		Find the highest-paid employee in each city. 
	//Map<String,Employee>map=employees.stream().collect(Collectors.groupingBy(e -> e.getCity(),Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary())), o -> o.orElse(null))));
//		Q24
//		Find the number of employees in each city.
//		Map<String,Long>map=employees.stream().collect(Collectors.groupingBy(e -> e.getCity(),Collectors.counting()));
//	System.out.println(map);

	}
}

class Employee {
	int id;
	String name;
	String department;
	int salary;
	int age;
	String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee(int id, String name, String department, int salary, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", age="
				+ age + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

}
