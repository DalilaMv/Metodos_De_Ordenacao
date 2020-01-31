package ordenacao;

public class MergeSort {
	private int comparacoes = 0;
	private int trocas = 0;
	private long tempo = 0;
	private long[] resultados = new long[3];
	public long[] Ordenacao(int[] vetor) {
		long tempoInicio = System.currentTimeMillis();
		
		
		long tempoFinal = System.currentTimeMillis();
		tempo = tempoFinal - tempoInicio;
		resultados[0] = comparacoes;
		resultados[1] = trocas;
		resultados[2] = tempo;
		return resultados;
	}

}
