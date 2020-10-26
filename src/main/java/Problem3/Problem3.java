package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {

        LinkedListStack<ListNode> data = new LinkedListStack<>();

        //Puts the list into the data LinkedListStack
        ListNode pl = list.next;
        while (pl != null)
        {
            data.push(pl);
            pl = pl.next;
        }

        while (data.size() > 0) {
            print.println(data.peek().val);
            data.pop();
        }
    }
}
