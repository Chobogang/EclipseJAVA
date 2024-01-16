package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2)*(-1);
	}
	
	
}

public class MemberTreeSetTest {

	public static void main(String[] args) {

		/*
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1004, "È«±æµ¿");
		Member memberLee = new Member(1001, "ÀÌ¼ø½Å");
		Member memberKim = new Member(1002, "±èÀ±½Å");
		Member memberKang = new Member(1003, "°­°¨Âù");
		
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		memberTreeSet.showAllMember();
		*/
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		System.out.println(set);
	}

}
