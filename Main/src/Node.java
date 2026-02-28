/**
 * @author Thabang Mamoloko
 */

/**
 * Blueprint for Nodes
 */
public class Node<T> implements IPosition<T>{
	private T element;
	private Node<T> next;
	private Node<T> prev;
	/**
	 * Constructor
	 * @param element
	 * @param next
	 * @param prev
	 */
	public Node(T element, Node<T> next, Node<T> prev) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}
	/**
	 * @return the element
	 */
	public T getElement() {
		return element;
	}
	/**
	 * @param element the element to set
	 */
	public void setElement(T element) {
		this.element = element;
	}
	/**
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	/**
	 * @return the prev
	 */
	public Node<T> getPrev() {
		return prev;
	}
	/**
	 * @param prev the prev to set
	 */
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

}
