package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new BuddyInfo("Jack", "Ottawa","524841741"));
            repository.save(new BuddyInfo("Chloe", "Toronto","595844741"));
            repository.save(new BuddyInfo("Kim", "Montreal","52942432741"));
            repository.save(new BuddyInfo("David", "Waterloo","9746236345"));
            repository.save(new BuddyInfo("Michelle", "Brampton","124855425"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo buddyInfo : repository.findAll()) {
                log.info(buddyInfo.toString());
            }
            log.info("");

//
            // fetch customers by last name
            log.info("Customer found with findByLastName('Kim'):");
            log.info("--------------------------------------------");
            repository.findByName("Kim").forEach(kim -> {
                log.info(kim.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
        };
    }

}