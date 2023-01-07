package getter_setter;
class person{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;

    }
}
public class Methods {

    public static void main(String args[]){
        person p =new person();
        p.setAge(23);
        p.setName("Simplilearn");
        String n=p.getName();
        System.out.println("My Name is "+n+" and age is "+p.getAge());
    }
}
