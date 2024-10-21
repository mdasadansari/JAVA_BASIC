package producer_consumer;

class CompanyWithChecks{
    int i;
    boolean check =true;
    synchronized void produceItem(int i) throws InterruptedException {
        if (check){
            this.i = i;
            System.out.println("Produced "+i);
            check = false;
            notify();
        }
        wait();
    }
    synchronized void consumeItem() throws InterruptedException {
        if(!check){
            System.out.println("Consumed "+this.i);
            check=true;
            notify();
        }
        wait();
    }
}