package ch13_TreeSet;


import java.util.Iterator;
import java.util.TreeSet;



public class MemberTreeSet {

	private TreeSet<Member> treeSet;

	public MemberTreeSet(){
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member){
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId){
		
		Iterator<Member> ir = treeSet.iterator();
		
		while( ir.hasNext()){
			Member member = ir.next();
			int tempId = member.getMemberId();
			if( tempId == memberId){
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember(){
		for(Member member : treeSet){
			System.out.println(member);
		}
		System.out.println();
	}
}
/*
TreeSet 클래스 활용하기
- 객체의 정렬에 사용되는 클래스
- Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬
- 내부적으로 이진검색트리로 구현
- 비교 대상이 되는 개체에 Comparable이나 Comparator 인터페이스를 구현 해야 TreeSet애 추가 될 수 있음
- String, Integer등 jdk의 많은 클래스들이 이미 Comparable구현했음
*/
