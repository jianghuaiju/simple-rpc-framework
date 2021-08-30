package framework.rpc.serviceimpl;

import framework.rpc.Hello;
import framework.rpc.HelloService;
import framework.rpc.annotation.RpcService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wenjiangli
 * @createTime 2021年05月10日 07:52:00
 */
@Slf4j
@RpcService(group = "test1", version = "version1")
public class HelloServiceImpl implements HelloService {

    static {
        System.out.println("HelloServiceImpl被创建");
    }

    @Override
    public String hello(Hello hello) {
        log.info("HelloServiceImpl收到: {}.", hello.getMessage());
        String result = "Hello description is " + hello.getDescription();
        log.info("HelloServiceImpl返回: {}.", result);
        return result;
    }
}
