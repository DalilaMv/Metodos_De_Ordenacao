package ordenacao;

public class InsertSort {
	private int comparacoes = 0;
	private int trocas = 0;
	private long tempo = 0;
	private long[] resultados = new long[3];

	public long[] insertSort(int[] vetor) {
		long tempoInicio = System.currentTimeMillis();
		int i;
		int j;
		int aux;

		for (i = 1; i < vetor.length; i++) {
			comparacoes++;
			aux = vetor[i];
			j = i - 1;

			while ((j >= 0) && (aux < vetor[j])) {

				comparacoes++;
				trocas++;
				vetor[j + 1] = vetor[j];
				j--;
			}
			trocas++;
			vetor[j + 1] = aux;
		}
		
		long tempoFinal = System.currentTimeMillis();
		tempo = tempoFinal - tempoInicio;
		resultados[0] = comparacoes;
		resultados[1] = trocas;
		resultados[2] = tempo;
		return resultados;
	}
}
