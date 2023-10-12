import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Interface {
    public Server() throws RemoteException {
        // Constructor
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    public static void main(String[] args) {
        try {
            Server server = new Server();
            java.rmi.registry.LocateRegistry.createRegistry(1323); // Default RMI registry port
            java.rmi.Naming.rebind("Service", server);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
