package collections_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	private	ArrayList<StudentData> data;
	private Scanner scanner;

	public StudentManagement() {
		data= new ArrayList<StudentData>();
		scanner = new Scanner(System.in);
	}


	public void addNewStudent() {

		System.out.println("Enter student details");
		System.out.println("Enter the id:");
		int id= scanner.nextInt();
		System.out.println(id);
		
		scanner.nextLine();
		
		
		System.out.println("Enter the Name:");
		String name= scanner.nextLine();
		System.out.println(name);
		System.out.println("Enter the age:");
		int age= scanner.nextInt();
		
		
		
		scanner.nextLine();
		
		
		System.out.println("Enter the std:");
		String std= scanner.nextLine();

		data.add(new StudentData(id, name, age, std));


	}


	public void displayStudents() {
		if(data.isEmpty()) {
			System.out.println("No Students Found!!");
			return;
		}

		for(StudentData sd:data) {
			System.out.println(sd);
		}
	}



	public void removeStudent() {
		System.out.println("Enter the student id:");
		int id= scanner.nextInt();

		for(StudentData sd:data) {
			if(id==sd.getId()) {
				data.remove(id);
			}
		}
	}


	public void adminArea() {
		while(true) {
			System.out.println("\n*************Student Management System*************\n");
			System.out.println("1.Add Student");
			System.out.println("2.Display Student");
			System.out.println("3. Remove Student");
			System.out.println("4.Exit");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				addNewStudent();
				break;
			case 2:
				displayStudents();
				break;

			case 3:
				removeStudent();
				break;
			case 4:
				System.out.println("Exiting.....");
				return;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}

	public static void main(String[] args) {
		StudentManagement sms= new StudentManagement();
		sms.adminArea();

	}

}
