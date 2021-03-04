package student.com.it;

public class Student2 {
	//Instance variable
		String name;
		int age;
		String color;
		String sex;
		
		public void methodStd1(String n,int a,String c,String s) 
		{
			//3. Data input for James Object1
				name = n;
				age = a;
				color = c;
				sex = s;
		}
		public static void main(String[]args)
		{
			//1. Create object here
				Student2 Std1 = new Student2();
				
			//2. Called all data objects1
				Std1.methodStd1("James",20,"Black","Male");
				
			//4. Display all data objects1
				System.out.println("Student object 1 ");
				System.out.println(" Name: " + Std1.name + "\n Age: " + Std1.age + "\n Color: " + Std1.color + "\n Sex: " + Std1.sex);
		}
}
