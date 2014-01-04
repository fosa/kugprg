public static int quickSearch(String a, String p)
{ 
	final int range = 256	// ASCII-Werte
	int n = a.length();	// Länge der Zeichenfolge
	int m = p.length();	// länge des Pattern
	int[] shift = new int[range];	// Shiftarray anlegen

	// Initialisierung des Shiftarray
	for(int i = 0; i < range; i++){
		shift[i] = m + 1;
	}

	// Anpassung des Shiftarray
	for(int i = 0; i < m; i++){
		shift[p.charAt(i)] = m-i;
	}

	// Eigentliche Suche
	int i1 = 0;	// Position vom Beginn der zu 
			// vergleichenden Zeichenfolge zu 
			// Patternstart

	int i2 = 0;	// Position relativ zum Pattern
			// d.h. absolute Position der 
			// Zeichefolge = i1 + i2

	int j = 0;	// Position im Pattern

	do{
		if(a.charAt(i1+i2) == p.charAt(j)){	// Übereinstimmung
			i2++;	// Nächstes Zeichen in Zeichenfolge
			j++;	// und im Pattern
		}
		else{
			if((i1+m) < n){	// hat das Pattern noch Platz?
				i1 = i1 + shift[a.charAt(i1+m)];
				i2 = 0;
				j = 0;
			}
			else{
				break;	// kein Platz - ENDE!
			}
		}
	}while((j<m) && ((i1+m) <= n));

	if(j==m)
		return i1;
	else
		return -1;
}

