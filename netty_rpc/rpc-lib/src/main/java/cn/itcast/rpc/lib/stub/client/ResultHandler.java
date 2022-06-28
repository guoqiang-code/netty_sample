package cn.itcast.rpc.lib.stub.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * 远程方法的回调结果处理类
 */
public class ResultHandler extends ChannelInboundHandlerAdapter {
    /**
     * 远程调用的返回值结果
     */
    private Object response;

    /**
     * 读取服务器端返回的数据(远程调用的结果)  5
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object value) throws Exception {
        response = value;
        ctx.close();
    }

    // 6
    public Object getResponse() {
        return response;
    }
}