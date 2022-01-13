package ch09_error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling2 {

	public static void main(String[] args) {
	
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
			System.out.println("read");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
/*
try-with-resources ��
- ���ҽ��� ����ϴ� ��� close() ���� �ʾƵ� �ڵ����� ���� �ǵ��� ��
- �ڹ� 7���� ��� ����
- ���ҽ��� try ���ο��� ����
- close()�� ��������� ȣ������ �ʾƵ� try{}��Ͽ��� ���� ���ҽ��� �������� ��쳪 ���ܰ� �߻��� ��� ��� �ڵ� ����
- �ش� ���ҽ� Ŭ������ AutoCloseable�� �����ϰ� ����
- �ڹ� 9 ���� ���ҽ��� try()�ܺο��� �����ϰ� �������� try(obj)�� ���� ����� �� ����
 */