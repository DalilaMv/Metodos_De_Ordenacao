package ordenacao;

public class QuickSort {
	private int comparacoes;
	private int trocas;
	private long tempo;
	private long[] resultados = new long[3];

	public long[] quickSort(int[] vetor, int inicio, int fim) {
		long tempoInicio = System.currentTimeMillis();
		comparacoes++;
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, fim);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
		long tempoFinal = System.currentTimeMillis();
		tempo = tempoFinal - tempoInicio;
		resultados[0] = comparacoes;
		resultados[1] = trocas;
		resultados[2] = tempo;
		return resultados;

	}

	public int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1;
		int f = fim;
		while (i <= f) {
			comparacoes++;
			if (vetor[i] <= pivo) {
				i++;
			} else {
				comparacoes++;
				if (pivo < vetor[f]) {
					f--;
				} else {
					trocas++;
					int troca = vetor[i];
					vetor[i] = vetor[f];
					vetor[f] = troca;
					i++;
					f--;
				}
			}
		}
		trocas++;
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}
}
