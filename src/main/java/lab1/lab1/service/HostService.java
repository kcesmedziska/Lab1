package lab1.service;

import lab1.model.Host;
import lab1.repository.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostService {
    @Autowired
    private HostRepository hostRepository;

    public List<Host> findAll() {
        return hostRepository.findAll();
    }

    public Host save(Host host) {
        return hostRepository.save(host);
    }

    public Host findById(Long id) {
        return hostRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        hostRepository.deleteById(id);
    }
}