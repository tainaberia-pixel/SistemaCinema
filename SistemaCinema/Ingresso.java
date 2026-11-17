public class Ingresso{
    private String filme;
    private int sala;
    private String horario;
    private int assento;
    private String cliente;
    private double valor;
    public Ingresso(String filme, int sala, String horario, int assento, String cliente, double valor) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.assento = assento;
        this.cliente = cliente;
        this.valor = valor;
    }
    public void exibir(){
        System.out.printf("Filme: %-20s Sala: %d Assento: %02d Horário: %s Cliente: %-15s Valor: R$%.2f%n",filme, sala, assento, horario, cliente, valor);
    }
    public String getFilme(){ return filme; }
    public int getSala(){ return sala; }
    public String getHorario(){ return horario; }
    public int getAssento(){ return assento; }
    public String getCliente(){ return cliente; }
    public double getValor(){ return valor; }
}