import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {
    int add(int a, int b) throws RemoteException;
}
