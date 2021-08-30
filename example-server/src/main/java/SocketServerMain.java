import framework.rpc.HelloService;
import framework.rpc.config.RpcServiceConfig;
import framework.rpc.remoting.transport.socket.SocketRpcServer;
import framework.rpc.serviceimpl.HelloServiceImpl;

/**
 * @author wenjiangli
 * @createTime 2021年05月10日 07:25:00
 */
public class SocketServerMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        SocketRpcServer socketRpcServer = new SocketRpcServer();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        rpcServiceConfig.setService(helloService);
        socketRpcServer.registerService(rpcServiceConfig);
        socketRpcServer.start();
    }
}
