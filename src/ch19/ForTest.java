package ch19;

public class ForTest {

	public static void main(String[] args) {
		// for ��
		int count = 1;
		int sum = 0;
		for (int i=0; i< 10; i++, count++) {
			
			sum += count;
			
		}
		
		System.out.println(sum);
		// while��
		int num = 1;
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num ++;
		}
		System.out.println(total);
	}

}
/*
for �� ���� ����
for (�ʱ�ȭ�� ; ���ǽ�; ������)
{
	���๮;
	.......
}

for���� ������� ���� ����
- �ʱ�ȭ�� ���� : �̹� ������ ���� �ʱ�ȭ �Ǿ� for ���ο��� ���� ������ �ʿ䰡 ���� ���
int  i=0;
for(;i<5;i++){

}
- ���ǽ� ���� : �ݺ� ���࿡ ���� ������ ���๮ ���ο� �ִ� ���
for(i = 0;;i++){
	sum +=i;
	if(sum >200) break;
	
}
- ������ ����: �����Ŀ� ���� ������ �����ϰų� �ٸ� ������ ���� ������� �����Ǵ� ���
for(i = 0; i<5;){
	i = (++i) %10;
}
- ���� �ݺ�
for (; ;){

}
*/