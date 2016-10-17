package uk.co.rdavisitservices.world;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WorldRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(WorldApplication.class);
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
/*
		log.info("Cities found with findAll():");
		log.info("-------------------------------");
		for (City city : cr.findAll()) {
			log.info(city.toString());
		}
        log.info("");
        
		String countryName = "Palestine";
        log.info("Cities found with findByCountry(" + countryName + "):");
		log.info("-------------------------------");
		for (City city : cr.findByCountryName(countryName)) {
			log.info(city.toString());
		}
        log.info("");

        log.info("Cities found with population > 10,000,000");
		log.info("-------------------------------");
		for (City city : cr.findByPopulationGreaterThan(10000000)) {
			log.info(city.toString());
		}
        log.info("");

        log.info("Cities found with population > 10,000,000");
		log.info("-------------------------------");
		//log.info("Total Cities in DB: " + cr.countById());
		log.info("Total Cities with population > 1,000,000: " + cr.countByPopulationGreaterThan(1000000));
		log.info("Total Cities with population > 1: " + cr.countByPopulationGreaterThan(1));
        log.info("");
*/
	}

}
