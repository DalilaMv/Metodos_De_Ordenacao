package ordenacao;

public class HeapSort {
	private int comparacoes = 0;
	private int trocas = 0;
	private long tempo = 0;
	private long[] resultados = new long[3];

	public void heapSort(int[] vetor, int posicao, int tamanhoDoVetor) {

		int indiceFilhoUm = 2 * posicao + 1;
		int indiceFilhoDois = indiceFilhoUm + 1;
		comparacoes++;
		if (indiceFilhoUm < tamanhoDoVetor) {
			comparacoes++;
			if (indiceFilhoDois < tamanhoDoVetor) {
				// verifica se ainda esta dentro do vetor
				comparacoes++;
				if (vetor[indiceFilhoUm] < vetor[indiceFilhoDois]) {
					// verifica qual é o maior filho
					indiceFilhoUm = indiceFilhoDois;
				}
			}
			// compara filho com o pai
			comparacoes++;
			if (vetor[indiceFilhoUm] > vetor[posicao]) {
				// coloca maior valor no pai
				trocas++;
				int aux;
				aux = vetor[indiceFilhoUm];
				vetor[indiceFilhoUm] = vetor[posicao];
				vetor[posicao] = aux;

				// refaz vetor
				heapSort(vetor, indiceFilhoUm, tamanhoDoVetor);
			}
		}

	}

	public void montarHeap(int[] vetor) {
		for (int posicao = vetor.length - 1 / 2; posicao >= 0; posicao--) {
			comparacoes++;
			heapSort(vetor, posicao, vetor.length);
		}
	}

	public long[] ordenar(int[] vetor) {
		long tempoInicio = System.currentTimeMillis();
		montarHeap(vetor);
		int n = vetor.length;
		for (int i = vetor.length - 1; i > 0; i--) {
			trocas++;
			comparacoes++;
			int aux = vetor[i];
			vetor[i] = vetor[0];
			vetor[0] = aux;
			heapSort(vetor, 0, --n);
		}
		long tempoFinal = System.currentTimeMillis();
		tempo = tempoFinal - tempoInicio;
		resultados[0] = comparacoes;
		resultados[1] = trocas;
		resultados[2] = tempo;
		return resultados;
	}
}
