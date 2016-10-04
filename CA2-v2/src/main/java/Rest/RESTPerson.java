/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import Entity.Person;
import Facade.personFacade;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author hamzalaroussi
 */
@Path("Person")
public class RESTPerson
{

    @Context
    private UriInfo context;
    private personFacade fp;
    private Person person;
    /**
     * Creates a new instance of GenericResource
     */
    public RESTPerson()
    {
    }
    
   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String getPerson(@PathParam("id") int id)// da vi giver den en id i url'en
    {

        Person p = fp.getPerson(id);
        return p.toString();
        

    }
   

    /**
     * Retrieves representation of an instance of Rest.RESTPerson
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml()
    {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of RESTPerson
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content)
    {
    }
}
