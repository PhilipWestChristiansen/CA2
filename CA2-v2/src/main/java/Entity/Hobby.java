package Entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Hobby")
public class Hobby
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String description;
<<<<<<< HEAD

    @ManyToMany(mappedBy = "hobbies")
=======
    
    @ManyToMany(mappedBy = "hobbies", cascade = 
        {CascadeType.PERSIST, CascadeType.MERGE})
>>>>>>> e8508595517e6856a5a152e1cc7b401d9b5954db
    private List<Person> persons;

    public Hobby()
    {
    }

    public Hobby(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

}
