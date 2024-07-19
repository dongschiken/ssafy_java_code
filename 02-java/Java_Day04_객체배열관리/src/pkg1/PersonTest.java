package pkg1;

import pkg1.pkg2.pkg3.Person;

public class PersonTest {
    public static void main(String[] args) {
        
    	Person p = new Person();
    	pkg1.pkg2.Person person = new pkg1.pkg2.Person();
    	System.out.println(p.pkg);
    	System.out.println(person.pkg);
    	
    }
}
