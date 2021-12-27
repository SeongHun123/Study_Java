package ch03_stringClass;

public class StringTextBlock {
	public static void main(String[] args) {
		
		String textBlocks = """
				Hello,
				hi,
				how r u""";
		
		System.out.println(textBlocks);
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
				
					<body>
						<span>example text</span>
					</body>
				</html>""";
	}
}
/*
 String TextBlock
 - 문자열을 """ """사이에 이어서 만들 수 있음
 - html, json 문자열을 만드는데 유용하게 사용할 수 있음
 */