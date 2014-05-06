/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.model;

/**
 *
 * @author jroyo
 */
public class Corporate {
    private int id;
    private String corporatename;
    private String fantasyname;
    private String cnpj;
    private String ie;
    private String address;
    private String num;
    private String phone;
    private String contact;
    private String city;
    private String uf;
    private String phone2;
    private boolean active;
    
    public Corporate(){}
    
    public Corporate(String corporatename, String fantasyname, String cnpj, String ie, String address, String num, String phone, String phone2, String contact, String city, String uf, boolean active) {
        this.corporatename = corporatename;
        this.fantasyname = fantasyname;
        this.cnpj = cnpj;
        this.ie = ie;
        this.address = address;
        this.num = num;
        this.phone = phone;
        this.phone2 = phone2;
        this.contact = contact;
        this.city = city;
        this.uf = uf;
        this.active = active;
    }


    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorporatename() {
        return corporatename;
    }

    public void setCorporatename(String corporatename) {
        this.corporatename = corporatename;
    }

    public String getFantasyname() {
        return fantasyname;
    }

    public void setFantasyname(String fantasyname) {
        this.fantasyname = fantasyname;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
