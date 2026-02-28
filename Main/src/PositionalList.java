/**
 * @author Thabang Mamoloko
 */

/**
 * Class that contains Doubly Linked List "functionality"
 */
public class PositionalList<T> implements IPositionalList<T>{
	private int size = 0;
	private Node<T> header = null;
	private Node<T> trailer = null;
	
	/**
	 * Constructor
	 */
	public PositionalList() {
	}
	
	/**
	 * Method to check if the list is empty
	 * @return true if empty && false if not empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public IPosition<T> addFirst(T element) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<>(element, header, null);
		
		if(header == null) {
			trailer = newNode;
		}else {
			header.setPrev(newNode);
		}
		header = newNode;
		size++;
		return newNode;
	}

	@Override
	public IPosition<T> addBefore(IPosition<T> node, T element) {
		// TODO Auto-generated method stub
		Node<T> theNode = (Node<T>) node;
		if(theNode == null) {
			throw new IllegalArgumentException("Node cannot be null");
		}
		
 		Node<T> newNode = new Node<>(element, theNode.getPrev(), theNode);
		
		if(theNode.getPrev() == null) {
			theNode.getPrev().setNext(newNode);
		}else {
			header = newNode;
		}
		theNode.setNext(newNode);
		size++;
		return newNode;
	}

	@Override
	public IPosition<T> addAfter(IPosition<T> node, T element) {
		// TODO Auto-generated method stub
		Node<T> theNode = (Node<T>) node;
		if(theNode == null) {
			throw new IllegalArgumentException("Node cannot be null");
		}
		
		Node<T> newNode = new Node<>(element, theNode, theNode.getNext());
		
		if(theNode.getNext() != null) {
			theNode.getNext().setPrev(newNode);
		}else {
			trailer = newNode;
		}
		theNode.setNext(newNode);
		size++;
		return newNode;
	}

	@Override
	public T remove(IPosition<T> node) {
		// TODO Auto-generated method stub
		Node<T> theNode = (Node<T>) node;
		if(theNode == null) {
			throw new IllegalArgumentException("Node cannot be empty");
		}
		
		if(theNode == header) {
			header = header.getNext();
			if(header != null) {
				header.setPrev(null);
			}
		}else if(theNode == trailer) {
			trailer = trailer.getPrev();
			if(trailer != null) {
				trailer.setNext(null);
			}
		}else {
			Node<T> prev = theNode.getPrev();
			Node<T> next = theNode.getNext();
				
			prev.setNext(next);
			next.setPrev(prev);
		}
		size--;
		return theNode.getElement();
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		Node<T> currentNode = header;
		
		while(currentNode != null) {
			System.out.print(currentNode.getElement() + " <-> ");
			currentNode = currentNode.getNext();
		}
		System.out.println("null");
		
	}
	
}
