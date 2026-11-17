public class ListaIngressos{
    private Ingresso[] ingressos;
    private int tamanho;
    private int capacidade;
    public ListaIngressos(int capacidadeMaxima){
        capacidade = capacidadeMaxima;
        ingressos = new Ingresso[capacidade];
        tamanho = 0;
    }
    public boolean adicionar(Ingresso ingresso){
        if (tamanho < capacidade) {
            ingressos[tamanho] = ingresso;
            tamanho++;
            return true;
        }
        System.out.println("Lista cheia.");
        return false;
    }
    public void exibirTodos(){
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.println("\n LISTA DE INGRESSOS");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("[%d] ", i + 1);
            ingressos[i].exibir();
        }
    }
    public void ordenarPorAssento(){
        for (int i = 1; i < tamanho; i++){
            Ingresso chave = ingressos[i];
            int j = i - 1;
            while (j >= 0 && ingressos[j].getAssento() > chave.getAssento()){
                ingressos[j + 1] = ingressos[j];
                j = j - 1;
            }
            ingressos[j + 1] = chave;
        }
        System.out.println("Lista ordenada por número do assento.\n");
    }
    public void ordenarPorValor(){
        for (int i = 1; i < tamanho; i++){
            Ingresso chave = ingressos[i];
            int j = i - 1;

            while (j >= 0 && ingressos[j].getValor() > chave.getValor()){
                ingressos[j + 1] = ingressos[j];
                j = j - 1;
            }
            ingressos[j + 1] = chave;
        }
        System.out.println("Lista ordenada por valor.\n");
    }
    public void ordenarPorHorario(){
        for (int i = 1; i < tamanho; i++){
            Ingresso chave = ingressos[i];
            int j = i - 1;
            while (j >= 0 && ingressos[j].getHorario().compareTo(chave.getHorario()) > 0){
                ingressos[j + 1] = ingressos[j];
                j = j - 1;
            }
            ingressos[j + 1] = chave;
        }
        System.out.println("Lista ordenada por horário.\n");
    }
    public int getTamanho() {
        return tamanho;
    }
}