public class Program {
    public static void main(String[] args) {
        Produto p = new Produto("nori", 100.00);

        System.out.println(p.aplicarDesconto(10));
    }
}
