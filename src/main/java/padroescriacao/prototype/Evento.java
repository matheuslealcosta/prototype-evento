package padroescriacao.prototype;

public class Evento implements Cloneable {
    private int codigo;
    private String nome;
    private Local local;
    private String cidade;

    public Evento(int codigo, String nome, Local local, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public Evento clone() throws CloneNotSupportedException {
        Evento eventoClone = (Evento) super.clone();
        eventoClone.local = (Local) eventoClone.local.clone();
        return eventoClone;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", local=" + local +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
