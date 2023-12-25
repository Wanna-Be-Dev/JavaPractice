package com.company;
import java.util.Arrays;

public class StudentMerger {
    protected int idNumber;
    protected String name;
    protected int score;
    public StudentMerger(int id, String name,int score) {
        this.idNumber = id;
        this.name = name;
        this.score=score;
    }

    public static StudentMerger[] sorter(StudentMerger[] arrayA, StudentMerger[] arrayB){
        StudentMerger[] mergedArray = new StudentMerger[arrayA.length + arrayB.length];

        int i=0, j=0, k=0;

        while (i < arrayA.length)
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        }

        while (j < arrayB.length)
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        }

        for (int q=0;q<mergedArray.length;q++){
            if(q==0) q++;
            int h=q-1;
            StudentMerger key=mergedArray[q];
            while (mergedArray[h].idNumber>key.idNumber && h>=0){
                mergedArray[h+1]=mergedArray[h];
                h-=1;
            }
            mergedArray[h+1]=key;
        }

        return mergedArray;
    }
    public static void main(String[]args)
    {
        StudentMerger first=new StudentMerger(1,"Max",4);
        StudentMerger second=new StudentMerger(2,"Andrey",3);
        StudentMerger third=new StudentMerger(3,"Petya",5);

        StudentMerger first1=new StudentMerger(6,"Kate",8);
        StudentMerger second1=new StudentMerger(4,"Ann",9);
        StudentMerger third1=new StudentMerger(5,"Helen",10);

        StudentMerger[] Students ={first,third,second};
        StudentMerger[] Students1 ={first1,third1,second1};
        for (int i = 0; i < Students.length; i++) {
            // System.out.println("Id: "+Students[i].idNumber+" name is "+Students[i].name+" and score is "+Students[i].score);
        }
        StudentMerger[] Students3=sorter(Students,Students1);
        for (int i = 0; i < Students3.length; i++) {
            System.out.println("Id: "+Students3[i].idNumber+" name is "+Students3[i].name+" and score is "+Students3[i].score);
        }
    }
}
