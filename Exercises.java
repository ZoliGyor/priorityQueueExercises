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

    public PriorityQueue<String> getPriorityQueue()
    {
        return colours;
    }
}
