package finalActivity;

public class Person {
    //Attributes
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {

        System.out.println("My name is "+this.name+" and i am "+this.age+" years old");
    }
    public String checkName() throws Exception {
        if (this.name.matches(".*\\d.*") == false) {
            return "OK";
        }
        else {
            throw new Exception("Not acceptable name! "+this.name+" contains numbers");
        }
    }
}
