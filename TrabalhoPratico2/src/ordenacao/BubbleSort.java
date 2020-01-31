package ordenacao;

public class BubbleSort {
	private int comparacoes = 0;
	private int trocas = 0;
	private long tempo = 0;
	private long[] resultados = new long[3];

	public long[] bubbleSort(int[] vetor) {

		long tempoInicio = System.currentTimeMillis();
		int n = vetor.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			comparacoes++;
			for (int j = 1; j < (n - 1); j++) {
				comparacoes++;
				if (vetor[j - 1] > vetor[j]) {
					trocas++;
					temp = vetor[j - 1];
					vetor[j - 1] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		long tempoFinal = System.currentTimeMillis();
		tempo = tempoFinal - tempoInicio;
		resultados[0] = comparacoes;
		resultados[1] = trocas;
		resultados[2] = tempo;
		return resultados;
	}
}
