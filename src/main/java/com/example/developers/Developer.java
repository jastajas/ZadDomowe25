package com.example.developers;

import javax.persistence.*;
import java.util.List;

@Entity
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String logoURL;
    private String activityDescription;

    @OneToOne(mappedBy = "developer")
    //@JoinColumn(name = "developer_id", referencedColumnName = "id")
    private DeveloperAdress developerAdress;

    @OneToMany(mappedBy = "developer")
    //@JoinColumn(name = "developer_id", referencedColumnName = "id")
    private List<Investment> investments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    public DeveloperAdress getDeveloperAdress() {
        return developerAdress;
    }

    public void setDeveloperAdress(DeveloperAdress developerAdress) {
        this.developerAdress = developerAdress;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }
}
