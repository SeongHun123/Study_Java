package ch03_stringClass;

public class StringTest2 {

	public static void main(String[] args) {
		String java  = new String("java");
		String android = new String("android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(android));
	}

}
/*
 위에 처럼 연결하면 메모리가 낭비되기때문에 String buffer나 StringBuilder를 이용
 */
