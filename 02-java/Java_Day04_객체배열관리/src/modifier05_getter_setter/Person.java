package modifier05_getter_setter;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private boolean hungry;
    Scanner sc = new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("음수는 입력할 수 없습니다.");
			return;
		}
		this.age = age;
	}
	public boolean isHungry() {
		return hungry;
	}
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
    
	
    
    
}
