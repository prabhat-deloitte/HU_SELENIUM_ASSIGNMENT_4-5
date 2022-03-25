package Css;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Css_fetch {

    static  ArrayList<ArrayList<String>> outer_list = new ArrayList<ArrayList<String>>();
       static ArrayList<ArrayList<String>> Csv_List(){
            try {

                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\praparihar\\IdeaProjects\\Assignment 5\\HU_JAVA_TRACK\\Java_Track_main_Assignment\\src\\Book1.csv"));
                String line = "";
                line = br.readLine();
                int n = -1;

                ArrayList<String> inner_list = new ArrayList<>();


                while ((line = br.readLine()) != null) {
                    n++;
                    inner_list = new ArrayList<>();

                    String [] list1 = line.split(",");


                    for (int i =0; i<2; i++){

                        inner_list.add(list1[i]);
                    }

                    outer_list.add(inner_list);


                }

            } catch ( IOException e) {
                System.out.println("some error happen");
            }
           return outer_list;
        }
    public static void main(String[] args) {
        Csv_List();
    }

    }

