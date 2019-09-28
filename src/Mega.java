import java.util.Arrays;

public class Mega<Item> implements Comparable<Item> {
	private Item a[];
	Item aux[];

	public Mega(Item[] a) {
		this.a = a;
	}

	public void Sort() {
		aux = (Item[]) new Object[a.length];
		isSort(a, 0, a.length - 1);
	}

	private void isSort(Item[] a2, int left, int right) {
		if (left == right)
			return;
		int mid = left + (right - left) / 2;
		isSort(a, left, mid);
		isSort(a, mid + 1, right);
		merg(a, left, mid, right);
		Assert(left, right);
	}

	private void merg(Item[] a2, int left, int mid, int right) {

		int i = left;
		int j = mid + 1;
		for (int k = left; k <= right; k++) {
			if (i > mid)
				aux[k] = a[j++];
			else if (j > right) {
				Item t = a[i++];
				aux[k] = t;
			} else if (less(a[j], a[i]))
				aux[k] = a[j++];
			else
				aux[k] = a[i++];

		}

	}

	boolean less(Item a2, Item a3) {
		int q = ((Comparable<Item>) a2).compareTo(a3);
		return q <= 0;		
	}

	private void Assert(int left, int right) {
		for (int i = left; i <= right; i++)
			a[i] = aux[i];

	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
