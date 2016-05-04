/*
 * Copy from Alibaba Dubbo Framework
 *
 */
package com.alibaba.dubbo.rpc.remoting;

import java.net.InetSocketAddress;
import java.util.Collection;

public interface Server extends Endpoint {
    
    /**
     * is bound.
     * 
     * @return bound
     */
    boolean isBound();

    /**
     * get channels.
     * 
     * @return channels
     */
    Collection<Channel> getChannels();

    /**
     * get channel.
     * 
     * @param remoteAddress
     * @return channel
     */
    Channel getChannel(InetSocketAddress remoteAddress);
    
}