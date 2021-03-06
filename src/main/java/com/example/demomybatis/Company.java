package com.example.demomybatis;

import lombok.Data;

import java.util.List;

@Data
public class Company {
    private int id;
    private String name;
    private String address;
    private List<Employee> employeeList;  // 회사에 다니고 있는 직원들 목록
}
