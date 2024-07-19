package modifier07_object_array;

public class StudentManager {
	
	Student[] students = new Student[100];
    int size = 0;
	
	
	private StudentManager () {}
	
	private static StudentManager studentManager = new StudentManager();
	
	public static StudentManager getInstance() {
		return studentManager;
	}
	
	
	public void addStudent(Student student) {
		if(size < 100)
		students[size++] = student;
		else System.out.println("최대 학생을 초과했습니다.");
	}
	
	public Student getStudent(String name) {
		Student result = null;
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			String sName = student.getName();
			if(sName == name) {
				return result = student;
			}
		}
		return result;
	}
}
