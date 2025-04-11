package AllCases;

import java.util.ArrayList;
import org.w3c.dom.html.HTMLIsIndexElement;

public class InventorSolution {

    public static void main(String[] args) {
        product phones = new product("phone", 3000, 272, "phones", 10);
        product tvs = new product("'tv'", 2000, 474, "TVs", 4);
        Inventory u = new Inventory();
        u.addProduct(phones);
        u.addProduct(tvs);
        u.printAllCollection();
        System.out.println("====================");
        if(u.checkForLowInventory(phones)){
            System.out.println("You Have more than 5 items of " + phones.getCategory());
        }else{
            System.out.println("You should to buy more items of " + phones.getCategory());
        }
        System.out.println("====================");
        if(u.checkForLowInventory(tvs)){
            System.out.println("You Have more than 5 items of " + tvs.getCategory());
        }else{
            System.out.println("You should to buy more items of " + tvs.getCategory());
        }
        System.out.println("====================");
        phones.removeItem();
        phones.removeItem();
        phones.removeItem();
        u.printAllCollection();
        System.out.println("====================");
    }

    public static class Inventory {
        ArrayList<product> products;

        public Inventory() {
            products = new ArrayList<>();
        }

        public void addProduct(product p) {
            products.add(p);
        }

        public void removeProduct(product p) {
            products.remove(p);
        }

        public boolean checkForLowInventory(product p) {
            if (p.itemsCount > 5)
                return true;
            return false;
        }

        public void printAllCollection() {
            for (product product : products) {
                System.out.println("=========================");
                System.out.println(" the Product name => " + product.getName());
                System.out.println(" the Product category => " + product.getCategory());
                System.out.println(" the Product ID => " + product.getId());
                System.out.println(" the Product Price => " + product.getPrice());
                System.out.println(" the size of product => " + product.getItemsCount());
                System.out.println("-------------------------------------------");
            }
        }

    }

    public static class product extends item {
        private String category;
        private int itemsCount;

        public product(String name, int price, int id, String category, int itemsCount) {
            super(name, price, id);
            this.category = category;
            this.itemsCount = itemsCount;
        }

        public void addItem() {
            this.itemsCount++;
        }

        public void removeItem() {
            this.itemsCount--;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getItemsCount() {
            return itemsCount;
        }

        public void setItemsCount(int itemsCount) {
            this.itemsCount = itemsCount;
        }

    }

    public static class item {
        private String name;
        private double price;
        private int id;

        public item(String name, double price, int id) {
            this.name = name;
            this.price = price;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}

/*
 * class called "Inventory" with a collection of products and methods to add and
 * remove products,
 * and to check for low inventory.
 */
