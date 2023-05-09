import java.util.*;

class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    private UUID id;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        id = UUID.randomUUID();

    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Id: " + this.id + " Nome: " + this.nome + " Sobrenome: " + this.sobrenome + " Salario: " + this.salario;
    }

}

public class NewList {

    public static void convertToUpperCase(List<Empregado> list) {
        ListIterator<Empregado> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Empregado emp = iterator.next();
            String nome = emp.getNome().toUpperCase();
            String sobrenome = emp.getSobrenome().toUpperCase();
            emp.setNome(nome);
            emp.setSobrenome(sobrenome);
            iterator.set(emp);
        }
    }

    public static void main(String[] args) {

        List<Empregado> vetor = new ArrayList<Empregado>();
        vetor.add(new Empregado("joao", "Silva", 1000));
        vetor.add(new Empregado("maria", "Silva", 2000));
        vetor.add(new Empregado("jose", "Silva", 3000));

        Iterator<Empregado> it = vetor.iterator();

        convertToUpperCase(vetor);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // List<String> list = new ArrayList<String>();
        // list.add("Hello");
        // list.add("World");
        // list.add("HAHAHAHA");
        // for (String str : list) {
        // System.out.println(str);
        // }

    }
}
