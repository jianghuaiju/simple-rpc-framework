package framework.rpc.provider;

import framework.rpc.config.RpcServiceConfig;

/**
 * store and provide service object.
 *
 * @author wenjiangli
 * @createTime 2021年05月31日 16:52:00
 */
public interface ServiceProvider {

    /**
     * @param rpcServiceConfig rpc service related attributes
     */
    void addService(RpcServiceConfig rpcServiceConfig);

    /**
     * @param rpcServiceName rpc service name
     * @return service object
     */
    Object getService(String rpcServiceName);

    /**
     * @param rpcServiceConfig rpc service related attributes
     */
    void publishService(RpcServiceConfig rpcServiceConfig);

}
