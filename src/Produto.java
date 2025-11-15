public class Produto {
//    Exercicio 5: Crie Produto com preço e méthodo aplicarDesconto()

    private String nome;
    private Double price;

    public Produto() {
    }

    public Produto(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double aplicarDesconto(Integer desconto){
        return this.price = this.price - this.price * (desconto / 100.0);
    }
}
