import java.util.*;

import java.io.*;

import java.lang.*;

public class ReadFolderfFiles1{

public static void main (String args[]){

 

FileReader reader;

String result="";

String word= new String();

String target = "friend";

 

        try {

 File directory = new File("E:/Novels");

reader = new FileReader (directory);       

Scanner scan = new Scanner(reader);

 

while(scan.hasNext()){ 

result = scan.findWithinHorizon(target,0);

if(result!=null) {
word = (scan.next() + scan.findWithinHorizon("", 0));

ArrayList<String> names = new ArrayList<String>();

names.add(word);

for (int j=0; j< names.size(); j++) {

System.out.println(names.get(j));}



  }

  }

scan.close();

 }

catch(Exception e){ System.err.println(e.getMessage()); }

 } }
