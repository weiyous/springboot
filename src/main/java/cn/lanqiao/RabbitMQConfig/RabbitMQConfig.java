package cn.lanqiao.RabbitMQConfig;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;




@SpringBootConfiguration
public class RabbitMQConfig {

	  @Bean(name = "boot_exchange")
	    public Exchange createExchange(){
	        return ExchangeBuilder.topicExchange("boot_exchange").durable(true).build();
	    }

	    @Bean(name = "boot_queue")
	    public Queue createQueue(){
	        return QueueBuilder.durable("boot_queue").build();
	    }

	    @Bean
	    public Binding createBinding(@Qualifier("boot_queue") Queue queue,@Qualifier("boot_exchange") Exchange exchange){
	        return BindingBuilder.bind(queue).to(exchange).with("boot.#").noargs();
	    }

}

