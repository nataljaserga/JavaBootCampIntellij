package activity;

public class AbstractionActivity {


    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.setColor("white");
        rec.setBreadth(6.0);
        rec.setLength(5.0);

        System.out.println("-----------------------------");
        System.out.println("Rectangle's color is   : " + rec.getColor());
        System.out.println("Rectangle's area is   : " + rec.calculateArea());
        System.out.println("Rectangle's perimeter is   : " + rec.calculatePerimeter());








    }





}
