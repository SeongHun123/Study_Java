package ch10_templitMethod;

public class TemlitMethodPattern {

}
/*
 템플릿 메서드
 - 추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
 - final로 선언하여 하위 클래스에서 재정의 할 수 없게함
 - 프레임워크에서 많이 사용되는 설계 패턴
 - 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 흐름을 정의 하고 하위 클래스에서
 	다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현 하도록 함
 */