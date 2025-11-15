import java.util.ArrayList;
import java.util.List;

public class Aluno {
//    Exercicio 06: Crie Aluno com atributos e calcularMedia()

    private String nome;
    private String turma;
    private List<Double> notas = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String nome, String turma, List<Double> notas) {
        this.nome = nome;
        this.turma = turma;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void addNota(Double nota) {
        this.notas.add(nota);
    }

    public Double calcularMedia(){
        Double media = 0.0;
        for(Double n : notas){
            media += n;
        }
        return media / this.notas.size();
    }
}
