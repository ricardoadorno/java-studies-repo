public class Tarefa extends Thread {

        int id;
        int tempo;

        public Tarefa(int id, int tempo) {
                this.id = id;
                this.tempo = tempo;
        }

        public void run() {
                try {
                        System.out.println("Tarefa #" + id + " vai dormir por " + tempo + " milisegundos");
                        Thread.sleep(tempo);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                System.out.println("Tarefa #" + id + " finalizada");
        }

}
