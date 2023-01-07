package conditional_statements;

public class JumpStmts {

    public static void main(String args[]){
        for(int i=0;i<10;i++){
            if(i==4){
                continue;  //or break
            }
            System.out.println(i);
        }
    }
}
//break will tearminate entire loop and come out of the execuation

//continue will skip only given position and continues its next iteration