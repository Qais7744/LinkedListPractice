package javapractice;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
	@Test
	public void given3NumbersWhenLinkedShouldPassedLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(70);
		MyNode<Integer> myThirdNode = new MyNode<>(30);
		myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
        				 mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
	}
}