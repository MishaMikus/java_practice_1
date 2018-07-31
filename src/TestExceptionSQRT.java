import java.util.Scanner;

//HW_3_5
public class TestExceptionSQRT {

    public static void main(String[] args) {
        System.out.print("value=");
        double value = Double.parseDouble(new Scanner(System.in).nextLine());
        if(value>0){
            System.out.println("sqrt("+value+")="+Math.sqrt(value));
        }else{
            throw new RuntimeException("can't get SQRT for value "+value);
        }
    }

}
