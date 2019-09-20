package com.aksam.jsfprimefacesap.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class FragmentBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;

    private String address;

    public void saveUserInfo() {
        System.out.println("User Info saved");
    }

    public void saveAddressInfo() {
        System.out.println("Address Info saved");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
