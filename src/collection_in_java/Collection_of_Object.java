package collection_in_java;

import java.util.Scanner;

class Employee{
    int id;
    String name;
    float salary;
    Employee(int i,String s,float sal){
        id=i;
        name=s;
        salary=sal;
    }
    void display(){
        System.out.println("id="+id+" name="+name+" salary="+salary);
    }

}


class Collection_of_object{

    public static void main(String args[]){
        Employee e[]=new Employee[5];    //array object of employee class
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter Data for " +(i+1)+"emplyee");
            System.out.println("id:");
            int id=sc.nextInt();     //getting id from user

            System.out.println("name:");
            String nam=sc.next();     //getting name

            System.out.println("Salary:");
            Float f=sc.nextFloat();    //getting salary

            e[i]=new Employee(id,nam,f);   //initializing obj with current variables

        }

        System.out.println("Employee data is =");
        for(int i=0;i<5;i++){
            e[i].display();    //displaying value of employee
        }

    }
}
