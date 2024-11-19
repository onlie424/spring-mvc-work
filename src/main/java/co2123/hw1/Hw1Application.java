package co2123.hw1;

import co2123.hw1.domain.Hairdresser;
import co2123.hw1.domain.Stylist;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {
    public static List<Hairdresser> hairdressers = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }
    @Override
    public void run(String... args) {
        Hairdresser hairdresser= new Hairdresser();
        hairdresser.setId(1);
        hairdresser.setCity("London");
        hairdresser.setFounder("Beauty Queens");
        List<Stylist> stylists= new ArrayList<>();

        Stylist stylist= new Stylist();
        stylist.setName("Alice");
        stylist.setExpertise("Color Specialist");
        stylist.setPrice(200);
        stylist.setQualification("Certified colorist");
        stylists.add(stylist);

        stylist= new Stylist();
        stylist.setName("Sam");
        stylist.setExpertise("Locks Specialist");
        stylist.setPrice(150);
        stylist.setQualification("Certified Locks Specialist");
        stylists.add(stylist);


        hairdresser.setStylists(stylists);
//        System.out.println(hairdresser);
        hairdressers.add(hairdresser);

    }
}
