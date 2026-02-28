/**
 * @author Thabang Mamoloko
 */

/**
 * 
 */
public interface IPositionalList<T> {
	IPositionalList<T> addFirst(T element);
	IPositionalList<T> addBefore(IPositionalList<T> node, T element);
	IPositionalList<T> addAfter(IPositionalList<T> node, T element);
	T remove(IPositionalList<T> node);
	void printList();
}
