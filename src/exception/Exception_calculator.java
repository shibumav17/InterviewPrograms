package exception;

public class Exception_calculator{
        public int divide(int a, int b){
                int result = 0;
                try{
                        result = a/b;
                } catch (Exception e){
                        System.out.println("Exception occurred : " +e);
                }
                return result;
        }

        public static void main(String[] args) {
                Exception_calculator obj = new Exception_calculator();
                int result= obj.divide(40,0);
                System.out.println("Printing result : " +result);

        }





}
