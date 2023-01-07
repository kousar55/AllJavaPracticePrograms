package METHOD_OVERLOADING;
class EmpInfo{
    int id=1;
    String name="Simplilearn";
    void display(){
        System.out.println(id+" "+name);
    }
}
public class Sample_class{
public static void main(String args[]){
    EmpInfo emp1=new EmpInfo();
    EmpInfo emp2=new EmpInfo();
    emp1.display();
    emp2.display();
}
}
