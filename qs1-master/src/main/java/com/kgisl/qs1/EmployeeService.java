package com.kgisl.qs1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {

	
     Scanner in=new Scanner(System.in);	
     int empid=1;
	ArrayList<Employee> list=new ArrayList<Employee>();
	String[] options= {"Add employee","Delete Employee","Update Employee","Search Employee","Show all Employees"};
	String[] empAttributes= {"empId","name","Department","salary"};
	public void empCrud() 
	{
		int num=1;
		System.out.println("Enter your chooise number");
		for(int i=0;i<options.length;i++)
			{
					System.out.println(num+"."+options[i]);
					num++;
			}
			System.out.println();
			int input=in.nextInt();
			operations(input);
	}
	
	
	public void operations(int input){
		
		switch(input){
        case 1:
            save();
            empCrud();
            break;
        case 2:
        	delete();
        	empCrud();
        	break;
        case 3:
        	update();
        	empCrud();
        	break;
        case 4:
        	searchEmp();
        	empCrud();
        case 5:
        	showEmpAll();
        	empCrud();
        	break;
          default:
            System.out.println("Exiting program");
            return;
        }
		
		
		
	}
	
	void save()
	{
		Employee obj=new Employee();
		System.out.println("Enter the employee details");
		System.out.println(empAttributes[0]);
		System.out.println(empid);
		obj.setEmpid(empid);
		System.out.println(empAttributes[1]);
		obj.setName(in.next());
		System.out.println(empAttributes[2]);
		obj.setDept(in.next());
		System.out.println(empAttributes[3]);
		obj.setSalary(in.nextFloat());
		list.add(obj);
		empid=empid+1;
		System.out.println("Added sucessfully");
		System.out.println();
		
	}

	void delete()
	{
		System.out.println("------------");
		System.out.println("Enter employee id:");
		System.out.println(list.remove(in.nextInt()-1));
		System.out.println("Deleted");
		System.out.println("-------------");
	}
	
	void update()
	{
		Employee emp=new Employee();
		System.out.println("------------");
		System.out.println("Enter employee id for update:");
		int id=in.nextInt();		
		empUpdate(id);  		
		System.out.println("------------");
	}
	
	void showEmpAll()
	{
		System.out.println("Employee List");
		if(list.size()!=0)
		{
		for(Employee str:list)
				{
					System.out.println("----------------");
					System.out.println("Emp-id:"+str.getEmpid());
					System.out.println("Name:"+str.getName());
					System.out.println("Department:"+str.getDept());
					System.out.println("Salary:"+str.getSalary());					
					System.out.println("----------------");
				}
		}
		else
		{
			System.out.println("Empty");
		}
				
	}
	
	void empUpdate(int id)
	{
		int num=1;
		
		for(int i=1;i<empAttributes.length;i++)
		{
				System.out.println(num+"."+empAttributes[i]);
				num++;
		}

		id=id-1;
		Employee emp=new Employee();
		emp.setEmpid(list.get(id).getEmpid());
		emp.setName(list.get(id).getName());
		emp.setDept(list.get(id).getDept());
		emp.setSalary(list.get(id).getSalary());
		System.out.println("Which field you want update:");
		int input=in.nextInt();
		switch (input) {
				case 1:
					  
					  System.out.println("Enter the new name");
					  emp.setName(in.next());
					  break;
				case 2:
					  
					  System.out.println("Enter the new department");
					  emp.setDept(in.next());	
					  break;
					  
				case 3:
					  
					  System.out.println("Enter the new department");
					  emp.setDept(in.next());
					  break;
				case 4:
					  
					  System.out.println("Enter the new salary");
					  emp.setSalary(in.nextFloat());
					  break;
				default:
					break;
				}
		list.set(id, emp);
		System.out.println("Updated");
		empCrud();
		}
	
	void searchEmp()
	{
		System.out.println("---------------");
		System.out.println("Enter the employee id");
		int id=in.nextInt()-1;		
		System.out.println("Emp-id:"+list.get(id).getEmpid());
		System.out.println("Name:"+list.get(id).getName());
		System.out.println("Department"+list.get(id).getDept());
		System.out.println("Salary:"+list.get(id).getSalary());
		System.out.println("---------------");
	}
}
