package com.stock;

public class DateTimeTransaction {
    NodeTimeDate head;

    //add element to stack
    public void addNode(int data,int action,String date) {
        NodeTimeDate node = new NodeTimeDate(data,action,date);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //print stack
    public void printList() {
        NodeTimeDate temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            if(temp.action==0) {
                System.out.print("purcsese at ->"+temp.date);
            }else {
                System.out.print("sold at ->"+temp.date);
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    //deleting element
    public void deleteHead() {
        System.out.println("deleting head node");
        NodeTimeDate temp=head;
        if(temp!=null) {
            head=temp.next;
        }
    }
}
