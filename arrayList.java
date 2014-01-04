import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator{

	ArrayList<String> words = new ArrayList<String>();

	public ArrayListAndIterator(){
		words.add("Hello");
		words.add("Word");
		words.add("Bye");
	}

	public void printWords1(){
		Iterator<String> itr = words.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
