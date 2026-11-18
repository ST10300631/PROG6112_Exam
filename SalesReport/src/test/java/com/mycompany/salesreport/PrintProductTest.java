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
public class PrintProductTest {
    
    public PrintProductTest() {
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
     * Test of getTotalProductsSold method, of class PrintProduct.
     */
    @org.junit.jupiter.api.Test
    public void testGetTotalProductsSold() {
        System.out.println("getTotalProductsSold");
        PrintProduct instance = null;
        int expResult = 0;
        int result = instance.getTotalProductsSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAverageProductSold method, of class PrintProduct.
     */
    @org.junit.jupiter.api.Test
    public void testGetAverageProductSold() {
        System.out.println("getAverageProductSold");
        PrintProduct instance = null;
        double expResult = 0.0;
        double result = instance.getAverageProductSold();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMostPopularProduct method, of class PrintProduct.
     */
    @org.junit.jupiter.api.Test
    public void testGetMostPopularProduct() {
        System.out.println("getMostPopularProduct");
        PrintProduct instance = null;
        String expResult = "";
        String result = instance.getMostPopularProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateReport method, of class PrintProduct.
     */
    @org.junit.jupiter.api.Test
    public void testGenerateReport() {
        System.out.println("generateReport");
        PrintProduct instance = null;
        instance.generateReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
