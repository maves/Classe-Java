
public class NumeriConsecutivi {

	public static void main(String[] args) {
		
		String numbers = "10-9-8-7-6";
		numbers = "0-1-2-3-4-5-6-7-8-9-10-11-12";
		numbers = "10-9-8-7-6-6-4-3-2-1-0";
		
		String[] arrS = numbers.split("-");
			
		boolean consecutivi = true;
		
		for (int i = 0; i < arrS.length; i++) {
			
			if( i == arrS.length-1) break;
			
			int num = Integer.valueOf(arrS[i]);
			int nextNum = Integer.valueOf(arrS[i+1]);
		
			int diff = Math.abs(num-nextNum);
			
			if( diff > 1 || diff == 0 ) {
				consecutivi = false;
				break;
			}
			
		}
		
		System.out.print("I NUMERI " + numbers + " " 
				+ ((consecutivi)?"":"NON") + " SONO CONSECUTIVI.");
		
		
		

	}

}
