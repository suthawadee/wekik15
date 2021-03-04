package student.com.it;

public class Student {
	//1. State => field/attribute : instance variable
		//1.1 By reference variable
			String name;
			int age;
			String color;
			String sex;
	
	//2. Behaviors => method/function
	public static void main(String[]args)
	{
		//1. Create object here
			Student Std1 = new Student();
		
		//2.1 Data input for James Object1
			Std1.name = "James";
			Std1.age = 20;
			Std1.color = "Black";
			Std1.sex = "Male";
		
		//2.2 Data input for Tao Object2
			Std1.name = "Tao";
			Std1.age = 20;
			Std1.color = "Black";
			Std1.sex = "Male";
		
		//3. Display all data objects1
			System.out.println("Student object 1 ");
			System.out.println(" Name: " + Std1.name + "\n Age: " + Std1.age + "\n Color: " + Std1.color + "\n Sex: " + Std1.sex);
		
		//4. Display all data objects2
			System.out.println("Student object 2 ");
			System.out.println(" Name: " + Std1.name + "\n Age: " + Std1.age + "\n Color: " + Std1.color + "\n Sex: " + Std1.sex);
	}
}
