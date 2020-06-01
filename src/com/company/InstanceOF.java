package com.company;
import java.util.*;

class Student{}
class Rockstar{}
class Hacker{}

public class InstanceOF {
    static String count(ArrayList mylist){
        int sumStudents = 0;
        int sumRockstar = 0;
        int sumHacker = 0;
        for(int i = 0; i < mylist.size(); i++){
            Object element=mylist.get(i);
            if(element instanceof Student)
                sumStudents++;
            if(element instanceof Rockstar)
                sumRockstar++;
            if(element instanceof Hacker)
                sumHacker++;
        }
        String ret = Integer.toString(sumStudents)+" "+ Integer.toString(sumRockstar)+" "+ Integer.toString(sumHacker);
        return ret;
    }

    public static void main(){
        ArrayList mylist = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberStudents = input.nextInt();
        for(int i = 0; i < numberStudents; i++){
            String s = input.next();
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}
