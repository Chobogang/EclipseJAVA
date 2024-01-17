package ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {

	
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberHong = new Member(1004, "È«±æµ¿");
		Member memberLee = new Member(1001, "ÀÌ¼ø½Å");
		Member memberKim = new Member(1002, "±èÀ±½Å");
		Member memberKang = new Member(1003, "°­°¨Âù");
		
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1001, "Kim");
		hashMap.put(1002, "Lee");
		hashMap.put(1003, "Park");
		hashMap.put(1004, "Hong");
		
		System.out.println(hashMap);
		
	
	}

}
