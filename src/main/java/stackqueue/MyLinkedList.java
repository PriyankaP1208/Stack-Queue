package stackqueue;

public class MyLinkedList<K extends Comparable<K>> {
    public INode<K> head;
    public INode<K> tail;
    public MyLinkedList()
    {
        this.head=head;
        this.tail=tail;
    }
    public void add(INode<K> myNode)
    {
        if (this.tail==null)
        {
            this.tail=myNode;
        }
        if (this.head==null)
        {
            this.head=myNode;
        }
        else {
            INode tempNode=this.head;
            this.head=myNode;
            this.head.setNext(tempNode);
        }
    }
    public void printMyNodes()
    {
        StringBuffer myNodes = new StringBuffer("MyNodes");
        INode tempNode=head;
        while (tempNode.getNext()!=null)
        {
            myNodes.append(tempNode.getKey());
            if (!(tempNode.equals(tail))) {
                myNodes.append("->");
            }
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public INode pop() {
        INode tempNode=this.head;
        this.head=head.getNext();
        return tempNode;
    }

    public void append(INode<K> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;

        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public INode<K> popLast() {
      INode tempNode=head;
      while (!tempNode.getNext().equals(tail))
      {
          tempNode=tempNode.getNext();
      }
      this.tail=tempNode;
      tempNode=tempNode.getNext();
      return tempNode;
    }
}
