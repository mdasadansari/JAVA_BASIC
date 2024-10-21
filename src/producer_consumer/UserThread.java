package producer_consumer;

import java.util.concurrent.TimeUnit;

public class UserThread{
    public static void main(String[] args) throws InterruptedException {
        CompanyWithChecks company = new CompanyWithChecks();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);
        producer.start();
        consumer.start();


    }
}
    class Producer extends Thread {
        CompanyWithChecks c;

        Producer(CompanyWithChecks c) {
            this.c = c;
        }

        @Override
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.c.produceItem(i);
                    i++;
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    class Consumer extends Thread {
        CompanyWithChecks c;

        Consumer(CompanyWithChecks c) {
            this.c = c;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    this.c.consumeItem();
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
