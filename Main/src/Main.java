/**
 * @author Thabang Mamoloko
 */

/**
 * The main class
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionalList<String> list = new PositionalList<String>();
		
		IPosition<String> p1 = list.addFirst("A");
		list.printList();
	}

}
