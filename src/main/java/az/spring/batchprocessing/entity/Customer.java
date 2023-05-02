package az.spring.batchprocessing.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers_info")
@Data
public class Customer {

    @Id
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String gender;
    private String contactNo;
    private String country;
    private String dob;

}