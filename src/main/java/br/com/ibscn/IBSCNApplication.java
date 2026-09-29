package br.com.ibscn;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class IBSCNApplication {

    public static final String TIMEZONE = "America/Sao_Paulo";

    public static void main(String[] args) {
        SpringApplication.run(IBSCNApplication.class, args);
    }

    @PostConstruct
    public void setDefaultTimezone() {
        TimeZone.setDefault(TimeZone.getTimeZone(TIMEZONE));
    }
}
