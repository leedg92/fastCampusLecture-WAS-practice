package Calculator;



public class Calculator {


    public static int calculate(int num1, String operator, int num2) {
        int result = 0;
        switch (operator) {
            case "+":
                result = (num1 + num2);
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;

        }

        return result;

    }
}