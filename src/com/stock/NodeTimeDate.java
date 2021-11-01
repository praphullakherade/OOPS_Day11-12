package com.stock;

public class NodeTimeDate {
    int data;
    NodeTimeDate next;
    int action=0;
    String date;
    NodeTimeDate(int data,int action,String date){
        this.data=data;
        this.next=null;
        this.action=action;
        this.date=date;
    }
}
