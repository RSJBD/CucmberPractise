package paterns;

public class Pattern {

	public static void main(String[] args) {
		/*  triangle(Over all 2 loop ) */
/*Left angle triangle */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}		System.out.println(" ");	
		}
		/*Reverse Left angle triangle */		
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}		System.out.println(" ");	
		}

		
		
		/*Right  angle triangle */		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}	
			System.out.println(" ");
		
		}

		/*Triangle angle triangle */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}	
			System.out.println(" ");
		
		}
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}	
			System.out.println(" ");
		
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 4; j >= i; j--) {
				System.out.print(" *");
			}	
			System.out.println(" ");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
