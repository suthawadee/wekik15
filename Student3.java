package student.com.it;

import java.util.Scanner;

public class Student3 {
	//Instance variable
		String name;
		int age;
		String color;
		String sex;
		
	//1. Create a constructor of class//method constructor of class
		Student3(String n,int a,String c,String s)
		{
		//2. Data input for Student Object1
			name = n;
			age = a;
			color = c;
			sex = s;
		}
		
	private void methodStd1() 
	{
		//4. Display all data oblects1
		System.out.println("Student object 1 ");
		System.out.println(" Name: " + name + "\n Age: " + age + "\n Color: " + color + "\n Sex: " + sex);
	}
		
	//3. Main method
	public static void main(String[]args) 
	{
		//3.1 Create object here
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any value of name: ");
			String name = sc.nextLine();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter any value of Age: ");
			int age = sc2.nextInt();
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter any value of hair Color: ");
			String color = sc3.nextLine();
			
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Enter any value of Sex: ");
			String sex = sc4.nextLine();
			
			Student3 Std1 = new Student3(name,age,color,sex);
			Std1.methodStd1();
	}
}
