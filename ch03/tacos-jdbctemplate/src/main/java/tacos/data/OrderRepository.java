package tacos.data;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

	List<TacoOrder> findByDeliveryZip(String deliveryZip);}

	 
