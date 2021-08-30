package framework.rpc.utils;

/**
 * @author wenjiangli
 * @createTime 2021年06月18日 15:43:00
 */
public class RuntimeUtil {
    /**
     * 获取CPU的核心数
     *
     * @return cpu的核心数
     */
    public static int cpus() {
        return Runtime.getRuntime().availableProcessors();
    }
}
