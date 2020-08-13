package application;

import java.util.Locale;
import java.util.Scanner;

import ententies.ObjFunc;

public class Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o numero de funcionarios: ");
		int numFunc = sc.nextInt();
		sc.nextLine();
		
		ObjFunc[] vetFunc = new ObjFunc[numFunc];
		
		for(int i=0; i<numFunc; i++) {
			System.out.print("Digite o id do funcionario: ");
			int idFunc = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite o nome do funcionario: ");
			String nomeFunc = sc.nextLine();
			System.out.print("Digite o salario do funcionario: ");
			double numeroFunc = sc.nextDouble();
			System.out.println();
			
			vetFunc[i] = new ObjFunc(idFunc,nomeFunc,numeroFunc);		
		}
		
		System.out.print("Digite o id do funcionario que deseja aumentar o salario:");
		int idFunc = sc.nextInt();
		sc.nextLine();
		
		//for para procurar o funcionario para aumentar salario
		for(int i=0; i<numFunc; i++) {
			if(vetFunc[i].getIdFunc()==idFunc) {
				System.out.println("Digite a % a ser aumentada no salario: ");
				double aumento = sc.nextDouble();
				vetFunc[i].aumentoSalario(aumento);
			}
			else {
				if((i==(numFunc-1)) &&(vetFunc[i].getIdFunc()!=idFunc)) {
				System.out.println("ID do funcionario não existe!");
				}
			}
		}
		
		
		System.out.println("Lista de Funcionarios");
		for(int i=0; i<numFunc; i++) {
			System.out.println(vetFunc[i].toString());
		}
			
		sc.close();
	}

}
