import stackqueue.INode;
import stackqueue.MyLinkedList;

public class MyQueue<K extends Comparable<K>> {
    public final MyLinkedList<K> myLinkedList;
    public MyQueue()
    {
        myLinkedList=new MyLinkedList<>();

    }
    public void enqueue(INode<K> element)
    {
        myLinkedList.append(element);
    }
    public INode<K> peak()
    {
        return myLinkedList.head;
    }
    public void printQueue()
    {
        myLinkedList.printMyNodes();
    }

}
