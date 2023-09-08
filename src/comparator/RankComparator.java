package comparator;

import java.util.Comparator;

public class RankComparator implements Comparator<Ranking> {	
	@Override
	public int compare(Ranking o1, Ranking o2) {
		if(o1.age>o2.age) {
			return +1;
		}
		else if(o1.age<o2.age) {
			return -1;
		}else {
			return 0;	
		}	
		
		
	}

}
