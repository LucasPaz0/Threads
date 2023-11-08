import java.util.ArrayList;

public class Minhathreadsoma extends Thread {
    private int posicao;
    private static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static ArrayList<Integer> ints_soma = new ArrayList<>();
    private static int threadsConcluidas = 0;

    public Minhathreadsoma(int posicao) {
        this.posicao = posicao;
    }

    public void run() {
        int resultado = array[this.posicao] + array[this.posicao + 1];
        ints_soma.add(resultado);
        threadsConcluidas++;

        if (threadsConcluidas == 5) {
            int somaTotal = 0;
            for (int i : ints_soma) {
                somaTotal += i;
            }
            System.out.println("Soma total: " + somaTotal);
        }
    }
}