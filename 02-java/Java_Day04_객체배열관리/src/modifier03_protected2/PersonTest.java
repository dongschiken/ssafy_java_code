package modifier03_protected2;

import modifier03_protected.Person;

// 다른 패키지는 안된다.
public class PersonTest extends Person {
    public static void main(String[] args) {
        Person p = new Person();
        PersonTest persont = new PersonTest();
        persont.age = 10;
        persont.name = "1";
        System.out.println(persont.age);
        System.out.println(persont.name);
        
    }
}
