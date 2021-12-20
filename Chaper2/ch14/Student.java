package ch14;

public class Student {
		String Name;
		int money;
		
		
		public Student(String Name, int money) {
			this.Name = Name;
			this.money = money;		
		} 
		public void takeBus(Bus bus) {
			bus.take(1000);
			this.money -=1000;
		}
		public void takeSubway(Subway subway) {
			subway.take(1200);
			this.money -=1200;
		}
		public void showInfo() {
			System.out.println(Name + "´ÔÀÇ ³²Àº µ·Àº "+money+"¿ø ÀÔ´Ï´Ù.");
		}
}
/*
 °´Ã¼ °£ÀÇ Çù·Â
 */