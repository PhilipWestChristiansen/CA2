package Entity;

import Entity.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-04T14:34:51")
@StaticMetamodel(CityInfo.class)
public class CityInfo_ { 

    public static volatile SingularAttribute<CityInfo, String> zipcode;
    public static volatile ListAttribute<CityInfo, Address> addresses;
    public static volatile SingularAttribute<CityInfo, String> city;
    public static volatile SingularAttribute<CityInfo, Integer> id;

}