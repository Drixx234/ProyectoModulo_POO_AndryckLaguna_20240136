package Services;

import Models.DTO.DTOProvider;
import Repositories.RepositoryProvider;
import entities.EntitiesProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicesProvider {

    @Autowired
    private RepositoryProvider repo;

    public List<DTOProvider> getAllprovider(){
        List<EntitiesProvider> providers = repo.findAll();
        return providers.stream()
                .map(this::convertirProviderDTO)
                .collect(Collectors.toList());
    }

    private DTOProvider convertirProviderDTO(EntitiesProvider provider){
        DTOProvider dto = new DTOProvider();
        dto.setProviderID(dto.getProviderID());
        dto.setProviderName(dto.getProviderName());
        dto.setProviderPhone(dto.getProviderPhone());
        dto.setProviderAddress(dto.getProviderAddress());
        dto.setProviderEmail(dto.getProviderEmail());
        dto.setProviderCode(dto.getProviderCode());
        dto.setProviderStatus(dto.getProviderStatus());
        dto.setProviderComments(dto.getProviderComments());
        return dto;
    }
}

