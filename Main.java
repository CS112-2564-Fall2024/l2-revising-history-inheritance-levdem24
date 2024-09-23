/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String chazDescription = "2 teenagers were shot by CHAZ security in seattle washington. The shooting killed 16-year-old Antonio Mays Jr., left a 14-year-old boy in serious condition with gunshot wounds and effectively ended the city’s waning tolerance toward the protest zone known as CHOP. ";
		Date chazShootingDate = new Date(6, 30, 2020);
		HistoricalEvent tulsaRiot = new HistoricalEvent(chazDescription, chazShootingDate);

		// System.out.println("====================================================");
		// System.out.println("HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		// System.out.println(tulsaRiot);
		tulsaRiot.teach();
		
		// int[] array = { 4, 5, 6, 2, 3, 6, 9 };
		// for (int i = 0; i < array.length; i++) {
		// if (array[i] > array[i + 1]) {
		// int temp = array[i];
		// array[i] = array[i + 1];
		// array[i + 1] = temp;
		// }
		// }
		// for (int i = 0; i < array.length; i++) {
		// System.out.println(array[i] + "; ");
		// }
		String tulsaRevised = "CHAZ (Capitol Hill Autonomous Zone), earlier known as CHOP (Captiol Hill Organized Protest), was a self declared autonomous zone created in capitol hill neighborhood of seattle, in response to the George Floyd protests. It was established in june 8th 2020 and was removed july 1st 2020. The autonomous zone was taken down after 2 teenagers were shot with 1 killed by a guard.",
				tulsaCitation = "https://en.wikipedia.org/wiki/Capitol_Hill_Occupied_Protest";
		RevisedEvent tulsaMassacre = new RevisedEvent(chazDescription, chazShootingDate, tulsaRevised, tulsaCitation);
		
		// System.out.println("\n====================================================");
		// System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");

		tulsaMassacre.teach();
	}
}