public class Site {
    private String nome;
    private String link;

    public Site(String nome, String link) {
        this.nome = nome;
        this.link = link;
    }

    public String getNome() {
        return nome;
    }

    public String getLink() {
        return link;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Site [nome=" + nome + ", link=" + link + "] - ";
    }

}
