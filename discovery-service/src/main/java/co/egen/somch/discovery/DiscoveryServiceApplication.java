package co.egen.somch.discovery;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaIdentityHeaderFilter;
import com.sun.jersey.api.client.filter.ClientFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}

}
