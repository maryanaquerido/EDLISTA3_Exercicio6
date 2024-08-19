package controller;

public class ControllerSerie {
	public ControllerSerie() {
		super();
	}
	
	public double Serie (int num) {
		if (num == 1) { // CONDIÇÃO DE PARADA: QUANDO N FOR 1, RETORNA 1 PORQUE É O PRIMEIRO ELEMENTO DA SÉRIE
                    return 1.0;
		}
		else {
                    return (double) (1.0 / FFat(num)) + Serie(num - 1);
		}
	}
	
	public double FFat (int N) {
		if (N == 1) {
			return 1;
			}
			else {
				return N * FFat (N-1);
			}
		}
	}
//RELAÇÃO DA CHAMADA DE PASSOS:
// TEMOS UMA RCURVIDA DENTRO DE OUTRA
//1. SERIE(5)
//1.1 VERIFICA SE NUM > 1. SIM! CALCULA (1.0 / FFAT(5)) + SERIE(4).
//1.2 DENTRO DA SERIE(5), CHAMAMOS FFAT(5), QUE RETORNA 120.

//2. SERIE(4)
//2.1 VERIFICA SE NUM > 1. SIM! CALCULA (1.0 / FFAT(4)) + SERIE(3).
//2.2 DENTRO DA SERIE(4), CHAMAMOS FFAT(5), QUE RETORNA 24.

//3. SERIE(4)
//3.1 VERIFICA SE NUM > 1. SIM! CALCULA (1.0 / FFAT(4)) + SERIE(3).
//3.2 DENTRO DA SERIE(4), CHAMAMOS FFAT(5), QUE RETORNA 24.

//4. SERIE(3)
//4.1 VERIFICA SE NUM > 1. SIM! CALCULA (1.0 / FFAT(3)) + SERIE(2).
//4.2 DENTRO DA SERIE(3), CHAMAMOS FFAT(3), QUE RETORNA 6.

//5. SERIE(2)
//5.1 VERIFICA SE NUM > 1. SIM! CALCULA (1.0 / FFAT(2)) + SERIE(1).
//5.2 DENTRO DA SERIE(2), CHAMAMOS FFAT(2), QUE RETORNA 2.

//6. SERIE(1)
//6.1 VERIFICA SE NUM > 1. NÃO! RETORNA 1.0 SEM E FIM DAS CHAMADAS.

//7. SERIE(2) RETORNA (1.0 / 2) + 1.0 =  0.5 + 1.0 = 1.5.
//8. SERIE(3) RETORNA (1.0 / 6) + 1.5 = 0.1667 + 1.5 = 1.6667.
//9. SERIE(4) RETORNA (1.0 / 24) + 1.6667 = 0.0417 + 1.6667 = 1.7083.
//10. SERIE(5) RETORNA (1.0 / 120) + 1.7083 = 0.0083 + 1.7083 = 1.7167.
//11. RESP = 1.7167

