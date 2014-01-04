// Elements a[0]..a[length-1] will be sorted.
public void directInsert(int[] a)
{
	int elt;
	int j;

	for(int i = 1; i < a.length; i++) {
		elt = a[i];	// next elt for insert
		j = i;		//a[0]..a[j-1] already sorted
		
		while((j > 0) && (a[j-1] > elt)) {
			a[j] = a[j-1];	// shift right
			j--;			// go further left
		}
		
		a[j] = elt;		// insert elt
	}	// a[0]...a[j] sorted
}
