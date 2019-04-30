/**
 * Robert Flores 2016313
 * Johan Quiroz 2016337
 */


public class PatientList<E> implements IListInterface<E>  {

    Patient patient = new Patient();

    public Node<E> head = null;
    //This represent the size of the list
    private int size = 0;



    /**
     * This method  --> Insert insert an item or a patient in the list.
     */
    public void addAtFirts(E element)
    {
        head = new Node<E>(element, head);
        size++;
    }



    /**
     * This method --> Add a node after the other node
     */
    public void addAfter(Node<E> node, E element)
    {
        node.next = new Node<E>(element, node.next);
        size++;
    }



    /**
     * This method --> Remove the first node from the list
     * and returns null if the list is empty
     */
    public E deleteAtFirst()
    {
        Node<E> temp = head;
        if (head != null)
        {
            head = head.next;
        }
        if (temp != null)
        {
            size--;
            return temp.data;
        } else {
            return null;
        }
    }



    /**
     * This method --> Remove the node after a given node
     * and returns null is there is no node to remove or
     * the data from the removed node
     */
    public E deleteAfter(Node<E> node)
    {
        Node<E> temp = node.next;
        if (temp != null)
        {
            node.next = temp.next;
            size--;
            return temp.data;
        }else {
            return null;
        }
    }


    /**
     * This method  --> Find the node at specified index
     *  returns The node at index or null if this does not exist
     */
    public Node<E> getNode(int index)
    {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++)
        {
            node = node.next;
        }
        return node;
    }


    /**
     * This method --> Get the data value at index
     * returns The data at index
     * IndexOutOfBoundsException if the index is out of range
     */
    public E get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        return node.data;
    }


    /**
     * This method --> Insert the specified item at the specified position in the list.
     * Swap the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices)
     * throws IndexOutOfBoundsException if the index is out of range
     */
    public void addItem(int index, E item)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            addAtFirts(item);
        } else {
            Node<E> node = getNode(index - 1);
            addAfter(node, item);
        }
    }


    /**
     * This method --> Add the specified item to the end of the list
     * returns true (as specified by the Collection interface)
     */
    public boolean add(E item)
    {
        addItem(size, item);
        return true;
    }


    /**
     * This method --> Remove the item at the specified position in the list.
     * returns The item that was at the specified position
     * throws IndexOutOfBoundsException if the index is out of range
     */
    public E delete(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0)
        {
            return deleteAtFirst();
        } else {
            Node<E> node = getNode(index - 1);
            return deleteAfter(node);
        }
    }

    /**
     * This method --> will delete from the specific number to the end of the list
     */
    public void deleteLastNodes(int number){

        @SuppressWarnings("unchecked")
        Node<Patient> node = (Node<Patient>) getNode(number -2);

        @SuppressWarnings("unchecked")
        Node<Patient> current = (Node<Patient>) head;


        while(node != current.next){
            current = current.next;
        }

        node.next = null;
        size--;
    }


    /**
     * This method --> Query the size of the list
     * return The number of objects in the list
     */
    public int size()
    {
        return size;
    }



    /**
     * This method --> Obtain a string representation of the list
     * return A String representation of the list
     */
    public String toString()
    {
        String stringBuilder = "" + "\n";
        Node<E> nod = head;
        if (nod != null)
        {
            while (nod != null)
            {
                stringBuilder += "  "  + nod.getData().toString() + " " + "\n";
                nod= nod.getNext() ;
            }
        }
        return stringBuilder;
    }



}