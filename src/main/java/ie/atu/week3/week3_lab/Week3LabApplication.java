package ie.atu.week3.week3_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients


public class Week3LabApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3LabApplication.class, args);
    }

}


