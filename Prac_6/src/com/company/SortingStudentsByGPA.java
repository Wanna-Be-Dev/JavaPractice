package com.company;

public class SortingStudentsByGPA {
    protected int idNumber;
    protected String name;
    protected int score;
    public SortingStudentsByGPA(int id, String name,int score) {
        this.idNumber = id;
        this.name = name;
        this.score=score;
    }
 // quicksort
    public static void sorter(SortingStudentsByGPA[] Students,int low, int high) {
        if (Students.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = Students[middle].score;

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (Students[i].score < opora) {
                i++;
            }

            while (Students[j].score > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                SortingStudentsByGPA temp = Students[i];
                Students[i] = Students[j];
                Students[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sorter(Students, low, j);

        if (high > i)
            sorter(Students, i, high);

    }
    public static void main(String[]args)
    {
        SortingStudentsByGPA first=new SortingStudentsByGPA(1,"Max",4);
        SortingStudentsByGPA second=new SortingStudentsByGPA(2,"Andrey",3);
        SortingStudentsByGPA third=new SortingStudentsByGPA(3,"Petya",5);

        SortingStudentsByGPA[] Students ={first,third,second};
        for (int i = 0; i < Students.length; i++) {
            System.out.println("Id: "+Students[i].idNumber+" name is "+Students[i].name+" and score is "+Students[i].score);
        }
        sorter(Students,0,Students.length-1);
        for (int i = 0; i < Students.length; i++) {
            System.out.println("Id: "+Students[i].idNumber+" name is "+Students[i].name+" and score is "+Students[i].score);
        }
    }
}
