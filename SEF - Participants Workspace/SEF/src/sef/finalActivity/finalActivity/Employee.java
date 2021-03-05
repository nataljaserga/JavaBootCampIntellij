package finalActivity;

public class Employee {
    //Attributes
    private String name;
    private int age;
    private String jobTitle;
    private String company;
    private int salary;

    public Employee(String name, int age, String jobTitle, String company, int salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void introduce() {
        System.out.println("My name is "+this.name+" and i am "+this.age+" years old");
        System.out.println("I am work as "+this.jobTitle+" in "+this.company);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
