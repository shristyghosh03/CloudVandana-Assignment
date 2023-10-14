import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] values_of_org_Array = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a List
        List<Integer> list = Arrays.asList(values_of_org_Array);

        // Shuffled the list using Collections.shuffle
        Collections.shuffle(list);

        // Convert the shuffled list back to an array
        Integer[] shuffled_values_of_Array = list.toArray(new Integer[0]);

        // Printing the values of shuffled array
        System.out.println(Arrays.toString(shuffled_values_of_Array));
    }
}

