package tracks.proxy.remote.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author yitiansong
 * 2024/6/27-22:18
 */
public interface RemoteService extends Remote {
    String sayHello() throws RemoteException;
}
