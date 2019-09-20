package com.simpleapi.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Employees", schema="dbo")
public class Employees implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="EmployeeID", unique=true, nullable=false, precision=10)
    private int employeeId;
    @Column(name="LastName", nullable=false, length=20)
    private String lastName;
    @Column(name="FirstName", nullable=false, length=10)
    private String firstName;
    @Column(name="Title", length=30)
    private String title;
    @Column(name="TitleOfCourtesy", length=25)
    private String titleOfCourtesy;
    @Column(name="BirthDate")
    private Timestamp birthDate;
    @Column(name="HireDate")
    private Timestamp hireDate;
    @Column(name="Address", length=60)
    private String address;
    @Column(name="City", length=15)
    private String city;
    @Column(name="Region", length=15)
    private String region;
    @Column(name="PostalCode", length=10)
    private String postalCode;
    @Column(name="Country", length=15)
    private String country;
    @Column(name="HomePhone", length=24)
    private String homePhone;
    @Column(name="Extension", length=4)
    private String extension;
    //    @Column(name="Photo")
//    private Blob photo;
//    @Column(name="Notes", length=1073741823)
//    private Clob notes;
    @Column(name="PhotoPath", length=255)
    private String photoPath;
    @OneToOne
    @JoinColumn(name="ReportsTo", referencedColumnName = "EmployeeID")
    private Employees reportsTo;

    public Employees() {

    }

    /**
     * Access method for employeeId.
     *
     * @return the current value of employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Setter method for employeeId.
     *
     * @param aEmployeeId the new value for employeeId
     */
    public void setEmployeeId(int aEmployeeId) {
        employeeId = aEmployeeId;
    }

    /**
     * Access method for lastName.
     *
     * @return the current value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method for lastName.
     *
     * @param aLastName the new value for lastName
     */
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    /**
     * Access method for firstName.
     *
     * @return the current value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method for firstName.
     *
     * @param aFirstName the new value for firstName
     */
    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    /**
     * Access method for title.
     *
     * @return the current value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for title.
     *
     * @param aTitle the new value for title
     */
    public void setTitle(String aTitle) {
        title = aTitle;
    }

    /**
     * Access method for titleOfCourtesy.
     *
     * @return the current value of titleOfCourtesy
     */
    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    /**
     * Setter method for titleOfCourtesy.
     *
     * @param aTitleOfCourtesy the new value for titleOfCourtesy
     */
    public void setTitleOfCourtesy(String aTitleOfCourtesy) {
        titleOfCourtesy = aTitleOfCourtesy;
    }

    /**
     * Access method for birthDate.
     *
     * @return the current value of birthDate
     */
    public Timestamp getBirthDate() {
        return birthDate;
    }

    /**
     * Setter method for birthDate.
     *
     * @param aBirthDate the new value for birthDate
     */
    public void setBirthDate(Timestamp aBirthDate) {
        birthDate = aBirthDate;
    }

    /**
     * Access method for hireDate.
     *
     * @return the current value of hireDate
     */
    public Timestamp getHireDate() {
        return hireDate;
    }

    /**
     * Setter method for hireDate.
     *
     * @param aHireDate the new value for hireDate
     */
    public void setHireDate(Timestamp aHireDate) {
        hireDate = aHireDate;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(String aAddress) {
        address = aAddress;
    }

    /**
     * Access method for city.
     *
     * @return the current value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for city.
     *
     * @param aCity the new value for city
     */
    public void setCity(String aCity) {
        city = aCity;
    }

    /**
     * Access method for region.
     *
     * @return the current value of region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Setter method for region.
     *
     * @param aRegion the new value for region
     */
    public void setRegion(String aRegion) {
        region = aRegion;
    }

    /**
     * Access method for postalCode.
     *
     * @return the current value of postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter method for postalCode.
     *
     * @param aPostalCode the new value for postalCode
     */
    public void setPostalCode(String aPostalCode) {
        postalCode = aPostalCode;
    }

    /**
     * Access method for country.
     *
     * @return the current value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(String aCountry) {
        country = aCountry;
    }

    /**
     * Access method for homePhone.
     *
     * @return the current value of homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Setter method for homePhone.
     *
     * @param aHomePhone the new value for homePhone
     */
    public void setHomePhone(String aHomePhone) {
        homePhone = aHomePhone;
    }

    /**
     * Access method for extension.
     *
     * @return the current value of extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Setter method for extension.
     *
     * @param aExtension the new value for extension
     */
    public void setExtension(String aExtension) {
        extension = aExtension;
    }

//    /**
//     * Access method for photo.
//     *
//     * @return the current value of photo
//     */
//    public Blob getPhoto() {
//        return photo;
//    }
//
//    /**
//     * Setter method for photo.
//     *
//     * @param aPhoto the new value for photo
//     */
//    public void setPhoto(Blob aPhoto) {
//        photo = aPhoto;
//    }

//    /**
//     * Access method for notes.
//     *
//     * @return the current value of notes
//     */
//    public Clob getNotes() {
//        return notes;
//    }
//
//    /**
//     * Setter method for notes.
//     *
//     * @param aNotes the new value for notes
//     */
//    public void setNotes(Clob aNotes) {
//        notes = aNotes;
//    }

    /**
     * Access method for photoPath.
     *
     * @return the current value of photoPath
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * Setter method for photoPath.
     *
     * @param aPhotoPath the new value for photoPath
     */
    public void setPhotoPath(String aPhotoPath) {
        photoPath = aPhotoPath;
    }

    /**
     * Access method for employeesM.
     *
     * @return the current value of employeesM
     */
//    public Set<Employees> getEmployeesM() {
//        return employeesM;
//    }
//
//    /**
//     * Setter method for employeesM.
//     *
//     * @param aEmployeesM the new value for employeesM
//     */
//    public void setEmployeesM(Set<Employees> aEmployeesM) {
//        employeesM = aEmployeesM;
//    }
//
//    /**
//     * Access method for employees.
//     *
//     * @return the current value of employees
//     */
//    public Employees getEmployees() {
//        return employees;
//    }
//
//    /**
//     * Setter method for employees.
//     *
//     * @param aEmployees the new value for employees
//     */
//    public void setEmployees(Employees aEmployees) {
//        employees = aEmployees;
//    }

    public Employees getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employees reportsTo) {
        this.reportsTo = reportsTo;
    }

    /**
     * Compares the key for this instance with another Employees.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Employees and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Employees)) {
            return false;
        }
        Employees that = (Employees) other;
        if (this.getEmployeeId() != that.getEmployeeId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Employees.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Employees)) {
            return false;
        }
        return this.equalKeys(other) && ((Employees)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getEmployeeId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Employees |");
        sb.append(" employeeId=").append(getEmployeeId());
        sb.append("]");
        return sb.toString();
    }

}

