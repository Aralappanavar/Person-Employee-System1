import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Person {
    private String name;
    private Date dob;
    private int age;
    public Person(String name,String dob,int age) throws ParseException{
        this.name=name;
        this.dob=new SimpleDateFormat().parse(dob);
        this.age=age;
    }
    public void printDetails(){
        System.out.println("Name :"+name);
        System.out.println("DOB :"+dob);
        System.out.println("age :"+age);
    }
    public static void main(String[] args) throws ParseException{
        Person p1=new Person("Alice", "01-01-2000", 20);
        p1.printDetails();
    }
}