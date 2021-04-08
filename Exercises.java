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

    public void exercise6(PriorityQueue<String> queue)
    {
        System.out.println("6th exercise: Write a Java program to count the number of elements in a priority queue");
        System.out.println(queue);
        System.out.println("The number of elements are: " + queue.size());
        System.out.println();
    }

    public void exercise7(PriorityQueue<String> queue1, PriorityQueue<String> queue2)
    {
        System.out.println("7th exercise:  Write a Java program to compare two priority queues");
        System.out.println(queue1);
        System.out.println(queue2);
        if(queue1.size() != queue2.size() || !queue1.containsAll(queue2)){
            System.out.println("The queues are not the same");
        }else{
            System.out.println("The queues are the same");
        }
        System.out.println();
    }

    public void exercise8(PriorityQueue<String> queue)
    {
        System.out.println("8th exercise: Write a Java program to retrieve the first element of the priority queue");
        System.out.println(queue);
        System.out.println("The first element is: " + queue.peek());
        System.out.println();
    }

    public void exercise9(PriorityQueue<String> queue)
    {
        System.out.println("9th exercise: Write a Java program to retrieve and remove the first element");
        System.out.println(queue);
        System.out.println("I removed the first element, which was: " + queue.poll());
        System.out.println(queue);
        System.out.println();
    }

    public void exercise10(PriorityQueue<String> queue)
    {
        System.out.println("10th exercise: Write a Java program to convert a priority queue to an array containing all of the elements of the queue");
        System.out.println(queue);
        String[] array = new String[queue.size()];
        array = queue.toArray(array);
        for(int i = 0; i < array.length; i++){
            System.out.println("The current element of the array is: " + array[i]);
        }
        System.out.println();
    }

    public void exercise11(PriorityQueue<String> queue)
    {
        System.out.println("11th exercise: Write a Java program to convert a Priority Queue elements to a string representation");
        System.out.println(queue);
        String queueString = "";
        queueString = queue.toString();
        System.out.println("The string representation of the queue is: " + queueString);
        System.out.println();
    }

    public PriorityQueue<String> getPriorityQueue()
    {
        return colours;
    }
}
