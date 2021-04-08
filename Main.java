public class Main {
    public static void main(String[] args)
    {
        Exercises exercises1 = new Exercises();
        Exercises exercises2 = new Exercises();
        
        exercises1.exercise1(1);
        exercises2.exercise1(2);

        exercises1.exercise2(exercises1.getPriorityQueue());
        exercises1.exercise3(exercises1.getPriorityQueue(), exercises2.getPriorityQueue());
        exercises1.exercise4(exercises1.getPriorityQueue(), "Orange");
        exercises2.exercise5(exercises2.getPriorityQueue());
        exercises1.exercise6(exercises1.getPriorityQueue());
        exercises1.exercise7(exercises1.getPriorityQueue(), exercises2.getPriorityQueue());
        exercises1.exercise8(exercises1.getPriorityQueue());
        exercises1.exercise9(exercises1.getPriorityQueue());
        exercises1.exercise10(exercises1.getPriorityQueue());
    }
}
