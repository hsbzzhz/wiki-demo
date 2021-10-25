package com.grundfos.wiki.rokectmq;

import com.grundfos.wiki.websocket.WebSocketServer;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

<<<<<<< HEAD
@Service
@RocketMQMessageListener(consumerGroup = "default", topic = "VOTE_TOPIC")
=======
>>>>>>> 179025d368434a519f09e5b41a8353b0dc2977f5
public class VoteTopicConsumer implements RocketMQListener<MessageExt> {

    private static final Logger LOG = LoggerFactory.getLogger(VoteTopicConsumer.class);

    @Resource
    public WebSocketServer webSocketServer;

    @Override
    public void onMessage(MessageExt messageExt) {
        byte[] body = messageExt.getBody();
        LOG.info("ROCKETMQ收到消息：{}", new String(body));
        webSocketServer.sendInfo(new String(body));
    }
}
