package ordenacao;

public class SelectionSort {

	private int comparacoes = 0;
	private int trocas = 0;
	private long tempo = 0;
	private long[] resultados = new long[3];

	public long[] selectionSort(int[] vetor) {
		long tempoInicio = System.currentTimeMillis();
		int tamanho = vetor.length;
		for (int aux = 0; aux < tamanho; aux++) { // percorre o vetor colocando sempre o menor valor na posição atual
			comparacoes++;
			int menor = aux;
			for (int i = menor + 1; i < tamanho; i++) {
				comparacoes++;
				if (vetor[i] < vetor[menor]) {
					menor = i;
				}
			}
			comparacoes++;
			if (menor != aux) {
				trocas++;
				int t = vetor[aux];
				vetor[aux] = vetor[menor];
				vetor[menor] = t;
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
