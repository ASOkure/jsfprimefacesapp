package com.aksam.jsfprimefacesap.controller;

import javax.faces.view.ViewScoped;
import javax.inject.Named;



import com.aksam.jsfprimefaceapp.converter.CarConverter;
import com.aksam.jsfprimefaceapp.model.Car;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class ScrollPanelBean implements Serializable {

    public List<Car> getCars() {
        return new ArrayList<Car>(CarConverter.cars.values());
    }
}
