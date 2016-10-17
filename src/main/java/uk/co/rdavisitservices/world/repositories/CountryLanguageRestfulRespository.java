package uk.co.rdavisitservices.world.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uk.co.rdavisitservices.world.model.Country;
import uk.co.rdavisitservices.world.model.CountryLanguage;
import uk.co.rdavisitservices.world.model.CountryLanguagePK;

@RepositoryRestResource (collectionResourceRel = "languages", path = "languages")
public interface CountryLanguageRestfulRespository extends PagingAndSortingRepository<CountryLanguage, CountryLanguagePK> {
	List<Country> findByIdLanguage(@Param("language") CountryLanguagePK language);
}
