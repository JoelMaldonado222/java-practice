package phase1;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main (String[] args){

        /* 
        This Project goal is to build a calculator. Helping practice swtich methods in Java.
        */


       
            //Import a scanner
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result= 0; 
        boolean validOperator= true;


       System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
            num2 = scanner.nextDouble();

            switch(operator) {
                case '+' -> result = num1 + num2;
                  case '-' -> result = num1 - num2;
                  case '*' -> result = num1 * num2;
                  case '/' -> {
                    if(num2 == 0){
                        System.out.println("Can not divide by zero! ");
                        validOperator =false;
                    }
                    else{
                        result = num1 / num2;
                    }
                  }
                  case '^' -> result = Math.pow(num1,num2);
                

                default -> {System.out.println("Invalid Operator");
                validOperator = false;}
            
            }
           
            if(validOperator){
                System.out.println(result);
            }

    scanner.close();
    }
}
