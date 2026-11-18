/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.salesreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class IProductTest {
    
    public IProductTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   
    /**
     * Test of getTotalProductsSold method, of class IProduct.
     */
    @org.junit.jupiter.api.Test
    public void testGetTotalProductsSold() {
        System.out.println("getTotalProductsSold");
        IProduct instance = new IProductImpl();
        int expResult = 0;
        int result = instance.getTotalProductsSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAverageProductSold method, of class IProduct.
     */
    @org.junit.jupiter.api.Test
    public void testGetAverageProductSold() {
        System.out.println("getAverageProductSold");
        IProduct instance = new IProductImpl();
        double expResult = 0.0;
        double result = instance.getAverageProductSold();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMostPopularProduct method, of class IProduct.
     */
    @org.junit.jupiter.api.Test
    public void testGetMostPopularProduct() {
        System.out.println("getMostPopularProduct");
        IProduct instance = new IProductImpl();
        String expResult = "";
        String result = instance.getMostPopularProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IProductImpl implements IProduct {

        public int getTotalProductsSold() {
            return 0;
        }

        public double getAverageProductSold() {
            return 0.0;
        }

        public String getMostPopularProduct() {
            return "";
        }
    }
    
}
