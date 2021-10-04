package com.sparta.sortmanager.model;

import com.sparta.sortmanager.controller.Sortable;

public class SortFactory {

    public static Sortable getSortable(String choice) {
        Sortable theSorter = null;
        // Switch statement would be better here
        if(choice.equals("b")){
            theSorter = new BubbleSort();
        }
        if(choice.equals("m")){
            theSorter = new MergeSort();
        }
        if(choice.equals("q")){
            theSorter = new QuickSort();
        }
        if(choice.equals("bin")){
            theSorter = new BinaryTreeSort();
        }
        return theSorter;
    }


}
