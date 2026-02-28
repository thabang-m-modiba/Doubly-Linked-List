/**
 * @author Thabang Mamoloko
 */

/**
 * 
 */
public interface IPositionalList<T> {
	IPosition<T> addFirst(T element);
	IPosition<T> addBefore(IPosition<T> node, T element);
	IPosition<T> addAfter(IPosition<T> node, T element);
	T remove(IPosition<T> node);
	void printList();
}
