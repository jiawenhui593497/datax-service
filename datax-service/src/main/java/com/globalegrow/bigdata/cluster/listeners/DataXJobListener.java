package com.globalegrow.bigdata.cluster.listeners;

import com.alibaba.nacos.api.config.listener.Listener;
import org.springframework.stereotype.Component;
import java.util.concurrent.Executor;

/**
 * @author ChengJie
 * @desciption
 * @date 2019/7/17 9:12
 **/
@Component
public class DataXJobListener implements Listener {
    @Override
    public Executor getExecutor() {
        return null;
    }

    @Override
    public void receiveConfigInfo(String configInfo) {

    }
}
