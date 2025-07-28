package Services;

import Models.DTO.DTOProvider;
import entities.EntitiesProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicesProvider {

    @Autowired
    private Repository repo;

    public List<DTOProvider> getAllprovider(){
        List<EntitiesProvider> providers = repo.findAll();
        return providers.stream()
                .map(this::convertirProviderDTO)
                .collect(Collectors.toList());
    }
}
