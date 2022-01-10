package ch12_set;

import java.util.HashSet;
import java.util.Iterator;



public class MemberHashSet {
	private HashSet<Member> hashSet;

	public MemberHashSet(){
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member){
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId){

		Iterator<Member> ir = hashSet.iterator();
		
		while( ir.hasNext()){
			Member member = ir.next();
			int tempId = member.getMemberId();
			if( tempId == memberId){
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){
		for(Member member : hashSet){
			System.out.println(member);
		}
		System.out.println();
	}
}
/*
HashSet 클래스
- Set 인터페이스를 구현한 클래스와
- 멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야함
- 동일성 구현을 위해 필요에 따라 equals()와 hashcode() 메서드를 재정의함
 */
