package finalActivity;

public class FirstActivity {
    public static void main(String[] args) throws Exception {
        Employee em1 = new Employee("John", 34, "broker", "ABC Bank", 2500);
        Employee em2 = new Employee("Marta", 25, "florist", "Flower planet", 1000);
        Employee em3 = new Employee("Bob", 45, "mechanic", "Cars LTD", 3500);

        System.out.println("-----------------------------");
        em3.introduce();
        System.out.println("-----------------------------");
        em1.introduce();
        System.out.println("-----------------------------");
        em2.introduce();



        Person p = new Person("Ivan3", 40);
        System.out.println("-----------------------------");
        p.introduce();

        try {
            System.out.println(p.checkName());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
