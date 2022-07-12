class A {

 public static void main(String args[]) throws InterruptedException {

  WebCount obj = new WebCount();
  //System.out.println(Thread.currentThread().getName());
  	Thread t1 = new Thread(new Runnable() {
   		//@Override
   		public void run() {
    		for (int i = 1; i <= 100; i++) {

     			obj.webcount();

    		}
   	}
  });

  	Thread t2 = new Thread(new Runnable() {
   		//@Override
   		public void run() {
		for (int i = 1; i <= 100; i++) {
     			obj.webcount();

    		}
   	}
  });
	Thread t3 = new Thread(new Runnable() {
   		@Override
   		public void run() {
    		for (int i = 1; i <= 100; i++) {

     			obj.webcount();

    		}
   	}
  });
	Thread t4 = new Thread(new Runnable() {
   		@Override
   		public void run() {
    		for (int i = 1; i <= 100; i++) {

     			obj.webcount();

    		}
   	}
  });
	Thread t5 = new Thread(new Runnable() {
   		@Override
   		public void run() {
    		for (int i = 1; i <= 100; i++) {

     			obj.webcount();

    		}
   	}
  });
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	t5.join();
	System.out.println(WebCount.count);
}
}
class WebCount {

 public static int count = 5;
 public synchronized void webcount() {
  
 
  count+=5;
 }
}