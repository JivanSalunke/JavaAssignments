package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class fileIO {

    public void read_Sort_Write(String path1, String path2) throws IOException {
        ArrayList<Integer> first_list=get_Array_from_file(path1);
        ArrayList<Integer> second_list=get_Array_from_file(path2);
        ArrayList<Integer> sorted_list=sort(first_list,second_list);
        write_To_File(sorted_list);
    }
    private ArrayList<Integer> get_Array_from_file(String path) throws FileNotFoundException {
        ArrayList<Integer> ans= new ArrayList<>();
        File file = new File(path);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            ans.add(sc.nextInt());
        return ans;
    }
    private void write_To_File(ArrayList<Integer> list) throws IOException {
        FileWriter writer = new FileWriter("C:/Users/JSA334/IdeaProjects/java-basics/files/out.txt");
        for(int str: list) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
        System.out.println("Sorted and added in out.txt successfully");
    }
    private ArrayList<Integer> sort(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> final_list=new ArrayList<>();
        Collections.sort(list1);
        Collections.sort(list2);

        int i=0,j=0;
        int x=list1.size(), y=list2.size();
        while (i<x && j<y){
            int a=list1.get(i);
            int b=list2.get(j);
            if(a<=b){
                final_list.add(a);
                i++;
            }else {
                final_list.add(b);
                j++;
            }
        }
        while(i<x){
            final_list.add(list1.get(i));
            i++;
        }
        while (j<y){
            final_list.add(list1.get(j));
            j++;
        }
        return final_list;
    }
}
