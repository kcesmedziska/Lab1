package lab1.controller;

import lab1.dto.HostDTO;
import lab1.model.Host;
import lab1.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hosts")
public class HostController {
    @Autowired
    private HostService hostService;

    @GetMapping
    public List<Host> findAll() {
        return hostService.findAll();
    }

    @PostMapping
    public Host create(@RequestBody HostDTO hostDTO) {
        Host host = new Host();
        host.setName(hostDTO.getName());
        host.setSurname(hostDTO.getSurname());
        // Note: Country would need to be set here via countryService.findById(hostDTO.getCountryId())
        return hostService.save(host);
    }

    @GetMapping("/{id}")
    public Host findById(@PathVariable Long id) {
        return hostService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        hostService.delete(id);
    }
}