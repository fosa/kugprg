import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator{

	ArrayList<String> words = new ArrayList<String>();

	public ArrayListAndIterator(){
		words.add("Hello");
		words.add("Word");
		words.add("Bye");
	}

	// Iterieren mit Iterator
	public void printWords1(){
		Iterator<String> itr = words.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	// Iterieren mit for-loop
	public void printWords2(){
		for(int i = 0, n = words.size(); i < n; i++){
			System.out.println(words.get(i));
		}
	}

	// Iterieren mit for-each
	public void printWords3(){
		for(String s : words){
			System.out.println(s);
	}
}
