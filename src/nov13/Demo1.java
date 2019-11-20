package nov13;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String>arv=new ArrayList<String>();
		arv.add("mon");
		arv.add("tue");
		arv.add("wed");
		arv.add("thu");
		arv.add("fri");
		arv.add("sat");
		arv.add("sun");
		System.out.println(arv.get(6));
		System.out.println(arv.size());
		Iterator<String> itr=arv.iterator();
		while (itr.hasNext()) {
			//String name = (String) itr.next();
			System.out.println(itr.next());
			
		}

	}

}
