package Class4;

public class IfElseConditionDemo4 {
    public static void main(String[] args) {

        int number1=10;
        int number2=10;
        /*
        if number 1 is equal to number2 on console => are equal
        if num1>num2 => num1 is greater than num2
        if num2 >num1 =>num2 is greater than num1
         */
        if (number1==number2) {
            System.out.println("numbers are equal");
        }else if( number1>number2){
            System.out.println("number1 is greater than number2");
        }else if (number2>number1){
            System.out.println("Number2 is greater than Number1");
        }
    }
}
