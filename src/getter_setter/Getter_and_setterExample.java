package getter_setter;


class Employee{
    private int id;
  private String name;
    public void setName(String name){
        this.name=name;   //this used to address current variable and to access private variable
    }
    public String getName(){
        return name;
    }
    public void setId(int i)
    {
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class Getter_and_setterExample {
    public static void main(String args[]){
        Employee e=new Employee();
        e.setId(2);
        e.setName("Master blaster");
        String s=e.getName();
        System.out.println("My name is "+s+" and Id is "+e.getId());
    }
}
