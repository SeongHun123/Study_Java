package ch11_Iterator;

public class MemberArrayListTest {
	
	public static void main(String [] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"�̼���");
		Member memberkim = new Member(1002,"������");
		Member memberkang = new Member(1003,"������");
		Member memberHong= new Member(1004,"ȫ�浿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberkim);
		memberArrayList.addMember(memberkang);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberkim.getMemberId());
		memberArrayList.showAllMember();
	}
}
