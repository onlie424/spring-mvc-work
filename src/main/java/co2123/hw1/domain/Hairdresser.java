package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Hairdresser {
    private int id;
    private String city;
    private String founder;
    private List<Stylist> stylists= new ArrayList<>();

    public int getId() {return id;}

    public String getCity() {return city;}
    public String getFounder(){return founder;}
    public List<Stylist> getStylists() {return stylists;}

    public void setId(int id) {this.id = id;}

    public void setCity(String city) {this.city = city;}

    public void setFounder(String founder) {this.founder = founder;}

    public void setStylists(List<Stylist> stylists) {this.stylists = stylists;}

}
