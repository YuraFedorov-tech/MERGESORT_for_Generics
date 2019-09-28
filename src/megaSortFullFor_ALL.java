import java.util.Arrays;

public class megaSortFullFor_ALL {

	public static void main(String[] args) {
		Integer a[] = { 5, 1, 6, 3, 100, -1000, 0, 2 };
	
		System.out.println(Arrays.toString(a));
		Mega<Integer> q = new Mega<Integer>(a);
		q.Sort();
		System.out.println(Arrays.toString(a));
		
		
		
		String z[] = { "n","f","a","b"};
		System.out.println(Arrays.toString(z));		
		Mega<String> qq = new Mega<String>(z);
		qq.Sort();	
		System.out.println(Arrays.toString(z));
	}

}
