package ch09_error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
/*
 try-catch-finally
 - finally ������ ������ �ݰų� ��Ʈ��ũ�� �ݴ� ���� ���ҽ� ���� ������ ��
 - try{}���� ����Ǵ� ��� finally{}���� �׻� ���� ��
 - ���� ���� ���� ���� �ִ� ��� ������ ���ҽ��� �������� �ʰ� finally ��Ͽ��� �����ϵ��� ����
 - �����Ϸ��� ���� ���ܰ� ó�� �Ǵ� ��
 */