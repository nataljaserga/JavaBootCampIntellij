package finalActivity;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SecondActivity {
    public static class Calculator {
        

        public static void main(String[] args) {

            int x = 10;
            int y = 5;

            System.out.println("Addition - " + add(x, y));
            System.out.println("Subtraction - " + subtract(x, y));
            System.out.println("Multiply - " + multiply(x, y));
            System.out.println("Divide - " + divide(x, y));

        }


        private static int add(int x, int y) {
            int sum = x + y;
            return sum;
        }

        private static int subtract(int x, int y) {
            int sub = x - y;
            return sub;
        }

        private static int multiply(int x, int y) {
            int mul = x * y;
            return mul;
        }

        private static int divide(int x, int y) {
            if (y == 0) {
                System.out.println("ERROR divided by zero");
                return 0;
            } else {
                return x / y;
            }


        }


@Test
        public void testGetSum() {

            int x = 10;
            int y = 5;
            //	Checks the sum of two (2) positive values
            assertEquals(15, (Calculator.add(x,y)));
            assertEquals(15, (Calculator.add(y,x)));

            x = -5;
            y = 10;
            //	Checks the sum of a positive value and a negative value
            assertEquals(5, (Calculator.add(x,y)));
            assertEquals(5, (Calculator.add(y,x)));

            x = -5;
            y = -10;
            //	Checks the sum of two (2) negative values
            assertEquals(-15, (Calculator.add(x,y)));
            assertEquals(-15, (Calculator.add(y,x)));
        }
        @Test
        public void testGetDifference() {

            int x = 3;
            int y = 2;
            //	Checks if b is lesser than a
            assertEquals(1, (Calculator.subtract(x,y)));
            //	Checks if b is greater than a
            assertEquals(-1, (Calculator.subtract(y,x)));

            x = 5;
            y = -4;
            //	Checks if negative value is subtracted from positive value
            assertEquals(9, (Calculator.subtract(x,y)));
            //	Checks if positive value is subtracted from negative value
            assertEquals(-9, (Calculator.subtract(y,x)));

            x = -10;
            y = -5;
            //	Checks if negative value is subtracted from negative value: x > y
            assertEquals(-5, (Calculator.subtract(x,y)));
            //	Checks if negative value is subtracted from negative value: y < x
            assertEquals(5, (Calculator.subtract(y,x)));
        }
@Test
        public void testGetProduct() {

            int x = 5;
            int y = 10;
            //	Checks the product of two (2) positive values
            assertEquals(50, (Calculator.multiply(x,y)),0);
            assertEquals(50, (Calculator.multiply(y,x)),0);

            x = -5;
            y = 10;
            //	Checks the product of a positive value and a negative value
            assertEquals(-50, (Calculator.multiply(x,y)),0);
            assertEquals(-50, (Calculator.multiply(y,x)),0);

            x = -3;
            y = -10;
            //	Checks the product of two (2) negative values
            assertEquals(30, (Calculator.multiply(x,y)),0);
            assertEquals(30, (Calculator.multiply(y,x)),0);
        }
@Test
        public void testGetQuotient() {

            int x = 10;	int y = 5;
            //	Checks if y is lesser than x
            assertEquals(2, (Calculator.divide(x,y)),0);
            //	Checks if y is greater than x
            assertEquals(0.5, (Calculator.divide(y,x)),0);

            x = 9;	y = -3;
            //	Checks if positive value is divided with negative value
            assertEquals(-3, (Calculator.divide(x,y)),0);
            //	Checks if negative value is divided with positive value
            assertEquals(-0.33, (Calculator.divide(x,y)),0.007);

            x = -10;	y = -5;
            //	Checks if negative value is divided with negative value: x > y
            assertEquals(2, (Calculator.divide(x,y)),0);
            //	Checks if negative value is divided with negative value: y < x
            assertEquals(0.5, (Calculator.divide(y,x)),0);
        }
@Test
        public void testThrowException(){

            try {

                Calculator.add(2, 1);
                Calculator.subtract(3, 3);
                Calculator.multiply(0, 1);
                Calculator.divide(1, 0);
                new Calculator();

            } catch (Exception e) {
                fail();
            }
            catch (Error e) {
                fail();
            }
        }
        private void fail() {
        }
    }

}


