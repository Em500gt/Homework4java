import java.util.LinkedList;
import java.util.List;

// Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
//  first() - возвращает первый элемент из очереди, не удаляя.
/**
 * Task2
 */
public class Task2 {
    public static void main(String[] args){
        
        List<Integer> ll = new LinkedList<Integer>();

        enqueue(ll, 5);
        enqueue(ll, 6);
        enqueue(ll, 1);
        enqueue(ll, 2);
        enqueue(ll, 3);
        enqueue(ll, 7);

        System.out.println(ll);

        dequeue(ll);
        first(ll);
        
        System.out.println(ll);

    }

    public static <E> List<Integer> enqueue(List<Integer> ll, int n) {
        ll.add(n);
        return ll;
    }

    public static <E> void dequeue(List<Integer> ll) {
        System.out.println(ll.remove(0));
    }

    public static <E> void first(List<Integer> ll) {
        System.out.println(ll.get(0));
    }
}