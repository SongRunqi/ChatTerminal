package tracks.proxy.remote.service;


//import tracks.proxy.remote.common.RemoteService;

//import java.io.Serial;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author yitiansong
 * 2024/6/27-22:19
 */
public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {
//    @Serial
    private static final long serialVersionUID = 1L;


    public RemoteServiceImpl() throws RemoteException {
    }


    @Override
    public String sayHello() {
        String string = "hello, this is the remote object RemoteServiceImpl.sayHello method";
        System.out.println(string);
        return string;
    }
}
