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
public class Phone {
    
    @Id
    int id;
    
    int number;
    String description;
    
}
