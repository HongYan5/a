package com.example.demo.com.example.demo;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) throws MQClientException, InterruptedException, RemotingException, MQBrokerException {
		//SpringApplication.run(Demo1Application.class, args);
		DefaultMQProducer producer = new DefaultMQProducer("my-group-name-A");
		producer.setNamesrvAddr("localhost:9876");
		producer.start();
		for (int i = 0; i < 5; i++) {
			Message message = new Message("aa","a"+i,("Message : My blog address guozh.net"+i).getBytes());
			producer.send(message);
		}
		
		System.out.println("Message sended");
		producer.shutdown();
	}

}
