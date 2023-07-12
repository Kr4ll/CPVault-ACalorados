import java.util.*;

public class Problem700 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, min, i;
		String title;
		Map<String, Integer> integerStringMap = new HashMap<>();
		while ((n = sc.nextInt()) != 0){
			for(i = 0; i < n; i++){
				min = sc.nextInt();
				title = sc.nextLine().replaceFirst(" ", "");
				
				integerStringMap.put(title, integerStringMap.get(title) == null ? min :
						integerStringMap.get(title) + min);
			}
			List<Map.Entry<String, Integer>> integerStringMapList = new ArrayList<>(integerStringMap.entrySet());
            Collections.sort(integerStringMapList,
                    new Comparator<Map.Entry<String, Integer>>() {
	                    @Override
	                    public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
		                    int valueComparison = entry2.getValue().compareTo(entry1.getValue());
		                    if (valueComparison == 0)
			                    return entry1.getKey().compareTo(entry2.getKey());
		                    else
			                    return valueComparison;
	                    }
                    });
			i = 0;
			for(Map.Entry<String, Integer> e : integerStringMapList){
				if (i == 3)
					break;
				if (e.getValue() >= 30){
					System.out.println(e.getKey());
					i++;
				}
			}
			System.out.println("---");
			integerStringMap.clear();
			integerStringMapList.clear();
		}
		sc.close();
	}
}
