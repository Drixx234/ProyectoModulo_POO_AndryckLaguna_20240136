package Repositories;

import entities.EntitiesProvider;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RepositoryProvider extends JpaRepository<EntitiesProvider, Long> { }
