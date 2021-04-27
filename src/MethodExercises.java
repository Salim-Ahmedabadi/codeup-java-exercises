
public class MethodExercises {
    public static void main(String[] args) {
        System.out.println(Addition(2,3));
        System.out.println(Substraction(2,3));
        System.out.println(Multiplication(2,3));
        System.out.println(Division(2,3));
        System.out.println(Modulas(7,2));
//        multiplicationLoop(5,5);
        System.out.println(multiplicationLoop(5,5));

   }
    public static int Addition(int num1, int num2) {
        return num1 + num2;

    }public static int Substraction(int num1, int num2) {
        return num1 - num2;

    }public static int Multiplication(int num1, int num2){
        return num1 * num2;

    }public static int Division(int num1, int num2) {
        return num1 / num2;

   }public static int Modulas(int num1, int num2) {
            return num1 % num2;
    }
        public static int multiplicationLoop(int a, int b) {
        int result = 0;
        for (int i = 0; i < a; i++) {
            result +=b;
        }

            return result;
        }

    }




