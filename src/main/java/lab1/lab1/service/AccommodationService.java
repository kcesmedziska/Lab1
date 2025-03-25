package lab1.service;

import lab1.model.Accommodation;
import lab1.repository.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccommodationService {
    @Autowired
    private AccommodationRepository accommodationRepository;

    public List<Accommodation> findAll() {
        return accommodationRepository.findAll();
    }

    public Accommodation save(Accommodation accommodation) {
        return accommodationRepository.save(accommodation);
    }

    public Accommodation findById(Long id) {
        return accommodationRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        accommodationRepository.deleteById(id);
    }

    public Accommodation markAsRented(Long id) {
        Accommodation accommodation = findById(id);
        if (accommodation != null) {
            accommodation.setIsRented(true);
            return accommodationRepository.save(accommodation);
        }
        return null;
    }
}