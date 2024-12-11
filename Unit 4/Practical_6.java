public class Practical_6 {

    // Function to display even numbers
    static class EvenNumberThread extends Thread {
        private int start, end;

        public EvenNumberThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even: " + i);
                    try {
                        Thread.sleep(300); // Wait for 300 milliseconds
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }

    // Function to display odd numbers
    static class OddNumberThread extends Thread {
        private int start, end;

        public OddNumberThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd: " + i);
                    try {
                        Thread.sleep(300); // Wait for 300 milliseconds
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Check if correct number of arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java NumberDisplayApp <start> <end>");
            System.exit(1);
        }

        // Parse the range from the command line arguments
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        // Create the threads for even and odd number display
        Thread evenThread = new EvenNumberThread(start, end);
        Thread oddThread = new OddNumberThread(start, end);

        // Start the threads
        evenThread.start();
        oddThread.start();

        try {
            // Wait for both threads to finish
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }

        // Print message after both threads have finished
        System.out.println("Both threads completed");
    }
}
