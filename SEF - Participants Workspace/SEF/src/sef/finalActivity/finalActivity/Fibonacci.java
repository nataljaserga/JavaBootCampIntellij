package finalActivity;

public class Fibonacci {
        public static void main(String[] args) {

                int n = 11;
                //For example if user put 7 -> 0 1 1 2 3 5 8. if user put 10 -> 0 1 1 2 3 5 8 13 21 34

                int first = 0;
                int second = 1;
                int t;
                for(int i = 0; i < n; i++) {
                        System.out.print(first+" ");
                        t = first;
                        first = second;
                        second += t;
                }
        }
}
