package com.kodilla.stream.test;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Before
    public void before() {
        System.out.println("__________TEST__________ \n");
        System.out.println("\nStatus testu: ROZPOCZETY \n");
    }

    @After
    public void after() {

        System.out.println("\nStatus testu: ZAKONCZONY POMYSLNIE \n");
    }

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country country1 = new Country("CountryEu1", new BigDecimal("3213122"));
        Country country2 = new Country("CountryEu2", new BigDecimal("32123231"));
        Country country3 = new Country("CountryEu3", new BigDecimal("6542223"));
        Country country4 = new Country("CountryAm1", new BigDecimal("21312"));
        Country country5 = new Country("CountryAm2", new BigDecimal("32131231"));
        Country country6 = new Country("CountryAm3", new BigDecimal("9887789"));
        Country country7 = new Country("CountryAs1", new BigDecimal("214214142"));
        Country country8 = new Country("CountryAs2", new BigDecimal("2142141"));
        Country country9 = new Country("CountryAs3", new BigDecimal("213124"));

        Continent continent1 = new Continent("Eu");
        Continent continent2 = new Continent("Am");
        Continent continent3 = new Continent("As");

        //When
        continent1.addCountries(country1);
        continent1.addCountries(country2);
        continent1.addCountries(country3);
        continent2.addCountries(country4);
        continent2.addCountries(country5);
        continent2.addCountries(country6);
        continent3.addCountries(country7);
        continent3.addCountries(country8);
        continent3.addCountries(country9);

        World theWorld = new World();
        theWorld.addContinents(continent1);
        theWorld.addContinents(continent2);
        theWorld.addContinents(continent3);

        BigDecimal worldQuantity = theWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedWorldQuantity = BigDecimal.valueOf(300488315);
        Assert.assertEquals(expectedWorldQuantity, worldQuantity);

    }
}