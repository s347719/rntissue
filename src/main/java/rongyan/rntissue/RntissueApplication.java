package rongyan.rntissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.EntityGraph;



@SpringBootApplication
public class RntissueApplication {

    public static void main(String[] args) {
        SpringApplication.run(RntissueApplication.class, args);
    }

}
