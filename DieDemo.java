/*Create a DieDemo class that creates 2 Die objects, 
  rolls each dice and records the total score 1000 times. 
 Display the number of times each possible value was rolled */
package exercise;

import java.util.HashMap;
import java.util.Set;;

public class DieDemo {
	
		int[] die = {1,2,3,4,5,6};
		int[] die2 = {1,2,3,4,5,6};
		HashMap<Integer, Integer> hashMap = new HashMap<>();
			public void roll(){
				for(int i =0;i<1000;i++) {
					int index = (int) (Math.random() * die.length);
					int random = die[index];
					int index2 = (int) (Math.random() * die2.length);
					int random2 = die[index2];
					int sum = random + random2;
					if (hashMap.get(sum) == null) {
						hashMap.put(sum,1);
					}else {
						hashMap.put(sum,hashMap.get(sum)+1);
						}
					}
				}
			
	public static void main(String[] args) {
		DieDemo d = new DieDemo();
		d.roll();
		Set<Integer> set = d.hashMap.keySet();
		for(Integer integer : set) {
			System.out.println("和为"+integer+"的次数为:"+d.hashMap.get(integer));
		}
	}
}
