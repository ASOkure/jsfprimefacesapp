package com.aksam.jsfprimefacesap.controller;



import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;

import com.aksam.jsfprimefaceapp.converter.CarConverter;
import com.aksam.jsfprimefaceapp.model.Car;
import com.aksam.jsfprimefaceapp.utils.MessageUtil;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Named
@ViewScoped
public class TabViewBean implements Serializable {

    public List<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }

    public void onTabChange(TabChangeEvent event) {
        MessageUtil.addInfoMessage("tab.changed", "Title: " + event.getTab().getTitle());
    }

    public void onTabClose(TabCloseEvent event) {
        MessageUtil.addInfoMessage("tab.closed", "Closed Tab: " + event.getTab().getTitle());
    }
}