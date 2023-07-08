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
  // Utils implementation
  public static int[] pipeFixUtils(int[] numbers) {
    return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
  }
}
