package com.luohua.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by luoh03 on 2017/5/19.
 */
public class TestHandler extends SimpleChannelInboundHandler{
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        String str= (String) o;
        System.out.println("收到client信息====="+str);
        channelHandlerContext.channel().writeAndFlush("服务端收到信息+++++++++++"+str);
    }
}
