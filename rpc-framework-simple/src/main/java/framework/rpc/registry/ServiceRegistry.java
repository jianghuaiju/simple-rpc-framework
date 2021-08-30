package framework.rpc.registry;

import framework.rpc.extension.SPI;

import java.net.InetSocketAddress;

/**
 * service registration
 *
 * @author wenjiangli
 * @createTime 2021年05月13日 08:39:00
 */
@SPI
public interface ServiceRegistry {
    /**
     * register service
     *
     * @param rpcServiceName    rpc service name
     * @param inetSocketAddress service address
     */
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);

}
