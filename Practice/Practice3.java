import java.util.ArrayList;
import java.util.Iterator;

public class Practice3 {
	public static void main(String[] args) {
		Museum museum_1 = new Museum("Museum of Natural History", "Los Angeles", "Cool Stuff");
		Museum museum_2 = new Museum("Museum of Science and Technology", "Los Angeles", "Cool Stuff");
		Museum museum_3 = new Museum("Museum of Bleh", "Los Angeles", "Cool Stuff");
		Museum museum_4 = new Museum(museum_3);
		
		ArrayList<Museum> museums = new ArrayList<Museum>();
		
		museums.add(museum_1);
		museums.add(museum_2);
		museums.add(museum_3);
		museums.add(museum_4);
		
		System.out.println("for-each loop");
		for (Museum bleh : museums) {
			System.out.println(bleh);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		Iterator<Museum> it = museums.iterator();
		
		System.out.println("Iterator");
		while (it.hasNext()) {
			Museum museum = (Museum)it.next();
			System.out.println(museum);
		}
	}
}
