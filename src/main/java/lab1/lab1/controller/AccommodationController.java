package lab1.controller;

import lab1.dto.AccommodationDTO;
import lab1.model.Accommodation;
import lab1.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {
    @Autowired
    private AccommodationService accommodationService;

    @GetMapping
    public List<Accommodation> findAll() {
        return accommodationService.findAll();
    }

    @PostMapping
    public Accommodation create(@RequestBody AccommodationDTO accommodationDTO) {
        Accommodation accommodation = new Accommodation();
        accommodation.setName(accommodationDTO.getName());
        accommodation.setCategory(AccommodationCategory.valueOf(accommodationDTO.getCategory()));
        accommodation.setNumRooms(accommodationDTO.getNumRooms());
        accommodation.setIsRented(accommodationDTO.getIsRented());
        // Note: Host would need to be set here via hostService.findById(accommodationDTO.getHostId())
        return accommodationService.save(accommodation);
    }

    @GetMapping("/{id}")
    public Accommodation findById(@PathVariable Long id) {
        return accommodationService.findById(id);
    }

    @PutMapping("/{id}")
    public Accommodation update(@PathVariable Long id, @RequestBody AccommodationDTO accommodationDTO) {
        Accommodation accommodation = accommodationService.findById(id);
        if (accommodation != null) {
            accommodation.setName(accommodationDTO.getName());
            accommodation.setCategory(AccommodationCategory.valueOf(accommodationDTO.getCategory()));
            accommodation.setNumRooms(accommodationDTO.getNumRooms());
            accommodation.setIsRented(accommodationDTO.getIsRented());
            return accommodationService.save(accommodation);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        accommodationService.delete(id);
    }

    @PutMapping("/{id}/rent")
    public Accommodation markAsRented(@PathVariable Long id) {
        return accommodationService.markAsRented(id);
    }
}