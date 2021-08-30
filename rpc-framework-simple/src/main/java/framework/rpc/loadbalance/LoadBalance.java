package framework.rpc.loadbalance;

import framework.rpc.extension.SPI;
import framework.rpc.remoting.dto.RpcRequest;

import java.util.List;

/**
 * Interface to the load balancing policy
 *
 * @author wenjiangli
 * @createTime 2021年06月21日 07:44:00
 */
@SPI
public interface LoadBalance {
    /**
     * Choose one from the list of existing service addresses list
     *
     * @param serviceAddresses Service address list
     * @return target service address
     */
    String selectServiceAddress(List<String> serviceAddresses, RpcRequest rpcRequest);
}
