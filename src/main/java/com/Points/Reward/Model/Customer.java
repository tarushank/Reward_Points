package com.Points.Reward.Model;

public class Customer {

    private int transaction_id;
    private int customer_id;
    private String name;
    private int total_cost;
    private String Month;

    public Customer() {}

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(int total_cost) {
        this.total_cost = total_cost;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public Customer(int transaction_id, int customer_id, String name, int total_cost, String month) {
        super();
        this.transaction_id = transaction_id;
        this.customer_id = customer_id;
        this.name = name;
        this.total_cost = total_cost;
        Month = month;
    }


}
