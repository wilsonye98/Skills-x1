package main;

import inventory.Product;
import inventory.Inventory;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 12;
        product.productName = "Chocolate Bar";
        product.price = 3.50;

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 150;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 55;
        warehouse.warehouseName = "Jerry's Factory";
        warehouse.inventories = "Chocolate Bar";

        System.out.println(product.productId);
        System.out.println(product.productName);
        System.out.println(product.price = 3.50);

        System.out.println(inventory.product);
        System.out.println(inventory.quantity);

        System.out.println(warehouse.warehouseId);
        System.out.println(warehouse.warehouseName);
        System.out.println(warehouse.inventories);
    }
}
