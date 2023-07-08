import java.util.ArrayList;
import java.util.List;

public class Kata {
  public static int[] pipeFix(int[] numbers) {
    List<Integer> listNumbers = new ArrayList<>();
    for (int i = numbers[0]; i <= numbers[numbers.length - 1]; i++){
      listNumbers.add(i);
    }
    int[] numbersSolved = new int[listNumbers.size()];
    for(int i = 0; i < listNumbers.size(); i++){
      numbersSolved[i] = listNumbers.get(i);
    }
    return numbersSolved;
  }
}
/* Utils implementation
import java.util.stream.IntStream;

public class Kata {
  public static int[] pipeFix(int[] numbers) {
    int min = numbers[0];
    int max = numbers[numbers.length - 1];

    return IntStream.rangeClosed(min, max).toArray();
  }
}
*/
