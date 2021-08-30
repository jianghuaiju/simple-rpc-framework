package framework.rpc.compress;

import framework.rpc.extension.SPI;

/**
 * @author wenjiangli .
 * @createTime on 2021/08/3
 */

@SPI
public interface Compress {

    byte[] compress(byte[] bytes);


    byte[] decompress(byte[] bytes);
}
