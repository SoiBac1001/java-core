package java_core.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        {
            //Create a HashMap with mutable key
            HashMap<Account, String> map = new HashMap<Account, String>();

            //Create key 1
            Account a1 = new Account(1);
            a1.setHolderName("A_ONE");
            //Create key 2
            Account a2 = new Account(2);
            a2.setHolderName("A_TWO");

            //Put mutable key and value in map
            map.put(a1, a1.getHolderName());
            map.put(a2, a2.getHolderName());

            //Change the keys state so hash map should be calculated again
            a1.setHolderName("Defaulter");
            a2.setHolderName("Bankrupt");

            //Success !! We are able to get back the values
            System.out.println(map.get(a1)); //Prints A_ONE
            System.out.println(map.get(a2)); //Prints A_TWO

            //Try with newly created key with same account number
            Account a3 = new Account(1);
            a3.setHolderName("A_THREE");
            map.put(a3, a3.getHolderName());

            //Success !! We are still able to get back the value for account number 1
            System.out.println(map.get(a3)); //Prints A_ONE
        }

        testMap();
//        testCompute();
        testComputeIfAbsent();
//        testComputeIfPresent();
    }

    private static void testMap() {
        // Initializing a Map of type HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        System.out.println(map);

        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "Ten");
        mp.put(30, "Thirty");
        mp.put(50, "Fifty");

        map.putAll(mp);

        System.out.println(map);
    }

    private static void testCompute() {
        // create an HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        // recompute the value of Shoes with 10% discount
        int newPrice = prices.compute("Shoes", (key, value) -> value - value * 10/100);
        System.out.println("Discounted Price of Shoes: " + newPrice);

        // if key is not existed, the programing will throw NullPointerException exception
        int newPrice2 = prices.compute("abcd", (key, value) -> value - value * 10/100);
        System.out.println("Discounted Price of Shoes: " + newPrice2);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);
    }

    private static void testComputeIfAbsent() {
        System.out.println("==================================");
        // create an HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        // compute the value of Shirt
        int shirtPrice = prices.computeIfAbsent("Shirt", key -> 280);
        System.out.println("Price of Shirt: " + shirtPrice);

        // if key is existed, the programing will not compute the new value for existed key
        int shirtPrice2 = prices.computeIfAbsent("Shoes", key -> 280);
        System.out.println("Price of Shirt: " + shirtPrice2);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);
        System.out.println("==================================");
    }

    private static void testComputeIfPresent() {
        System.out.println("==================================");
        // create an HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        // recompute the value of Shoes with 10% VAT
        int shoesPrice = prices.computeIfPresent("Shoes", (key, value) -> value + value * 10/100);
        System.out.println("Price of Shoes after VAT: " + shoesPrice);

        // if key is not existed, the programing will throw NullPointerException exception
        int shoesPrice2 = prices.computeIfPresent("abcd", (key, value) -> value + value * 10/100);
        System.out.println("Price of Shoes after VAT: " + shoesPrice2);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);
        System.out.println("==================================");
    }
}

class Account {
    private int accountNumber;
    private String holderName;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    //Depends only on account number
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNumber;
        return result;
    }

    //Compare only account numbers
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber)
            return false;
        return true;
    }
}
