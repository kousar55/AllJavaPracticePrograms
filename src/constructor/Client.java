package constructor;

class Default_constructor {
    Default_constructor() {
        System.out.println("I am in default constructor");
    }

    Default_constructor(int a) {
        int A = a;
        System.out.println("I am in parameterized one and A=" + A);
    }
}

 public class Client{
    public static void main(String args[]) {
        Default_constructor d = new Default_constructor();
        Default_constructor d1 = new Default_constructor(5);
    }
}
