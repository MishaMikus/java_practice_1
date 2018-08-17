package java_basics.hw_3;

import java.util.Scanner;

/*
5. input some value. if value  < 0 - throw runtime exception with custom message, else output SQRT for that
*/
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
