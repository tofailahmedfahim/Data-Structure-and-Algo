package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinaryHeap {

    private static final int d= 2;
    private int[] heap;
    private int heapSize;

    /**
     * This will initialize our heap with default size.
     */
    public BinaryHeap(int capacity){
        heapSize = 0;
        heap = new int[ capacity+1];
        Arrays.fill(heap, -1);

    }

    /**
     *  This will check if the heap is empty or not
     *  Complexity: O(1)
     */
    public boolean isEmpty(){
        return heapSize==0;
    }

    /**
     *  This will check if the heap is full or not
     *  Complexity: O(1)
     */
    public boolean isFull(){
        return heapSize == heap.length;
    }


    private int parent(int i){
        return (i-1)/d;
    }

    private int kthChild(int i,int k){
        return d*i  +k;
    }

    /**
     *  This will insert new element in to heap
     *  Complexity: O(log N)
     *  As worst case scenario, we need to traverse till the root
     */
    public void insert(int x){
        if(isFull())
            throw new NoSuchElementException("Heap is full, No space to insert new element");
        heap[heapSize++] = x;
        heapifyUp(heapSize-1);
    }

    /**
     *  This will delete element at index x
     *  Complexity: O(log N)
     *
     */
    public int delete(int x){
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty, No element to delete");
        int key = heap[x];
        heap[x] = heap[heapSize -1];
        heapSize--;
        heapifyDown(x);
        return key;
    }

    /**
     *  This method used to maintain the heap property while inserting an element.
     *
     */
    private void heapifyUp(int i) {
        int temp = heap[i];
        while(i>0 && temp > heap[parent(i)]){
            heap[i] = heap[parent(i)];
            i = parent(i);
        }
        heap[i] = temp;
    }

    /**
     *  This method used to maintain the heap property while deleting an element.
     *
     */
    private void heapifyDown(int i){
        int child;
        int temp = heap[i];
        while(kthChild(i, 1) < heapSize){
            child = maxChild(i);
            if(temp < heap[child]){ heap[i] = heap[child]; }else break; i = child; } heap[i] = temp; } private int maxChild(int i) { int leftChild = kthChild(i, 1); int rightChild = kthChild(i, 2); return heap[leftChild]>heap[rightChild]?leftChild:rightChild;
    }

    /**
     *  This method used to print all element of the heap
     *
     */
    public void printHeap()
    {
        System.out.print("nHeap = ");
        for (int i = 0; i < heapSize; i++)
            System.out.print(heap[i] +" ");
        System.out.println();
    }
    /**
     *  This method returns the max element of the heap.
     *  complexity: O(1)
     */
    public int findMax(){
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty.");
        return heap[0];
    }

    public static void main(String[] args){
        BinaryHeap maxHeap = new BinaryHeap(50);
        int[] arr = {8,27,13,15,32,20,12,50,29,11};
        maxHeap.insert(arr[0]);
        maxHeap.insert(arr[1]);
        maxHeap.insert(arr[2]);
        maxHeap.insert(arr[3]);
        maxHeap.insert(arr[4]);
        maxHeap.insert(arr[5]);
        maxHeap.insert(arr[6]);
        maxHeap.insert(arr[7]);
        maxHeap.insert(arr[8]);
        maxHeap.insert(arr[9]);

        maxHeap.printHeap();
        maxHeap.insert(14);
        maxHeap.insert(18);
        maxHeap.insert(30);
        maxHeap.insert(31);

        maxHeap.printHeap();

    //delete element with index from heap
        maxHeap.delete(7);
        maxHeap.printHeap();

    }
}