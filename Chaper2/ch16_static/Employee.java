package ch16_static;

public class Employee {
	//기준이 되는 변수
	private static int serialNum = 1000;
	
	private int empolyeeId;
	private String empolyeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		empolyeeId = serialNum;
	}
	//기준이되는 사원번호를 확인하는 메서드 확인은 할수있지만 변경은 불가능 set이없기 때문
	//일반 메서드안에서 static변수는 사용이 가능하지만 static변수에서 인스턴스변수 사용하는건 불가능 메모리 문제때문에
	public static int getSerialNum() {
				
		return serialNum;
	}


	public int getEmpolyeeId() {
		return empolyeeId;
	}
	public void setEmpolyeeId(int empolyeeId) {
		this.empolyeeId = empolyeeId;
	}
	public String getEmpolyeeName() {
		return empolyeeName;
	}
	public void setEmpolyeeName(String empolyeeName) {
		this.empolyeeName = empolyeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
/*
 여러 인스턴스에서 공통으로 사용하는 변수 선언 -static 변수
 공통으로 사용하는 변수가 필요한 경우
 - 여러 인스턴스가 공유하는 기준 값이 필요한 경우
 - 학생마다 새로운 학번 생성
 - 카드회사에서 카드를 새로 발급할때마다 새로운 카드 번호를 부여
 - 회사에 사원이 입사할때 마다 새로운 사번이 필요
 
 static 변수 선언과 사용하기
 - 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
 - 클래스 변수, 정적변수라고도함
 - 인스턴스 생성과 상관 없이 사용 가능하므로 클래스 이름을 직접 참조
 
 static메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다.
 -static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있음
 - 인스턴스 생성 전에 호출 될 수 있으므로 static메서드 내부에서는 인스턴스 변수를 사용할 수 없음
 
 
변수의 유효 범위와 메모리
지역 변수(로컬 변수) - 함수 내부에 선언 - 함수 내부에서만 사용 - 스택 - 함수가 호출될 때 생성되고 함수가 끝나면 소멸
멤버 변수(인스턴스 변수) - 클래스 멤버 변수로 선언 - 클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능 - 힙
- 인스턴스가 생성 될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할때 소멸
static 변수(클래스 변수) - static 예약어를 사용하여 클래스 내부에 선언 
-클래스 내부에서 사용하고 private이 아니면 클래스이름으로 다른 클래스에 서 사용 가능 
- 데이터 영역 - 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할때 소멸

! static변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
! 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음
! 멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리가 할당 됨
! 상황에 적절하게 변수 사용

 */