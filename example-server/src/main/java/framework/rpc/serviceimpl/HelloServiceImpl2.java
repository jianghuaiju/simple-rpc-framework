package framework.rpc.serviceimpl;

import framework.rpc.Hello;
import framework.rpc.HelloService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wenjiangli
 * @createTime 2021年05月10日 07:52:00
 */
@Slf4j
public class HelloServiceImpl2 implements HelloService {

    static {
        System.out.println("HelloServiceImpl2被创建");
    }

    @Override
    public String hello(Hello hello) {
        log.info("HelloServiceImpl2收到: {}.", hello.getMessage());
        String result = "Hello description is " + hello.getDescription();
        log.info("HelloServiceImpl2返回: {}.", result);
        return result;
    }
}
