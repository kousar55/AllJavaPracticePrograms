import java.net.PortUnreachableException;

public class Dog {
    String name,type,color;
    int age;

    public Dog(String name, String type, String color, int age) {
        super();
        this.name = name;
        this.type = type;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Hi may name is"+this.getName()+"\n My breed ,age and color are"+this.getType()+","+this.getAge()+","+this.getColor();
    }

    public static void main(String args[]){
        Dog d=new Dog("Dod","Batta","Gray",5);
        System.out.println(d.toString());
    }
}
