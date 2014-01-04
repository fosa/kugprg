// New: Only elements a[1]..a[length-1] will be sorted!
public void directInsert2(int [] a){
	int elt;
	int j;

	for(int i = 2; i < a.length; i++) {
		elt = a[i];		// next elt for insert
		a[0] = elt;		// dummy-element
		j = i;			//a[1]..a[j-1] already sorted

		while(a[j-1] > elt) {
			a[j] = a[j-1];	// shift right
			j--;			// go further left
		}

		a[j] = elt;		// insert elt
	}	// a[1]...a[j] sorted
}
