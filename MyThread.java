
public class MyThread extends Thread {
    private volatile boolean potok = true;
    String floatStr = String.valueOf(DogsPooGolf.canDistance).substring(0,5);
    public void run() {

            System.out.println("\n Oops!!! your dog pooped. You can throw it now. \n\n The distance to a garbage can is: " +
                    floatStr + " ft. \n\n \t Don't forget a bag ;)");
            while (potok) {
                System.out.println("Press Enter when you are ready to throw");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
    }
    public void shutdown () {
        this.potok = false;
    }
}

