package exercicios;

public class Ex1 {
public static void main(String[] args) {
	int i, j, TAM = 4;
	double antes = 2;
	double matriz [] [] = new double [TAM] [TAM];
	
	for(i=0; i<TAM; i++) {
		for(j=0; j<TAM; j++) {
			
			if(i == 0 && j == 0) {
				matriz [i] [j] = antes;
			}
			else {
				matriz [i] [j] = antes * antes ;
			}
			
			antes = matriz [i] [j];
		}
	}
	
	for(i=0; i<TAM; i++) {
		System.out.println();
		for(j=0; j<TAM; j++) {
			System.out.print("| " +matriz [i] [j] + " |");
		}
	}
}
}
