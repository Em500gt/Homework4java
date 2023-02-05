import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
/**
 * Task1
 */
class Task1
{
    public static <E> List<Integer> getInstance(List<Integer> ArrayList)
    {
        List<Integer> linkedList = new LinkedList<>();

        for (Integer e: ArrayList) linkedList.add(e);

        return linkedList;
    }

    public static <E> List<Integer> reversArr(List<Integer> ll)
    {
        Integer temp;
        int size = ll.size() - 1;
        for(int i = 0; i < ll.size() / 2; i++)
        {
            temp = ll.get(i);
            ll.set(i, ll.get(size));
            ll.set(size--, temp);
        }
        return ll;

    }

    public static void main(String[] args)
    {
        List<Integer> ArrayList = Arrays.asList(1, 2, 3, 4, 5);
 
        List<Integer> linkedList = getInstance(ArrayList);
        System.out.println(linkedList);
        
        System.out.println(reversArr(linkedList));
    }
}