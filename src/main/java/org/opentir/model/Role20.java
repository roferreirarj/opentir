/**
 * 
 */
package org.opentir.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Patrick
 *
 */

@Entity
public class Role20 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name21;
	private String description22;
	
	@ManyToMany
	private List<Operator10> operator10s;
	
	public String getName21() {
		return name21;
	}
	public void setName21(String name21) {
		this.name21 = name21;
	}
	public String getDescription22() {
		return description22;
	}
	public void setDescription22(String description22) {
		this.description22 = description22;
	}
	public List<Operator10> getOperator10s() {
		return operator10s;
	}
	public void setOperator10s(List<Operator10> operator10s) {
		this.operator10s = operator10s;
	}

}
