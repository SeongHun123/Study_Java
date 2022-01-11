package ch06;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringComcatImpl strImpl = new StringComcatImpl();
		strImpl.makeString(s1, s2);
		
		//람다식으로 구현
		StringConcat concat = (s, v)->System.out.println(s+","+v);
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println(s1+"....."+s2);
			}
		};
		
		concat2.makeString(s1, s2);
	}

}
