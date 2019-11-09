package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//启动客户端进程
//@EnableDiscoveryClient//仅仅具备发现能力
@EnableEurekaClient
//和EnableEurekaServer区别在于，仅仅
//具备发现，和注册的能力
@EnableZuulProxy
public class StarterClient01 {
	public static void main(String[] args) {
		SpringApplication.run(StarterClient01.class, args);
	}
}





