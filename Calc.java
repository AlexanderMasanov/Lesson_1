
public class Calc {

    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int result = 1;
        char sign = '+';

        if (sign == '+') {
            result = a + b;

        } else if (sign == '-') {
            result = a - b;

        } else if (sign == '*') {
            result = a * b;

        } else if (sign == '/') {
            result = a / b;

        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result = result * a;
            }

        } else if (sign == '%') {
            result = a % b;
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
