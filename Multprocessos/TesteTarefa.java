public class TesteTarefa {

    public static void main(String[] args) {
        Tarefa t1 = new Tarefa(1, 1000);
        Tarefa t2 = new Tarefa(2, 2000);
        Tarefa t3 = new Tarefa(3, 3000);

        t1.start();
        t2.start();
        t3.start();

    }

}
