public class Minhathreadsemsleep extends Thread {
    String nome;

    public Minhathreadsemsleep(String nome){
        this.nome = nome;
        start();
    }
    
    public void run(){
        try {
            for(int i = 1; i <=10; i++){
                System.out.println("Thread "+ nome + ":" + i);
                if(i==10){
                    System.out.println("---------------------");
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}