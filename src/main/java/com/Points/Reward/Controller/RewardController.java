package com.Points.Reward.Controller;

import com.Points.Reward.Model.Customer;
import com.Points.Reward.Service.CustomerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RewardController {

    @Autowired
    private CustomerData customerData;

    //Getting all Customer data with their transactions.
    @GetMapping("/allCustomers")
    public List<Customer> getAllCusData() {
       return customerData.showList();
    }

    //Getting Customer Reward Points using Customer_name for Total Rewards.
    @GetMapping("/points/total/{cust_name}")
    public String getRewardPointsByName(@PathVariable("cust_name") String cus_name) {
        return customerData.rewardPoints(cus_name);
    }

    //Getting Customer Reward Points using Customer_name & Month.
    @GetMapping("/points/{cust_name}/month/{month}")
    public String getRewardPointsByMonthAndName(@PathVariable("cust_name") String cust_name, @PathVariable("month") String month) {
        return customerData.rewardPointsByMonth(cust_name, month);
    }


}
