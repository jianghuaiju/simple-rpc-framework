package framework.rpc.loadbalance.loadbalancer;

import framework.rpc.loadbalance.AbstractLoadBalance;
import framework.rpc.remoting.dto.RpcRequest;

import java.util.List;
import java.util.Random;

/**
 * Implementation of random load balancing strategy
 *
 * @author wenjiangli
 * @createTime 2021年06月21日 07:47:00
 */
public class RandomLoadBalance extends AbstractLoadBalance {
    @Override
    protected String doSelect(List<String> serviceAddresses, RpcRequest rpcRequest) {
        Random random = new Random();
        return serviceAddresses.get(random.nextInt(serviceAddresses.size()));
    }
}
