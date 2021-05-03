package e_commerce.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import e_commerce.poc.entity.CartDetails;

@Repository
public interface CartRepository extends CrudRepository<CartDetails,Integer>{

}
