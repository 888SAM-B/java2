import java.rmi.*;
public interface rmiint extends Remote{
    String display() throws RemoteException;
}