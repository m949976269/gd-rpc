package io.goudai.commons;

/**
 * Created by freeman on 2016/1/8.
 * 生命周期抽象接口 网络事件请实现此接口方便进行管理
 */
public interface LifeCycle {
    /**
     * 启动事件处理器
     *
     * @throws Exception
     */
    void startup();

    /**
     * 关闭事件处理器并且清理资源
     *
     * @throws Exception
     */
    void shutdown();
}

