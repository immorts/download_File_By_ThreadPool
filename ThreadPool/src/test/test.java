package test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: test
 * @Description: TODO
 * @author: immorts
 * @date: 2022/3/13  8:06 下午
 */
public class test {
    public static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }




    public static ListNode moveNode(ListNode node, int k) {
        List<Integer> lst = new LinkedList<>();
        ListNode head = new ListNode(0);
        head.next = node;
        ListNode index = head;
        ListNode trail = new ListNode(0);
        while(index.next != null){
            if(index.next.val > k){
                lst.add(index.next.val);
                index.next = index.next.next;
            } else {
                index = index.next;
            }
            if(index.next == null){
                trail = index;
            }
        }
        for(int i = 0;i < lst.size();i++){
            trail.next = new ListNode(lst.get(i));
            trail = trail.next;
        }
        ListNode ne = head.next;
        while(ne != null){
            System.out.print(ne.val + " ");
            ne = ne.next;
        }
        System.out.println();

        return head.next;
    }

    public static ListNode MergeList(ListNode l1, ListNode l2) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        while(l1 != null){
            list1.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            list2.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(list1);
        Collections.sort(list2);

        ListNode begin = new ListNode(0);
        ListNode end = begin;
        ListNode tmp;
        int i = 0,j = 0;
        int size1 = list1.size(),size2 = list2.size();
        while(i < size1 || j < size2){
            int a = i < size1 ? list1.get(i) : Integer.MAX_VALUE;
            int b = j < size2 ? list2.get(j) : Integer.MAX_VALUE;
            if(a < b){
                tmp = new ListNode(a);
                i++;
            } else {
                tmp = new ListNode(b);
                j++;
            }
            end.next = tmp;
            end = tmp;
        }
        ListNode ne = new ListNode(0);
        while(ne != null){
            System.out.println(ne.val);
            ne = ne.next;
        }

        return begin.next;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{4,20,6,15,8,5};
        int[] array2 = new int[]{9,8,7,6};
        ListNode begin1 = new ListNode(0);
        ListNode end1 = begin1;
        ListNode begin2 = new ListNode(0);
        ListNode end2 = begin2;
        for(int i = 0;i < array1.length;i++){
            end1.next = new ListNode(array1[i]);
            end1 = end1.next;
        }
        for(int i = 0;i < array2.length;i++){
            end2.next = new ListNode(array2[i]);
            end2 = end2.next;
        }
        ListNode ne = begin1.next;
        while(ne != null){
            System.out.print(ne.val + " ");
            ne = ne.next;
        }
        System.out.println();



        moveNode(begin1.next,10);


    }
}
