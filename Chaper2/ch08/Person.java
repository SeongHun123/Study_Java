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
			return "�� ����� �̸���"+Name+"�̰�, Ű��"+stature+"�̰�, �����Դ�"+weight+"�Դϴ�.";
		}
		
}
