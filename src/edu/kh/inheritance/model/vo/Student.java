package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// extends
	// Student 클래스에 Person 클래스 내용을 확장한다.
	// == Student클래스에 Person 클래스 내용(속성, 기능)이 추가됨.
					
	//private String name;
	//private int age; 
	//private String nationality; // Person클래스의 이름나이국적이 겹침, 중복코드__상속필요
	
	
	private int grade; // 학년
	private int classroom; // 반
	
	public Student() { // 기본생성자
		// Student() 객체 생성시
		// 내부에 상속받은 Person 객체를 생성하기 위한
		// Person 생성자 호출 코드가 필요하다!!!
		
		// Person(); // 자바에서 오류
		super(); // super()생성자
				// 부모의 생성자를 호출하는 코드
				// 반드시 자식 생성자 최상단에 작성!
				//이걸 이용해 Person클래스의 기본생성자 Person을 받아옴
		
				// * super() 생성자 미작성시
				// 컴파일러가 컴파일 단계에서 자동으로 추가해줌
	} 
	
	// 매개변수 생성자 alt+shift+s
	public Student(String name, int age, String nationality, int grade, int classroom) {
		//this.name = name;
		//this.age = age;
		//this.nationality = nationality;
		super(name, age, nationality);
		this.grade = grade;
		this.classroom = classroom;
		
		// super() 생성자
		// 1. 자식 내 부모객체 생성
		// 2. 부모객체 생성 시 초기화
	}

	// 메소드
	// getter / setter
	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	} */

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	// toString 오버라이딩
	@Override
	public String toString() {
		// super 참조변수
		return super.toString() + "/" + grade + "/" + classroom;
	}
}
