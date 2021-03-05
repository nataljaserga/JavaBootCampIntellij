package finalActivity;

public class ThirdActivity {
    public static void main(String[] args) {

        Person pp = new Person("Ivan3", 40);

        try {
            pp.checkName();
        } catch (Exception e) {
            System.out.println("Name is acceptable");
        }
    }
}
