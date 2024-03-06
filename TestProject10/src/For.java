
public class For {

	public static void main(String[] args) {
		// for文(ループ処理)の基礎
		//	for(初期値; 条件式; 増減式){ 
	    //		処理内容
		//	}
		
		// int i = 0 が初期値 0から始まるという意味
		// i < 3 を満たす限り ループし続けるという意味
		// i++ で、1ずつ増える という意味
		// (例)
		// for (int i = 0; i < 3; i++) { 
			// System.out.println(i);
		// }
		
		
		for (int i = 3; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for (int i = 3; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for (int i = 10; i > 5; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for (int i = 10; i >= 5; i--) {
			System.out.println(i);
		}

	}

}
