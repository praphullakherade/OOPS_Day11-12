package com.stock;

public class NodeForCompanyShare {
    int data;
    String companyName;
    NodeForCompanyShare next;

    public NodeForCompanyShare(int data, String companyName) {
        this.data=data;
        this.next=null;
        this.companyName=companyName;
    }
}
