package model.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Date;

public class Seller implements Serializable{

    private static final long serialVersionUID = 1L;
    private Integer Id;
    private String name;
    private String email;
    private Date BirthDate;
    private Double baseSalary;

    private Department department;
    
    public Seller(){
        
    }

    public Seller(Integer Id, String name, String email, Date BirthDate, Double baseSalary, Department department) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.BirthDate = BirthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.Id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seller other = (Seller) obj;
        return Objects.equals(this.Id, other.Id);
    }

    @Override
    public String toString() {
        return "Seller{" + "Id=" + Id + ", name=" + name + ", email=" + email + ", BirthDate=" + BirthDate + ", baseSalary=" + baseSalary + ", department=" + department + '}';
    }        
}
