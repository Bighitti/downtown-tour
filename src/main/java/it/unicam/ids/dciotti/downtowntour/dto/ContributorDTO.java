package it.unicam.ids.dciotti.downtowntour.dto;

import java.util.Date;

public class ContributorDTO {
    private Integer id;
    private String firstname;
    private String lastname;
    private Date birthday;
    private String email;
    private String phone;
    private String address;
    private String fiscalCode;
    private CuratorDTO authorizedBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public CuratorDTO getAuthorizedBy() {
        return authorizedBy;
    }

    public void setAuthorizedBy(CuratorDTO authorizedBy) {
        this.authorizedBy = authorizedBy;
    }
}
