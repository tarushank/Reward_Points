package com.Points.Reward.Service;

import com.Points.Reward.Model.Customer;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerData {

    public List<Customer> showList() {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(101, 1, "Tom", 120, "June"));
        list.add(new Customer(102, 1, "Tom", 220, "June"));
        list.add(new Customer(103, 1, "Tom", 12, "June"));
        list.add(new Customer(104, 1, "Tom", 90, "July"));
        list.add(new Customer(105, 1, "Tom", 52, "July"));
        list.add(new Customer(106, 1, "Tom", 70, "July"));
        list.add(new Customer(107, 2, "John", 15, "June"));
        list.add(new Customer(108, 2, "John", 330, "June"));
        list.add(new Customer(109, 2, "John", 120, "June"));
        list.add(new Customer(110, 2, "John", 120, "July"));
        list.add(new Customer(111, 2, "John", 120, "July"));

        return list;
    }

    public String rewardPoints(String cust_name) {

        List<Customer> list = new ArrayList<>();
        list.add(new Customer(101, 1, "Tom", 120, "June"));
        list.add(new Customer(102, 1, "Tom", 220, "June"));
        list.add(new Customer(103, 1, "Tom", 12, "June"));
        list.add(new Customer(104, 1, "Tom", 90, "July"));
        list.add(new Customer(105, 1, "Tom", 52, "July"));
        list.add(new Customer(106, 1, "Tom", 70, "July"));
        list.add(new Customer(107, 2, "John", 15, "June"));
        list.add(new Customer(108, 2, "John", 330, "June"));
        list.add(new Customer(109, 2, "John", 120, "June"));
        list.add(new Customer(110, 2, "John", 120, "July"));
        list.add(new Customer(111, 2, "John", 120, "July"));

        int points = 0;

        for(Customer cust : list) {
            if(cust.getName().equals(cust_name)) {
                int cost = cust.getTotal_cost();
                if(cost > 50) {
                    int tempCost = cost - 50;
                    if(tempCost < 50) { points += tempCost;} else {
                        points += ((cost - 100) * 2) + 50;}
                }
            }
        }

        String result = "Total Rewards earned by "+cust_name+ " is " +points;

        return result;
    }

    public String rewardPointsByMonth(String cust_name, String month) {

        List<Customer> list = new ArrayList<>();
        list.add(new Customer(101, 1, "Tom", 120, "June"));
        list.add(new Customer(102, 1, "Tom", 220, "June"));
        list.add(new Customer(103, 1, "Tom", 12, "June"));
        list.add(new Customer(104, 1, "Tom", 90, "July"));
        list.add(new Customer(105, 1, "Tom", 52, "July"));
        list.add(new Customer(106, 1, "Tom", 70, "July"));
        list.add(new Customer(107, 2, "John", 15, "June"));
        list.add(new Customer(108, 2, "John", 330, "June"));
        list.add(new Customer(109, 2, "John", 120, "June"));
        list.add(new Customer(110, 2, "John", 120, "July"));
        list.add(new Customer(111, 2, "John", 120, "July"));

        int points = 0;

        for(Customer cust : list) {

            if(cust.getName().equals(cust_name) && cust.getMonth().equals(month)) {

                int cost = cust.getTotal_cost();

                if(cost > 50) {

                    int tempCost = cost - 50;

                    if(tempCost < 50) {
                        points += tempCost;
                    }
                    else {
                        points += ((cost - 100) * 2) + 50;
                    }
                }
            }
        }

        return cust_name+" earned :" +points+ " points in the month of " +month;
    }

}
