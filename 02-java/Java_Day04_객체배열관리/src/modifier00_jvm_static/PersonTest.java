package modifier00_jvm_static;

public class PersonTest {
    public static void main(String[] args) {
    	
    	System.out.println(Person.pCount);
    	Person p1 = new Person();
    	Person p2 = new Person();
    	Person.pCount = 100;
    	p1.pCount = 10;
    	p2.pCount = -10;
    	// 인스턴스를 통해서도 접근 가능하지만,
    	// 클래스 이름으로 접근하는 것을 권장한다.
    	System.out.println(Person.pCount);
    	System.out.println(p1.pCount);
    	
    }
}
