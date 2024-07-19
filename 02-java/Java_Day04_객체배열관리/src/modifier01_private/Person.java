package modifier01_private;

public class Person {
    private String name;
    private int age;
    
    public void info() {
    	name = "1";
    	age = 1;
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }
}
