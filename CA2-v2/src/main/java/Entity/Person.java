/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author pwc
 */
@Entity
public class Person extends InfoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    String firstName;
    String lastName;
    
    @ManyToMany
    List<Hobby> hobbies;
    
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, List<Hobby> hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hobbies = hobbies;
    }

    public Person(String firstName, String lastName, List<Hobby> hobbies, int id, String email) {
        super(id, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.hobbies = hobbies;
    }
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    
}
