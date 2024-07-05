package tracks.proxy.remote.client;

import tracks.proxy.remote.common.RemoteService;
import tracks.proxy.remote.service.RemoteServiceImpl;

import java.net.MalformedURLException;
//import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author yitiansong
 * 2024/6/27-22:31
 */
public class Main {
    public static void main(String[] args) {
        try {
            RemoteService remoteService = (RemoteService)Naming.lookup("rmi://127.0.0.1:1099/remoteService");
            String result = remoteService.sayHello();
            System.out.println("result = " + result);
        } catch (RemoteException | MalformedURLException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
