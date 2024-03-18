import java.util.HashMap;
import java.util.Map;
public class Main
{
    public static void main(String[] args)
    {
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++)
        {
            mass[i] = ((int) (Math.random() * 15) + 1);
            System.out.println("Содержимое массива: " + mass[i]);
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : mass)
        {
            countMap.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз");
            }
        }
    }
}