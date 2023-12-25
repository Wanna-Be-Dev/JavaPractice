package com.company;

public class Student{
    protected int idNumber;
    protected String name;
    protected int score;
    public Student(int id, String name,int score) {
        this.idNumber = id;
        this.name = name;
        this.score=score;
    }

    public static void sorter(Student[] Students) {
        for (int i=0;i<Students.length;i++){
            if(i==0) i++;
            int j=i-1;
            Student key=Students[i];
            while (Students[j].idNumber>key.idNumber && j>=0){
                Students[j+1]=Students[j];
                j-=1;
            }
            Students[j+1]=key;
        }

    }
    public static void main(String[]args)
    {
        Student first=new Student(1,"Max",4);
        Student second=new Student(2,"Andrey",4);
        Student third=new Student(3,"Petya",5);

        Student[] Students ={first,third,second};
        for (int i = 0; i < Students.length; i++) {
            System.out.println("Id: "+Students[i].idNumber+" name is "+Students[i].name+" and score is "+Students[i].score);
        }
        sorter(Students);
        for (int i = 0; i < Students.length; i++) {
            System.out.println("Id: "+Students[i].idNumber+" name is "+Students[i].name+" and score is "+Students[i].score);
        }

    }
}