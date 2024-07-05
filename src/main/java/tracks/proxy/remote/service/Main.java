package tracks.proxy.remote.service;

//import tracks.proxy.remote.common.RemoteService;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author yitiansong
 * 2024/6/27-22:55
 */
public class Main {
    public static void main(String[] args) {
        try {
            RemoteService service = new RemoteServiceImpl();
            Naming.rebind("remoteService", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

