import org.junit.Assert;
import org.junit.Test;
import stackqueue.INode;
import stackqueue.MyNode;

public class MyQueueTest {
    @Test
    public void given3NumbersWhenAddedToQueueShouldPassQueue(){
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue<Integer> myQueue=new MyQueue<>();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode<Integer> myNode=myQueue.peak();
        myQueue.printQueue();
        Assert.assertEquals(myNode,myFirstNode);
    }
}
