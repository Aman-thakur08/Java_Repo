public class P16_MultiThreading_Synchronization {

 public static void main(String[] args) throws InterruptedException {

  S obj = new S();
  Thread t1 = new Thread(new Runnable() {
   @Override
   public void run() {
    for (int i = 1; i <= 100; i++) {

     obj.webcount();

    }
   }
  });

  Thread threadTwo = new Thread(new Runnable() {
   @Override
   public void run() {
    for (int i = 1; i <= 1000; i++) {

     obj.webcount();

    }
   }
  });

  threadOne.start();
  threadTwo.start();
threadOne.join();
threadTwo.join();

  System.out.println("Count: " + WebCount.count);

 }

}

class S {

 public static int count = 0;

 
 public synchronized void webcount() {
  
  
  count++;
 }
}
