package e_commerce.poc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import e_commerce.poc.entity.CatgEnty;

@Repository
public interface CategoryRepos extends CrudRepository<CatgEnty,Integer>{

}
