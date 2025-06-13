package day6;

import java.util.Scanner;

public class task2{
	
	int top=-1;
	int stack[] = new int[5];
	
	public void push() {
		Scanner num =new Scanner(System.in);
		System.out.println("Enter the element");
		int a=num.nextInt();
		if(top==5) {
			System.out.println("Stack overflow");
		}
		else {
			
			stack[++top]=a;
			display();
			
		}
		
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else
		{
			top--;
		}
	}
	public void display()
	{
		for (int i=0;i<=stack[i];i++) {
			System.out.println(stack[i]);
		}
	}
	public static void main(String []args) {
		task2 t=new task2();
		int choice;
		do
		{
		System.out.println("1.PUSH");
		System.out.println("2.POP");
		System.out.println("3.DISPLAY");
		System.out.println("4.EXIT");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice");
		choice=s.nextInt();
		
			
		
		switch(choice) {
		case 1:
			t.push();
			break;
			
		case 2:
			t.pop();
			break;
		case 3:
			t.display();
			break;
		case 4:
			System.out.println("Exiting");
			break;
	
			
			
			
		}
		}while(choice!=4);
	}
	}



