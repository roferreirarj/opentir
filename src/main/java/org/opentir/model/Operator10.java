package org.opentir.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Operator10 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName11;
    private String lastName12;
    private String street13;
    private String city14;
    private String zipCode15;
    private String phoneNumber16;
    private String password17;
    private Date expirationDate18;
    
    @ManyToMany
    private List<Role20> role20s;
    
    
    @ManyToOne
    private Operator10 boss;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName11() {
        return firstName11;
    }

    public void setFirstName11(String firstName11) {
        this.firstName11 = firstName11;
    }

    public String getLastName12() {
        return lastName12;
    }

    public void setLastName12(String lastName12) {
        this.lastName12 = lastName12;
    }

    public String getStreet13() {
        return street13;
    }

    public void setStreet13(String street13) {
        this.street13 = street13;
    }

    public String getCity14() {
        return city14;
    }

    public void setCity14(String city14) {
        this.city14 = city14;
    }

    public String getZipCode15() {
        return zipCode15;
    }

    public void setZipCode15(String zipCode15) {
        this.zipCode15 = zipCode15;
    }

    public String getPhoneNumber16() {
        return phoneNumber16;
    }

    public void setPhoneNumber16(String phoneNumber16) {
        this.phoneNumber16 = phoneNumber16;
    }

    public Operator10 getBoss() {
        return boss;
    }

    public void setBoss(Operator10 boss) {
        this.boss = boss;
    }
    
    public String getPassword17() {
		return password17;
	}

	public void setPassword17(String password17) {
		this.password17 = password17;
	}

	public Date getExpirationDate18() {
		return expirationDate18;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate18 = expirationDate;
	}

	public List<Role20> getRole20s() {
		return role20s;
	}

	public void setRole20s(List<Role20> role20s) {
		this.role20s = role20s;
	}

	@Override
    public String toString() {
        return firstName11 + " " + lastName12;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Operator10) {
            Operator10 p = (Operator10) obj;
            if (this == p) {
                return true;
            }
            if (this.id == null || p.id == null) {
                return false;
            }
            return this.id.equals(p.id);
        }

        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }

}
