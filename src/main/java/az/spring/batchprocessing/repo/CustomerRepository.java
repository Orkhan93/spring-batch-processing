package az.spring.batchprocessing.repo;

import az.spring.batchprocessing.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}