package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "ÀÌ¼ø½Å");
		Member memberKim = new Member(1002, "±èÀ±½Å");
		Member memberKang = new Member(1003, "°­°¨Âù");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		Member memberHong = new Member(1003, "È«±æµ¿");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}

}
