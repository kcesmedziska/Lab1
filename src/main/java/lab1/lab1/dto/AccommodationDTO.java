package lab1.dto;

public class AccommodationDTO {
    private Long id;
    private String name;
    private String category;
    private Long hostId;
    private Integer numRooms;
    private Boolean isRented;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public Long getHostId() { return hostId; }
    public void setHostId(Long hostId) { this.hostId = hostId; }
    public Integer getNumRooms() { return numRooms; }
    public void setNumRooms(Integer numRooms) { this.numRooms = numRooms; }
    public Boolean getIsRented() { return isRented; }
    public void setIsRented(Boolean rented) { isRented = rented; }
}