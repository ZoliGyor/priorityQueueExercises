import java.util.Iterator;
import java.util.PriorityQueue;

public class Exercises {
    PriorityQueue<String> colours = new PriorityQueue<String>();

    public void exercise1()
    {
        System.out.println("1st exercise: Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue");
        colours.add("Blue");
        colours.add("Red");
        colours.add("Green");
        colours.add("Yellow");
        System.out.println(colours);
        System.out.println();
    }

    public void exercise2(PriorityQueue<String> queue)
    {
        System.out.println("2nd exercise: Write a Java program to iterate through all elements in priority queue");
        Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(element);
        }
        System.out.println();
    }

    public PriorityQueue<String> getPriorityQueue()
    {
        return colours;
    }
}
