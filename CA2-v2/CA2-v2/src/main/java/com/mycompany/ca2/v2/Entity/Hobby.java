/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2.v2.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author pwc
 */
@Entity
public class Hobby {
    
    @Id
    int id;
    
    String name;
    String description;
}
