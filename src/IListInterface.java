/**
 * Robert Flores 2016313
 * Johan Quiroz 2016337
 */

public interface IListInterface<E> {
    void addAtFirts(E element);
    void addAfter(Node<E> node, E element);
    E deleteAtFirst();
    E deleteAfter(Node<E> node);
    Node<E> getNode(int index);
    E get(int index);
    void addItem(int index, E item);
    boolean add(E item);
    E delete(int index);
    public void deleteLastNodes(int number);
    int size();

    String toString();



}
