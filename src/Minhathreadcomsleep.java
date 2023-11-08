public class Minhathreadcomsleep extends Thread{

    String nome;

    public Minhathreadcomsleep(String nome){
        this.nome = nome;
        start();
    }
    
    public void run(){
        try {
            for(int i = 1; i <=10; i++){
                sleep(1500);  
                System.out.println("Thread "+ nome + ":" + i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}