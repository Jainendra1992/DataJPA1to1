package com.example.onetoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	 @Id
	 private Integer id;
	 private String firstName;
	 private String lastName;
	 @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
	 private Address address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	 
	 
	 
}

// person reach to address and address reach 
//to person useing by direction
/*{
      {
         "id":105,
         "firstName":"Tanmay",
         "lastName":"Rao",
         "address":{
                  "id":105,
                  "houseNo":"128/BM",
                  "streetName":"BTM",
                  "person":{"id":105}
         }
      }
      {
         "id":101,
         "firstName":"Jainendra",
         "lastName":"kumar",
          "address":{
                  "id":101,
                  "houseNo":"127/BM",
                  "streetName":"BTM",
                 
         }
      }
      
      
      
       {
         "id":104,
         "firstName":"Ramu",
         "lastName":"Rao",
         "address":{
                  "id":104,
                  "houseNo":"125/JPA",
                  "streetName":"JP nagar"
                  
         }
      }
      
      
      
      
      
      
      
      
      
 * }
 * 
 * */
 