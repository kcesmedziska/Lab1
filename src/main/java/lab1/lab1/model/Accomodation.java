package lab1.model;

import javax.persistence.*;

@Entity
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @Enumerated(EnumType.STRING)
    private AccommodationCategory category;
    
    @ManyToOne
    @JoinColumn(name = "host_id")
    private Host host;
    
    private Integer numRooms;
    private Boolean isRented = false;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public AccommodationCategory getCategory() { return category; }
    public void setCategory(AccommodationCategory category) { this.category = category; }
    public Host getHost() { return host; }
    public void setHost(Host host) { this.host = host; }
    public Integer getNumRooms() { return numRooms; }
    public void setNumRooms(Integer numRooms) { this.numRooms = numRooms; }
    public Boolean getIsRented() { return isRented; }
    public void setIsRented(Boolean rented) { isRented = rented; }
}