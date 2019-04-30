/**
 * Robert Flores 2016313
 * Johan Quiroz 2016337
 */
public class Node<E> {

    // This will be the data value
    public E data;

    // This will be the link between nodes
    public Node<E> next = null;



    /**
     * Constructor with the data value and the link
     * @param data
     * @param next
     */
    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }


    /**
     * Constructor with the given data value
     * @param data
     */
    public Node(E data) {
        this(data, null);
    }


    /**
     * Returns the data itself
     * @return
     */
    public E getData() {
        return data;
    }

    /**
     * Returns the next node
     * @return
     */
    public Node<E> getNext() {
        return next;
    }




    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }



}