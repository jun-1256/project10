
public class For2 {

	public static void main(String[] args) {
		// for文(ループ処理)の基礎
		
		//2ずつ増える
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//3ずつ増える
		for (int i = 1;	i < 10;	i+=3) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//2ずつ減少
		for (int i = 10; i > 1; i-=2) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//3ずつ減少
		for (int i =10; i > 1; i-=3) {
			System.out.println(i);
		}

	}

}
