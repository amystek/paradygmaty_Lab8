// TODO everything (not done at all)

package ThreadExecut;

public class ExecutorTest implements Runnable {
    @Override
    public void run() {
        for (;;) {
            System.out.println(Math.random());
            //Thread.sleep(1000);
        }
    }
}

//class NetworkService implements Runnable {
//    private final ServerSocket serverSocket;
//    private final ExecutorService pool;
//
//    public NetworkService(int port, int poolSize)
//            throws IOException {
//        serverSocket = new ServerSocket(port);
//        pool = Executors.newFixedThreadPool(poolSize);
//    }
//
//    public void run() { // run the service
//        try {
//            for (;;) {
//                pool.execute(new Handler(serverSocket.accept()));
//            }
//        } catch (IOException ex) {
//            pool.shutdown();
//        }
//    }
//}
//
//class Handler implements Runnable {
//    private final Socket socket;
//    Handler(Socket socket) { this.socket = socket; }
//    public void run() {
//        // read and service request on socket
//    }
//}
