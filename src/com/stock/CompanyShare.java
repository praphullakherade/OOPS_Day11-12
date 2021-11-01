package com.stock;

public class CompanyShare {
    NodeForCompanyShare head;

    // add at last
    public void addNode(int data, String companyName) {
        NodeForCompanyShare node = new NodeForCompanyShare(data, companyName);
        if (head == null) {
            head = node;
        } else {
            NodeForCompanyShare temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void delete(String company) {


        NodeForCompanyShare temp = head, prev = null;

        if (temp != null && temp.companyName == company) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.companyName != company) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;

    }

    // Printing
    public void printList() {
        NodeForCompanyShare temp = head;
        while (temp != null) {
            System.out.println(temp.companyName + ":" + temp.data);
            temp = temp.next;
        }
        System.out.println("");
    }

}
