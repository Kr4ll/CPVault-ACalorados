import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String animal;
		char[] animal2;
		int N;
		int pcomp = 0, pincomp = 0, left = 0;
		Map<String, Integer> map = new HashMap<>();
		
		while ((N = sc.nextInt()) != 0){
			for (int i = 0; i < N; i++){
				if (!map.containsKey((animal = sc.next()))) {
					// Check if his/her soulmate is there
					if ((animal2 = animal.toCharArray())[animal.length() - 1] == 'a')
						animal2[animal.length() - 1] = 'o';
					else
						animal2[animal.length() - 1] = 'a';
					// case: new animal
					if (!map.containsKey(String.valueOf(animal2)))
						map.put(animal, 1);
					else {
						if (map.get(String.valueOf(animal2)) >= 2) // case: repeated pair animal
							left++;
						else{ // case: pair animal
							map.put(String.valueOf(animal2), map.get(String.valueOf(animal2)) + 1);
							pcomp++;
						}
					}
				}
				else // case: repeated animal
					left++;
			}
			// checking if someone is alone
			for(Integer i: map.values()){
				if(i == 1)
					pincomp++;
			}
			// Print out
			System.out.print(pcomp + " ");
			System.out.print(pincomp + " ");
			System.out.println(left);
			// Reseting values and map
			pcomp = 0;
			pincomp = 0;
			left = 0;
			map.clear();
		}
	}
}
