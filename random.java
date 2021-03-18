/*Use the statement x = Math.random() to calculate what percentage of iterations produces a value greater than 0.5. 
  Display this value for 10, 100 and 1000 iterations
*/
package exercise;

public class random {
	int counter  = 0;
	int counter2  = 0;
	int counter3  = 0;
	public void produce() {
		for(int i=0;i<10;i++) {
			double x = Math.random();
			if (x>0.5) {
				counter ++;
			}
			
		}
		int percentage = (counter*10);
		System.out.println("循环10次的占比为："+percentage+"%");
		for(int i=0;i<100;i++) {
			double x = Math.random();
			if (x>0.5) {
				counter2 ++;
			}
			
		}
		int percentage2 = counter2;
		System.out.println("循环100次的占比为："+percentage2+"%");
	
		for(int i=0;i<1000;i++) {
			double x = Math.random();
			if (x>0.5) {
				counter3 ++;
			}
			
		}
		int percentage3 = counter3/10;
		System.out.println("循环1000次的占比为："+percentage3+"%");
	}



public static void main(String[] args) {
	random r = new random();
	r.produce();
	
}


}
