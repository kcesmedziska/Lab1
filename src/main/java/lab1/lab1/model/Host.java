package lab1.model;

import javax.persistence.*;

@Entity
public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String surname;
    
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }
}