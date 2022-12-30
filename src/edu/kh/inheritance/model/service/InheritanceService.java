package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {
	
	public void ex1() {
		// 상속확인
		// - Person을 상속받은 Student가 Person의 필드, 메소드를 사용할 수 있는가?
		
		Person p = new Person();
		
		// p.name = "홍길동"; // private 직접접근불가!!
		p.setName("홍길동"); // setter로 들어가서 this로 들어간뒤 private에 들어감
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());

		System.out.println("===========================================");
		
		// Student 객체 생성
		Student std = new Student(); 
		
		// Student만의 고유한 메소드
		std.setGrade(3);
		std.setClassroom(5);
		
		// Person 클래스로부터 상속받은 메서드
		std.setName("고길동");
		std.setAge(50);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassroom());
		
		// Student가 Person의 메소드 뿐 아니라, 필드도 상속 받았는지 확인
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("=================================");
		
		p.breath();
		std.move();
		
		Employee emp = new Employee();
		emp.move();
	}
	
	public void ex2() {
		// super() 생성자 사용 방법
		Student std = new Student("김철수", 17, "한국", 1, 3);
		// 이렇게 치면 1, 3 만 들어옴
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassroom());
	}
	
	public void ex3() {
		Person p = new Person("김은진", 100, "한국");
		
		// toString() 오버라이딩 테스트
		
		System.out.println(p.toString());
		System.out.println(p);
		// print 구문 수행 시 참조변수 명을 작성하면
		// 자동으로 toString()메소드를 호출해서 출력한다!
		
		// super 참조변수 테스트
		Student std = new Student("이백점", 18, "미국", 2, 6);
		System.out.println(std.toString());
		// 부모 + 자식이 같이 나오는거
		
		Employee emp = new Employee("김근로", 26, "한국", "00증권");
		System.out.println(emp);
	}
}