
import java.util.Scanner;
public class Ex2ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero[] = new int[6];
		int nPar[];
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 0; x < 6; x++) {
			
			System.out.println("\nEntre com o valor " + x);
			numero[x] = leia.nextInt();
			
			if(numero[x] % 2 == 0) {
				nPar[0] = numero[x];
			}
		}
		
			System.out.println("\nNpar " + nPar);
			
	}

}
