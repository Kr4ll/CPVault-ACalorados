	import java.util.*;
	
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Map<String, Integer> statistics = new HashMap<>();
			String[] trimmedInput;
			String input, possibleWinner = "";
			int matchesPlayed = 0, teams, possibleWinnerPoints, possibleWinnerCount = 0;
			while (!sc.nextLine().equals("FIN")){
				while (!(input = sc.nextLine()).equals("FIN")){
					matchesPlayed++;
					trimmedInput = input.split(" ");
					if (!statistics.containsKey(trimmedInput[0]))
						statistics.put(trimmedInput[0], 0);
					if (!statistics.containsKey(trimmedInput[2]))
						statistics.put(trimmedInput[2], 0);
					if (Integer.parseInt(trimmedInput[1]) > Integer.parseInt(trimmedInput[3])) {
						statistics.put(trimmedInput[0], statistics.get(trimmedInput[0]) + 2);
						statistics.put(trimmedInput[2], statistics.get(trimmedInput[2]) + 1);
					}
					else {
						statistics.put(trimmedInput[0], statistics.get(trimmedInput[0]) + 1);
						statistics.put(trimmedInput[2], statistics.get(trimmedInput[2]) + 2);
					}
				}
				teams = statistics.entrySet().size();
				possibleWinnerPoints = Collections.max(statistics.values());
				for (Map.Entry<String, Integer> entry : statistics.entrySet()){
					if (entry.getValue().equals(possibleWinnerPoints)) {
						possibleWinnerCount++;
						possibleWinner = entry.getKey();
						if (possibleWinnerCount > 1) {
							possibleWinner = "EMPATE";
							break;
						}
					}
				}
				System.out.printf("%s %d%n",
				        possibleWinner, (teams * (teams - 1)) - matchesPlayed);
				//Clear map
				statistics.clear();
				matchesPlayed = 0;
				possibleWinner = "";
				possibleWinnerCount = 0;
			}
			sc.close();
		}
	}
