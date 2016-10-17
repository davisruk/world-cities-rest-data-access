package uk.co.rdavisitservices.world.repositories;

import java.io.Serializable;

import org.springframework.data.rest.webmvc.spi.BackendIdConverter;
import org.springframework.stereotype.Component;

import uk.co.rdavisitservices.world.model.CountryLanguage;
import uk.co.rdavisitservices.world.model.CountryLanguagePK;

@Component
public class CountryLanguagePKBackendConverter implements BackendIdConverter {

	@Override
	public boolean supports(Class<?> type) {
		// TODO Auto-generated method stub
		boolean doesSupport = CountryLanguage.class.equals(type); 
		//System.out.println("supports called, type is " + type.getName() + " returning " + doesSupport);
		return doesSupport;
	}

	@Override
	public Serializable fromRequestId(String id, Class<?> entityType) {
		// TODO Auto-generated method stub
		String[] parts = id.split("_");
		//System.out.println("from called, split is " + parts[0] + " and " + parts[1] );
		return new CountryLanguagePK(parts[0], parts[1]);
	}

	@Override
	public String toRequestId(Serializable source, Class<?> entityType) {
		String toVal = ((CountryLanguagePK)source).toString(); 
		//System.out.println("to called returning " + toVal);
		return toVal;
	}

}
