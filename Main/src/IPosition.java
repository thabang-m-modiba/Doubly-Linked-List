/**
 * @author Thabang Mamoloko
 */

/**
 * Interface for the List
 */
public interface IPosition<T> {
	IPosition<T> addFirst(T element);
	IPosition<T> addBefore(IPosition<T> node, T element);
	IPosition<T> addAfter(IPosition<T> node, T element);
	T remove(IPosition<T> node);
	void printList();

}
