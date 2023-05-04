package az.spring.batchprocessing.config;

import az.spring.batchprocessing.entity.Customer;
import az.spring.batchprocessing.repo.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomerWriter implements ItemWriter<Customer> {

    private final CustomerRepository customerRepository;

    @Override
    public void write(List<? extends Customer> list) throws Exception {
        System.out.println("Thread Name:" + Thread.currentThread().getName());
        customerRepository.saveAll(list);
    }

}