import java.util.Iterator;
import java.util.PriorityQueue;

public class Exercises {
    PriorityQueue<String> colours = new PriorityQueue<String>();

    public void exercise1(int selector)
    {
        System.out.println("1st exercise: Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue");
        if(selector == 1){
            colours.add("Blue");
            colours.add("Red");
            colours.add("Green");
            colours.add("Yellow");
        }else if(selector == 2){
            colours.add("Pink");
            colours.add("White");
            colours.add("Black");
            colours.add("Brown");
        }
        
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

    public void exercise3(PriorityQueue<String> queue1, PriorityQueue<String> queue2)
    {
        System.out.println("3rd exercise: Write a Java program to add all the elements of a priority queue to another priority queue");
        System.out.println(queue1);
        System.out.println(queue2);
        queue1.addAll(queue2);
        System.out.println(queue1);
        System.out.println();
    }

    public void exercise4(PriorityQueue<String> queue, String element)
    {
        System.out.println("4th exercise: Write a Java program to insert a given element into a priority queue");
        System.out.println(queue);
        queue.add(element);
        System.out.println(queue);
        System.out.println();
    }

    public void exercise5(PriorityQueue<String> queue)
    {
        System.out.println("5th exrecise: Write a Java program to remove all the elements from a priority queue");
        System.out.println(queue);
        queue.removeAll(queue);
        System.out.println(queue);
        System.out.println();
    }

    public PriorityQueue<String> getPriorityQueue()
    {
        return colours;
    }
}
