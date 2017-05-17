package com.samit.springservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends CrudRepository<Order, Integer>{
	 List<Order> findByOrderArchived(@Param("archivedfalse") int orderArchivedFalse);

	 List<Order> findByOrderStatus(@Param("status") String orderStatus);
}
