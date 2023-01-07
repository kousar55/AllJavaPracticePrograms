package conditional_statements;

public class ForLoop {
    public static void main(String args[])
    {
        //write numbers from range 1.....100
        /*
        for(int i=100;i>=1;i--)
        {
            System.out.println("Value of i is: "+i);
        }




        String[] cars={"Volvo","BMW","FORD","MAZDA","BENZ"};
        for(String j : cars){
            System.out.println("name of car is: "+j);
        }

        int i=0;
        while(i<5){
            System.out.println("value of i is:"+i);
            i++;
        }
        */

        //Do....While loop
        int i=0;
        do{
            System.out.println("Value of i is:"+i);
            i++;
        }while(i<5);
    }
}
