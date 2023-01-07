package conditional_statements;

public class OperatorsUnery {
    public static void main(String args[]){
        int a=25;
        int b=20;
        int c=30;
        int time=25;
        //System.out.println((a++) + (++a));
        //System.out.println(b+b++);
        if(time<25)// 25<20 (false)
        {
            System.out.println("Good day");
        }
        else if(time>25)
        {
            System.out.println("Good Evening");
        }
        else if(time==25)
        {
            System.out.println("25==25");
        }
        else
        {
            System.out.println("default case");
        }

    }
}
