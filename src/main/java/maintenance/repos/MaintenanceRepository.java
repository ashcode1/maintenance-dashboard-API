package maintenance.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import maintenance.entities.Maintenance;
import java.lang.String;

@CrossOrigin
public interface MaintenanceRepository extends CrudRepository<Maintenance, Long> {
	
	// Get by date
	List<Maintenance> findByDate(@Param("date")String date);
	// eg. http://localhost:8080/api/maintenances/search/findByDate?date=2018-03-12
	
	// Get by category
	List<Maintenance> findByCategory(@Param("category")String category);
	// eg. http://localhost:8080/api/maintenances/search/findByCategory?category=Electrics
	
	// Get by account manager
	List<Maintenance> findByAccountManager(@Param("accountmanager")String accountmanager);
	// eg. http://localhost:8080/api/maintenances/search/findByAccountManager?accountmanager=Michael Johnson
	
	// Get by property type
	List<Maintenance> findByPropertyType(@Param("propertytype")String propertytype);
	// eg. http://localhost:8080/api/maintenances/search/findByPropertyType?propertytype=Apartment
	
	// get by cost
	List<Maintenance> findByCost(@Param("cost")String cost);
	// eg. http://localhost:8080/api/maintenances/search/findByCost?cost=250.00
	
}
