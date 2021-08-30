package framework.rpc.remoting.transport;

import framework.rpc.extension.SPI;
import framework.rpc.remoting.dto.RpcRequest;

/**
 * send RpcRequest。
 *
 * @author wenjiangli
 * @createTime 2021年05月29日 13:26:00
 */
@SPI
public interface RpcRequestTransport {
    /**
     * send rpc request to server and get result
     *
     * @param rpcRequest message body
     * @return data from server
     */
    Object sendRpcRequest(RpcRequest rpcRequest);
}
