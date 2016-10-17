package uk.co.rdavisitservices.world.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import uk.co.rdavisitservices.world.model.City;
@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource (collectionResourceRel = "cities", path = "cities")
public interface CityRestfulRepository extends PagingAndSortingRepository<City, Integer> {

	List<City> findByName(@Param("name") String name);
	Page<City> findByNameContaining(@Param("name") String name, Pageable page);
	List<City> findByPopulationGreaterThan(@Param("population") Integer pop);
	List<City> findByPopulationLessThan(@Param("population") Integer pop);
	@RestResource(path = "cityWithLowestPopulation")
	City findTopByOrderByPopulation();
	
}
