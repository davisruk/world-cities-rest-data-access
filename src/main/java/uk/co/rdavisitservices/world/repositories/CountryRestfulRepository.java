package uk.co.rdavisitservices.world.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uk.co.rdavisitservices.world.model.Country;

@RepositoryRestResource (collectionResourceRel = "countries", path = "countries")
public interface CountryRestfulRepository extends PagingAndSortingRepository<Country, String> {

	List<Country> findByName(@Param("name") String name);
}
