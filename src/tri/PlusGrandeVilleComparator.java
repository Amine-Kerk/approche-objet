package tri;
import recensement.Ville;
import java.util.Comparator;

public class PlusGrandeVilleComparator implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		if (ville1.getPopulationTotale() < ville2.getPopulationTotale()) {
			return 1;
		}
		if (ville1.getPopulationTotale() > ville2.getPopulationTotale()) {
			return -1;
		}
		return 0;
	}

}
