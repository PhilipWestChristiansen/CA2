/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Id;

/**
 *
 * @author pwc
 */
public class CityInfo {
    
    @Id
    int id;
    
    String zipcode;
    String city;
}
