package Entity;

import Entity.InfoEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-04T11:03:57")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, String> additionalInfo;
    public static volatile ListAttribute<Address, InfoEntity> infoentities;
    public static volatile SingularAttribute<Address, Integer> id;

}