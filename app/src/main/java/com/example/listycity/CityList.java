package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is a class keeps a list of city properties.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether the specified city exists in the list.
     * @param city
     *      This is the city to be looked for
     * @return
     *      {@code true} if the city is present in the list; {@code false} otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This deletes a city form the list
     * @param city
     *      This is the city to be deleted
     */
    public void delete(City city) {
        if (!hasCity(city)) {
            throw new NoSuchElementException("City not found in the list.");
        }
        cities.remove(city);
    }

    /**
     *
     * @return
     *      Return an Integer with the lists length
     */
    public int countCities() {
        return cities.size();
    }

}
