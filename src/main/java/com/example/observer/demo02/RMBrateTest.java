package com.example.observer.demo02;

/**
 * @author hzq
 * @date 2019/7/15 12:40
 */
public class RMBrateTest {

    public static void main(String[] args) {
        Company company = new ImportCompany();
        Company company1 = new ExportCompany();

        Rate rate = new RMBrate();
        rate.add(company);
        rate.add(company1);

        rate.change(1);
    }
}
