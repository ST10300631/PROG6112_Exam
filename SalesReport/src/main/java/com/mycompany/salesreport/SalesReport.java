package com.mycompany.salesreport;

import java.util.Scanner;

// Interface defining the required sales calculations
interface IProduct {
    int getTotalProductsSold();
    double getAverageProductSold();
    String getMostPopularProduct();
}

// Class implementing the interface to process and print the report
class PrintProduct implements IProduct {
    private String[] products;
    private int[][] sales;

    public PrintProduct(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int getTotalProductsSold() {
        int grandTotalSold = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                grandTotalSold += sales[i][j];
            }
        }
        return grandTotalSold;
    }

    @Override
    public double getAverageProductSold() {
        if (products.length == 0) {
            return 0.0;
        }
        return (double) getTotalProductsSold() / products.length;
    }

    @Override
    public String getMostPopularProduct() {
        int highestProductTotal = -1;
        String mostPopularProduct = "";

        for (int i = 0; i < products.length; i++) {
            int currentProductSum = 0;
            for (int j = 0; j < sales[i].length; j++) {
                currentProductSum += sales[i][j];
            }

            if (currentProductSum > highestProductTotal) {
                highestProductTotal = currentProductSum;
                mostPopularProduct = products[i] + " (" + highestProductTotal + " sold)";
            }
        }
        return mostPopularProduct;
    }

    public void generateReport() {
        System.out.println("\nProduct SALES REPORT - 2026");
        System.out.println("***********************************************************");
        System.out.println("Total Product Sales: " + getTotalProductsSold());
        System.out.printf("Average Product Sales: %.2f%n", getAverageProductSold());
        System.out.println("Most Popular Product (Highest Sales): " + getMostPopularProduct());

    }
}

public class SalesReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define product names and months
        String[] products = {"Cozy Nights mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        String[] months = {"Month 1", "Month 2", "Month 3"};

        // 2D array to store sales: rows = products, columns = months
        int[][] sales = new int[products.length][months.length];

        // 1. Collect sales data from the user
        for (int i = 0; i < products.length; i++) {
            System.out.println("\nEnter number of sales for " + products[i] + ":");
            for (int j = 0; j < months.length; j++) {
                System.out.print("  " + months[j] + " sold: ");
                sales[i][j] = scanner.nextInt();
            }
        }

        // 2. Instantiate PrintProduct and display the formatted Sales Report
        PrintProduct report = new PrintProduct(products, sales);
        report.generateReport();

        scanner.close();
    }

    int getTotalProductsSold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double getAverageProductSold() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
