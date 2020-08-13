package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ententies.ObjFunc;

public class FruncionarioResolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ObjFunc> list = new ArrayList<>(); 
				
		System.out.print("How many employess will be registered? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Emplyoee #"+ (i+1)+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			ObjFunc emp = new ObjFunc(id,name,salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		//busca o funcionario
		/*
		Integer pos = position(list, idsalary);
		if (pos ==null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage");
			double percent = sc.nextDouble();
			list.get(pos).aumentoSalario(percent);
		}
		*/
		
		//outro modo de buscar funcionario
		ObjFunc emp = list.stream().filter(x-> x.getIdFunc() == idsalary).findFirst().orElse(null);
		
		if (emp ==null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage");
			double percent = sc.nextDouble();
			emp.aumentoSalario(percent);
		}
		
		System.out.println();
		System.out.println("Listem of employees: ");
		for (ObjFunc e: list) {
			System.out.println(e);
		}
		
		
		sc.close();
	}

	public static Integer position(List<ObjFunc> list, int id) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getIdFunc()==id) {
				return i;
			}
		}
		return null;
	}
	
}
