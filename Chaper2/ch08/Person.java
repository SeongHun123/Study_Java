package ch08;

public class Person {
		public int stature;
		public int weight;
		public String Name;
		
		
		public Person(int stature, int weight, String Name) {
			this.stature = stature;
			this.weight = weight;
			this.Name = Name;	
		}
		public String ShowInfo() {
			return "이 사람의 이름은"+Name+"이고, 키는"+stature+"이고, 몸무게는"+weight+"입니다.";
		}
		
}
