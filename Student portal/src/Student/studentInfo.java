package Student;

import java.util.ArrayList;
import java.util.Iterator;

public class studentInfo {
    ArrayList<String> arrayofnames = new ArrayList<String>();
    ArrayList<String> section = new ArrayList<String>();
    ArrayList<Integer> marks = new ArrayList<Integer>();
    ArrayList<Long> mobilenumber = new ArrayList<Long>();
    int a = 10;

    public void data(String s, String s1, long s2, int s3) {

        System.out.println("   " + s + "   " + s1 + "   " + s2 + "   " + s3 + "");
        arrayofnames.add(s);
        section.add(s1);
        marks.add(s3);
        mobilenumber.add(s2);
        System.out.println("\n hi");

        System.out.println(arrayofnames);
    }

    public void print() {

        Iterator itr = arrayofnames.iterator();
        String q = String.valueOf(itr.hasNext());
//        Iterator itr1 = section.iterator();
//        Iterator itr2 = marks.iterator();
//        Iterator itr3 = mobilenumber.iterator();
        System.out.println(q + "");
        do {

            System.out.println(itr.hasNext());
//            System.out.println(itr1.hasNext());
//            System.out.println(itr2.hasNext());
//            System.out.println(itr3.hasNext());
//
        }
        while (itr.hasNext());

        System.out.println("\n\n hi");
        System.out.println(arrayofnames);
        System.out.println(section);
        System.out.println(marks);
        System.out.println(mobilenumber);
    }
}