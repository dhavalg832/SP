package Student;

import java.util.ArrayList;
import java.util.Iterator;

public class studentInfo {
    ArrayList<String> arrayofnames = new ArrayList<String>();
    ArrayList<String> section = new ArrayList<String>();
    ArrayList<Float> marks = new ArrayList<Float>();
    ArrayList<Long> mobilenumber = new ArrayList<Long>();
    int i = 0;

    public void data(String s, String s1, long s2, Float s3) {

        System.out.println("   " + s + "   " + s1 + "   " + s2 + "   " + s3 + "");
        arrayofnames.add(s);
        section.add(s1);
        marks.add(s3);
        mobilenumber.add(s2);
        i++;
        System.out.println(i);
        System.out.println("\n hi");
    }

    public void print() {
        System.out.println("\n");
        for (int m = 0; m < i; m++) {
            System.out.println("Name of student  " + (m + 1));
            System.out.println(arrayofnames.get(m));
            System.out.println("Section of student  " + (m + 1));
            System.out.println(section.get(m));
            System.out.println("Marks of student  " + (m + 1));
            System.out.println(marks.get(m));
            System.out.println("Phone number of student  " + (m + 1));
            System.out.println(mobilenumber.get(m) + "\n");
        }
    }
}
